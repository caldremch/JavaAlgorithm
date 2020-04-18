package stack;

public interface IStack<T> {

    boolean isEmpty();
    T pop();
    void push(T data);
    int size();
    T peek();//return top

}
