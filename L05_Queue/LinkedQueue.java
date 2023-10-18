package L05_Queue;

/*
 * Queue Specification:
 * 
 * A generic Queue implementation representing a First In First Out (FIFO) data structure.
 * 
 * Attributes:
 * None.
 * 
 * Methods:
 * 
 * 1. full():
 *    - Requires: None.
 *    - Returns: True if the queue is full; otherwise, false (linked list can grow until memory is exhausted).
 * 
 * 2. length():
 *    - Requires: None.
 *    - Returns: The number of elements in the queue.
 *  
 * 3. enqueue(Type e):
 *    - Requires: The queue is not full.
 *    - Input: Element 'e' of generic type 'Type' to be added to the tail of the queue.
 *    - Action: Element 'e' is added to the tail of the queue.
 * 
 * 4. serve():
 *    - Requires: The queue is not empty.
 *    - Returns: The element at the head of the queue is removed and returned.
 * 
 * Domain: The number of elements in the queue is bounded; therefore, the domain is finite.
 * Type of elements: Queue of generic type 'Type'.
 */

public class LinkedQueue<T> implements Queue<T> {
    private Node<T> head, tail;
    private int size;

    public LinkedQueue() {
        head = tail = null;
        size = 0;
    }

    public boolean full() {
        return false;
    }

    public int length() {
        return size;
    }

    public void enqueue(T e) {
        if(tail == null) {
            head = tail = new Node<T>(e);
        } else {
            tail.next = new Node<T>(e);
            tail = tail.next;
        }
        size++;
    }

    public T serve() {
        T tmp = head.data;
        head = head.next;
        size--;
        if(size == 0) {
            tail = null;
        }
        return tmp;
    }
}
