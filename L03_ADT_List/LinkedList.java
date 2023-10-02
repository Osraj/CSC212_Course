package L03_ADT_List;

public class LinkedList<T> implements List<T>{
    
    private Node<T> head;      // Reference to the head node of the linked list.
    private Node<T> current;   // Reference to the current node in the linked list.

    public LinkedList() {
        head = current = null;  // Initialize both head and current to null when creating a new linked list.
    }

    public boolean empty() {
        return head == null;    // Check if the linked list is empty by examining if the head is null.
    }

    public boolean full() {
        return false;           // Since this is a dynamic data structure, it's never considered "full," so always return false.
    }

    public boolean last() {
        return current.next == null;  // Check if the current node is the last node by examining if its next reference is null.
    }

    public void findFirst() {
        current = head;     // Move the current reference to the first node (the head of the list).
    }

    public void findNext() {
        current = current.next;  // Move the current reference to the next node in the list.
    }

    public T retrieve() {
        return current.data;     // Return the data stored in the current node.
    }

    public void update(T e) {
        current.data = e;        // Update the data stored in the current node with the new value 'e'.
    }

    public void insert(T e) {
        Node<T> tmp;
        if (empty()) {
            current = head = new Node<T>(e);  // If the list is empty, create a new node and make it both the head and current node.
        } else {
            tmp = current.next;             // Store a reference to the next node in 'tmp'.
            current.next = new Node<T>(e);  // Create a new node with data 'e' and set it as the next node of the current node.
            current = current.next;         // Move the current reference to the newly inserted node.
            current.next = tmp;             // Set the next reference of the newly inserted node to the original 'tmp'.
        }
    }

    public void remove() {
        if (current == head) {
            head = head.next;   // If the current node is the head, update the head reference to point to the next node.
        } else {
            Node<T> tmp = head;
            while (tmp.next != current) {
                tmp = tmp.next;  // Find the node that precedes the current node in the list.
            }
            tmp.next = current.next;  // Update the 'next' reference of the preceding node to skip the current node.
        }
        if (current.next == null) {
            current = head;   // If the removed node was the last node, set the current reference back to the head.
        } else {
            current = current.next;  // Otherwise, move the current reference to the next node.
        }
    }
}
