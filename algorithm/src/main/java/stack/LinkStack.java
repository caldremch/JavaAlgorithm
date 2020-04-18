package stack;

import thread.S;

public class LinkStack<T> implements IStack<T> {

    class StackNode{
        T data;
        StackNode next;
        public StackNode(T data) {
            this.data = data;
        }
    }

    private StackNode head;
    int currentSize = 0;

    @Override
    public boolean isEmpty() {
        return currentSize == 0;
    }

    @Override
    public T pop() {
        StackNode stackNode = head;
        T d = stackNode.data;
        stackNode.data = null;
        stackNode = null;
        head = head.next;
        currentSize--;
        return d;
    }

    @Override
    public void push(T data) {
        StackNode stackNode = new StackNode(data);
        stackNode.next = head;
        head = stackNode;
        currentSize++;
    }

    @Override
    public int size() {
        return currentSize;
    }

    @Override
    public T peek() {
        if (head == null) throw new RuntimeException("no data!!");
        return head.data;
    }


    public static void main(String[] args) {

        LinkStack<Integer> stack = new LinkStack<>();
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
