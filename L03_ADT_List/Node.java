package L03_ADT_List;

public class Node<T> {
    public T data; // Data stored in the node.
    public Node<T> next; // Reference to the next node in the linked list.

    // Default constructor: Initializes data and next to null.
    public Node() {
        this.data = null;
        this.next = null;
    }

    // Constructor with data parameter: Initializes data with the provided value,
    // and sets next to null (indicating that this node is initially not connected to any other node).
    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}
