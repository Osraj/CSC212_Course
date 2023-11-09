package L03_ADT_List;


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


/*
 * ADT List Specification: 
 * Operations: All operations act on a list L.
 *
 * 1. empty(boolean flag): 
 *    - Input: None.
 *    - Results: Sets flag to true if L is empty, otherwise false.
 *    - Output: flag.
 * 
 * 2. full(boolean flag): 
 *    - Input: None.
 *    - Returns: Sets flag to true if L is full, otherwise false.
 *    - Output: flag.
 * 
 * 3. last(boolean flag): 
 *    - Input: None.
 *    - Requires: L is not empty.
 *    - Results: Sets flag to true if the current element is the last element, otherwise false.
 *    - Output: flag.
 * 
 * 4. findFirst(): 
 *    - Requires: L is not empty.
 *    - Input: None.
 *    - Results: Sets the first element as the current element.
 *    - Output: None.
 *
 * 5. findNext(): 
 *    - Requires: L is not empty and current is not the last element.
 *    - Input: None.
 *    - Results: Sets the element following the current element as the current element.
 *    - Output: None.
 *
 * 6. retrieve(Type e): 
 *    - Requires: L is not empty.
 *    - Input: None.
 *    - Results: Copies the current element into e.
 *    - Output: The element e.
 *
 * 7. update(Type e): 
 *    - Requires: L is not empty.
 *    - Input: e.
 *    - Results: Copies element e into the current node.
 *    - Output: None.
 *
 * 8. insert(Type e): 
 *    - Requires: L is not full.
 *    - Input: e.
 *    - Results: Inserts a new node containing e after the current element. If L is empty, also sets e as the head.
 *    - Output: None.
 *
 * 9. remove(): 
 *    - Requires: L is not empty.
 *    - Input: None.
 *    - Results: Removes the current element. Sets current to NULL if L is empty, or to the successor of the deleted element, or to the first element if there is no successor.
 *    - Output: None.
 */

}
