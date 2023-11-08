package L04_ADT_List_DLL;

/**
 * DoubleLinkedList Specification:
 * 
 * A generic DoubleLinkedList implementation.
 * 
 * Attributes:
 * - head: Points to the first node in the list.
 * - current: Points to the current node in the list.
 * 
 * Methods:
 * 1. DoubleLinkedList(): Constructor that initializes an empty list.
 * 
 * 2. empty(): 
 *    - Returns: true if the list is empty, false otherwise.
 * 
 * 3. full():
 *    - Returns: false (linked list can grow until memory is exhausted).
 * 
 * 4. first():
 *    - Requires: List is not empty.
 *    - Returns: true if current node is the first node, false otherwise.
 * 
 * 5. last():
 *    - Requires: List is not empty.
 *    - Returns: true if current node is the last node, false otherwise.
 * 
 * 6. findFirst():
 *    - Requires: List is not empty.
 *    - Action: Sets the first node as the current node.
 * 
 * 7. findNext():
 *    - Requires: List is not empty and current is not the last node.
 *    - Action: Moves the current pointer to the next node.
 * 
 * 8. findPrevious():
 *    - Requires: List is not empty and current is not the first node.
 *    - Action: Moves the current pointer to the previous node.
 * 
 * 9. retrieve():
 *    - Requires: List is not empty.
 *    - Returns: Data of the current node.
 * 
 * 10. update(T e):
 *     - Requires: List is not empty.
 *     - Input: Data to update the current node with.
 *     - Action: Updates the data of the current node with the provided value.
 * 
 * 11. insert(T e):
 *     - Requires: List is not full (though in practice, it's constrained only by memory).
 *     - Input: Data for the new node.
 *     - Action: Inserts a new node with data 'e' after the current node. Adjusts pointers accordingly.
 * 
 * 12. remove():
 *     - Requires: List is not empty.
 *     - Action: Removes the current node from the list and adjusts pointers accordingly.
 * 
 * Nodes in the list maintain pointers to their next and previous nodes.
 */

public class DoubleLinkedList<T> {
    private Node<T> head;    // Points to the first node in the list
    private Node<T> current; // Points to the current node in the list

    // Constructor initializes an empty list
    public DoubleLinkedList(){
        head = current = null;
    }

    // Returns true if the list is empty, false otherwise
    public boolean empty(){
        return head == null;
    }

    // Returns false as a linked list can grow until memory is exhausted
    public boolean full(){
        return false;
    }

    // Returns true if current node is the first node, false otherwise
    public boolean first(){
        return current.previous == null;
    }

    // Returns true if current node is the last node, false otherwise
    public boolean last(){
        return current.next == null;
    }

    // Sets the first node as the current node
    public void findFirst(){
        current = head;
    }

    // Moves the current pointer to the next node
    public void findNext(){
        current = current.next;
    }

    // Moves the current pointer to the previous node
    public void findPrevious(){
        current = current.previous;
    }

    // Retrieves the data of the current node
    public T retrieve(){
        return current.data;
    }

    // Updates the data of the current node with the provided value
    public void update(T e){
        current.data = e;
    }

    // Inserts a new node with data 'e' after the current node
    public void insert(T e){
        Node<T> tmp = new Node<T>(e);
        if(empty()){
            // If the list is empty, set the new node as both head and current
            current = head = tmp;
        } else {
            // Otherwise, adjust the pointers to insert the node after the current node
            tmp.next = current.next;
            tmp.previous = current;
            if(current.next != null){
                current.next.previous = tmp;
            }
            current.next = tmp;
            current = tmp;
        }
    }

    // Removes the current node from the list and adjusts pointers accordingly
    public void remove(){
        if(current == head){
            // If removing the head node, adjust the head pointer
            head = head.next;
            if(head != null){
                head.previous = null;
            }
        } else {
            // Otherwise, adjust the pointers of the adjacent nodes
            current.previous.next = current.next;
            if(current.next != null){
                current.next.previous = current.previous;
            }
        }
        // Set the current pointer to the next node or to the head if no next node exists
        if(current.next == null){
            current = head;
        } else {
            current = current.next;
        }
    }

    // ╭──────────────────────────────────────────────────╮
    // │    🌟 Additional Memebers implementations 🌟    │
    // ╰──────────────────────────────────────────────────╯
    
    // Question 1: Implement the member method FindLast()
    // Requires: List L is not empty.
    // Input: None.
    // Results: Last element is set as the current element.
    // Output: None.
    public void findLast(){
        findFirst();
        while(current.next != null)
            current = current.next;
    }
}
