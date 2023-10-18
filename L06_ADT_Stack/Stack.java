package L06_ADT_Stack;

public interface Stack<T> {
    public boolean empty();
    public boolean full();
    public void push(T e);
    public T pop();
}
