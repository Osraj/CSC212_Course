package L04_ADT_List_DLL;

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
