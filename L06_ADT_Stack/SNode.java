package L06_ADT_Stack;

public class SNode<T> {
    public T data;
    public SNode<T> next;

    public SNode() {
        data = null;
        next = null;
    }

    public SNode(T data) {
        this.data = data;
        next = null;
    }
}
