package L08_Trees;

public class BT<T> {

    public BTNode root, current;

    // The Order class
    public enum Order {preOrder, inOrder, postOrder};
    
    // The Relative class
    public enum Relative {Root, Parent, LeftChild, RightChild};

    public BT() {
        root = current = null;
    }
    
    public boolean empty() {
        return root == null;
    }

    public T retrieve() {
        return current.data;
    }

    public void update(T e) {
        current.data = e;
    }

    public boolean insert(Relative rel, T data) {
        switch(rel) {
            case Root:
                if(!empty()) return false;
                current = root = new BTNode<T>(data);
                return true;
            case Parent: // This is an impossible case.
                return false;
            case LeftChild:
                if(current.left != null) return false;
                current.left = new BTNode<T>(data);
                return true;
            case RightChild:
                if(current.right != null) return false;
                current.right = new BTNode<T>(data);
                current = current.right;
                return true;
            default:
                return false;
        }

        public void deleteSubtree() {
            if(current == root) {
                current = root = null;
            }
            else {
                BTNode<T> p = current; // create a temp pointer to the current
                find(Relative.Parent); // move current to the partent
                if(current.left == p) 
                    current.left = null;
                else 
                    current.right = null;
                current = root;
            }
        }

        public boolean find(Relative rel) {
            switch(rel) {
                case Root: // Easy case
                    current = root;
                    return true;

                case Parent:
                    if(current == root) 
                        return false;
                    current = findParent(current, root);
                    return true;

                case LeftChild:
                    if(current.left == null) 
                        return false;
                    current = current.left;
                    return true;

                case RightChild:
                    if(current.right == null) 
                        return false;
                    current = current.right;
                    return true;

                default:
                    return false;
            }
        }

        // Non-recursive version of findparent -- uses pre-order traversal
        private BTNode<T> findParent(BTNode<T> p, BTNode<T> t) { // p is like current, and t is like root
            // Stack is used to store the right pointers of nodes
            LinkStack<BTNode<T>> stack = new LinkStack<BTNode<T>>();
            BTNode<T> q = t;
            while(q.left != p && q.right != p) {
                if(q.right != null) 
                    stack.push(q.right);
                if(q.left != null) 
                    q = q.left;
                else 
                    q = stack.pop(); // Go right here
            }
            return q;
        }

        //Recursive version of findParent -- Pre-order traversal used
        private BTNode<T> findParent(BTNode<T> p, BTNode<T> t) { // p is like current, and t is like root
            // Base Cases
            if(t == null) 
                return null; // empty tree

            if(t.left == null && t.right == null)
                return null;
            else if(t.left == p || t.right == p)
                return t; // parent is t

            // Recursive Cases
            else {
                BTNode<T> q = findParent(p, t.left);
                if(q != null)
                    return q;
                else
                    return findParent(p, t.right);
            }
        }
    }
}
