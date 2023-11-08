package L04_ADT_List_DLL;

/*
 * a brief explanation of each method in the `DList` interface:
 *
 * 1. `empty()`: Checks if the list is empty.
 * 2. `full()`: Checks if the list is at maximum capacity.
 * 
 * 3. `first()`: Checks if the cursor is at the first element.
 * 4. `last()`: Checks if the cursor is at the last element.
 * 
 * 5. `findFirst()`: Moves the cursor to the first element.
 * 6. `findNext()`: Moves the cursor to the next element.
 * 7. `findPrevious()`: Moves the cursor to the previous element.
 * 
 * 8. `retrieve()`: Gets the element at the cursor's position.
 * 9. `update(T e)`: Updates the element at the cursor's position.
 * 
 * 10. `insert(T e)`: Inserts a new element at the cursor's position.
 * 11. `remove()`: Removes the element at the cursor's position.
 */

public interface DList<T> {
    public boolean empty();
    public boolean full();

    public boolean first();
    public boolean last();

    public void findFirst();
    public void findNext();
    public void findPrevious();

    public T retrieve();
    public void update(T e);

    public void insert(T e);
    public void remove();
}
