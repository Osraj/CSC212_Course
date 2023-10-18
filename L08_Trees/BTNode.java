package L08_Trees;

public class BTNode<T> {
    public T data;
    public BTNode<T> left, right;

    public BTNode(T data) {
        this.data = data;
        left = right = null;
    }

    public BTNode(T data, BTNode<T> left, BTNode<T> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
    
}
