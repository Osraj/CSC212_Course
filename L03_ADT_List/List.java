package L03_ADT_List;

/*
 * a brief explanation of each method in the `List` interface:
 *
 * 1. `empty()`: Checks if the list is empty.
 * 2. `full()`: Checks if the list is at maximum capacity.
 * 
 * 3. `last()`: Checks if the cursor is at the last element.
 * 
 * 4. `findFirst()`: Moves the cursor to the first element.
 * 5. `findNext()`: Moves the cursor to the next element.
 * 
 * 6. `retrieve()`: Gets the element at the cursor's position.
 * 7. `update(T e)`: Updates the element at the cursor's position.
 * 
 * 8. `insert(T e)`: Inserts a new element at the cursor's position.
 * 9. `remove()`: Removes the element at the cursor's position.
 */


public interface List<T> {
    public boolean empty();
    public boolean full();

    public boolean last();

    public void findFirst();
    public void findNext();

    public T retrieve();
    public void update(T e);

    public void insert(T e);
    public void remove();
}
