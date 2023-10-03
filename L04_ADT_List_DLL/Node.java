package L04_ADT_List_DLL;

/**
 * Node Specification:
 * 
 * Represents a node in a doubly linked list.
 * Each node contains:
 * 1. Data of generic type T.
 * 2. A pointer to the next node in the list (if it exists).
 * 3. A pointer to the previous node in the list (if it exists).
 */

public class Node<T> {
    public T data;           // Holds the data for this node of type T
    public Node<T> next;     // Pointer to the next node in the list
    public Node<T> previous; // Pointer to the previous node in the list

    // Default constructor initializes an empty node
    public Node(){
        data = null;
        next = null;
        previous = null;
    }

    // Constructor that initializes a node with provided data
    public Node(T data){
        this.data = data;
        next = null;
        previous = null;
    }
}
