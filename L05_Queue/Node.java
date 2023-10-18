package L05_Queue;

/*
 * Node Specification:
 * 
 * Represents a node in a singly linked list.
 * Each node contains:
 * 1. Data of generic type T.
 * 2. A reference to the next node in the list (if it exists).
 */

public class Node<T> {
    public T data;           // Holds the data for this node of type T
    public Node<T> next;     // Reference to the next node in the list

    // Default constructor initializes an empty node
    public Node() {
        data = null;
        next = null;
    }

    // Constructor that initializes a node with provided data
    public Node(T data) {
        this.data = data;
        next = null;
    }
}
