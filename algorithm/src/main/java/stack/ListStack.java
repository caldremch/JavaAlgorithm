package stack;


public class ListStack<T> implements IStack<T>{

    private int default_capacity = 10;
    private T[] tables;
    int currentSize = 0;
    private int capacity = 0;

    @Override
    public boolean isEmpty() {
        return currentSize == 0;
    }

    @Override
    public T pop() {
        if (currentSize == 0) return null;
        T t = tables[currentSize-1];
        tables[currentSize] = null;
        currentSize--;
        return t;
    }

    @Override
    public void push(T data) {
        checkResize();
        tables[currentSize++] = data;
    }

    private void checkResize() {

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
        return tables[currentSize-1];
    }


    public static void main(String[] args) {

        ListStack<Integer> stack = new ListStack<>();
        System.out.println(stack.isEmpty());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        stack.push(11);
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
    }
}
