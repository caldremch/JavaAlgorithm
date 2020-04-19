package queue;

import java.util.Deque;

public interface IQueue<T> {
    boolean isEmpty();
    T pop();
    void push(T data);
    int size();
    T peek();//return top
}
