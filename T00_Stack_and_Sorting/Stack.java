package T00_Stack_and_Sorting;

public class Stack {

    // Q: 
    public static <T> void replace(Stack<T> st, T e1, T e2 ) {
        Stack<T> tmp = new LinkedStack<T>();
        while (!st.empty()) {
            T top = st.pop();
            // if (top.equals(e1)) {
            //     tmp.push(e2);
            // }
            // else {
            //     tmp.push(e1);
            // }
            if (top.equals(e1))
                top = e2;
            tmp.push(top);
        }
        while (!tmp.empty()) {
            st.push(tmp.pop());
        }
    }

    //Q: Write the static method search that searches for an element e in a stack st and returns true if it's found or

    public static <T> boolean search(Stack<T> st, T e) {
        if(st.empty())
            return false;

        T tmp = st.pop();

        boolean found;
        if (tmp.equals(e))
            found = true;
        else
            found = search(st, e);
        
        st.push(tmp);
        return found;
    }

    
}
