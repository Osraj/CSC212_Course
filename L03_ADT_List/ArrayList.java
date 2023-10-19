package L03_ADT_List;

public class ArrayList<T> implements List<T> {
    private int maxsize;    // Maximum size of the ArrayList.
    private int size;       // Current size (number of elements) in the ArrayList.
    private int current;    // Index of the current element.
    private T[] nodes;      // Array to store the elements.

    // Creates a new instance of ArrayList
    public ArrayList(int n) {
        maxsize = n;                 // Initialize the maximum size.
        size = 0;                    // Initialize the current size to 0 (empty ArrayList).
        current = -1;                // Initialize the current index to -1 (no current element).
        nodes = (T[]) new Object[n]; // Create an array to store the elements.
    }

    public boolean empty() {
        return size == 0;  // Check if the ArrayList is empty by comparing the size to 0.
    }

    public boolean full() {
        return size == maxsize;  // Check if the ArrayList is full by comparing the size to the maximum size.
    }

    public boolean last() {
        return current == size - 1;  // Check if the current element is the last element by comparing its index to size - 1.
    }

    public void findFirst() {
        current = 0;  // Set the current index to 0 to start from the first element.
    }

    public void findNext() {
        current++;  // Move to the next element by incrementing the current index.
    }

    public T retrieve() {
        return nodes[current];  // Retrieve and return the element at the current index.
    }

    public void update(T e) {
        nodes[current] = e;  // Update the element at the current index with the new value 'e'.
    }

    public void insert(T e) {
        for (int i = (size-1); i > current; --i) {
            nodes[i+1] = nodes[i];  // Shift elements to the right to make space for the new element at the current index.
        }
        current++;
        nodes[current] = e;  // Insert the new element at the current index.
        size++;  // Increment the size of the ArrayList.
    }

    public void remove() {
        for (int i = (current+1); i < size; i++) {
            nodes[i-1] = nodes[i];  // Shift elements to the left to remove the element at the current index.
        }
        size--;  // Decrement the size of the ArrayList.
        if (size == 0) {
            current = -1;  // If the ArrayList is empty, set the current index to -1.
        } else if (current == size) {
            current = 0;   // If the current index was at the end, wrap it to the beginning.
        }
    }

    // ╭──────────────────────────────────────────────────╮
    // │    🌟 Additional Memebers implementations 🌟    │
    // ╰──────────────────────────────────────────────────╯

    // Question 1: Implement member method FindPrevious() for ArrayList
    public void findPrevious() {
        current--;  // Move to the previous element by decrementing the current index.
    }
}
