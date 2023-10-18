package L05_Queue;

/*
 * Explanation of methods in the `Queue` interface:
 *
 * 1. `length()`: Returns the number of elements currently in the queue.
 * 2. `full()`: Checks if the queue is at maximum capacity.
 * 
 * 3. `enqueue(T e)`: Adds an element to the back of the queue.
 * 4. `serve()`: Removes and returns the element at the front of the queue.
 *
 */

public interface Queue<T>{
    public int length();
    public boolean full();

    public void enqueue(T e);
    public T serve();
}