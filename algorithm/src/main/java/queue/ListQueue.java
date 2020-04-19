package queue;

public class ListQueue<T> implements IQueue<T> {

    private int front;//队头
    private int rear;//队尾

    private int default_capacity = 10;
    private T[] tables;
    private int currentSize = 0;
    private int capacity = 0;


    @Override
    public boolean isEmpty() {
        return front == 0 && rear == 0;
    }

    @Override
    public T pop() {
        currentSize--;
        if (rear == 0) {
            return null;
        }
        T data = tables[--rear];
        tables[rear] = null;
        return data;
    }

    @Override
    public void push(T data) {
        checkSize();
        currentSize++;
        if (currentSize == 1){
            tables[front] = tables[rear++] = data;
        }else{
            tables[rear++] = data;
        }
    }

    private void checkSize() {
            if (tables == null){
                capacity = default_capacity;
                tables = (T[]) new Object[capacity];
            }

            if ((currentSize +1)>capacity){
                int oldCapacity =  capacity;
                capacity = capacity<<1;
                T[] newTable = (T[]) new Object[capacity];
                for (int i = 0; i < oldCapacity; i++) {
                    newTable[i] = tables[i];
                }
                tables = newTable;
            }
    }

    @Override
    public int size() {
        return currentSize;
    }

    @Override
    public T peek() {
        return tables[rear-1];
    }


    public static void main(String[] args) {
        ListQueue<Integer> queue = new ListQueue<>();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);

        System.out.println(queue.peek());
        System.out.println(queue.size());
        System.out.println(queue.pop());
        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.isEmpty());
    }
}
