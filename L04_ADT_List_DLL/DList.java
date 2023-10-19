package L04_ADT_List_DLL;

public interface DList {
    public boolean empty();
    public boolean full();

    public boolean first();
    public boolean last();

    public void findFirst();
    public void findNext();
    public void findPrevious();

    public Object retrieve();
    public void update(Object e);
    
    public void insert(Object e);
    public void remove();
}
