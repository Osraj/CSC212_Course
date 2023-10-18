package T000_Binary_Tree;

import javax.management.relation.Relation;

import L08_Trees.BTNode;
import L08_Trees.BT.Relative;

public class Main {

    /*
     * Problem 1:
     * Write the method countLeafs that should return the number of leaf nodes in
     * the tree.
     * A leaf node is a node that has no children.
     *  part of the Binary Tree ADT, The method signature is: public int
     * countLeafs().
     *  as a user of the Binary Tree ADT, assume the following method exists in the
     * ADT: isLeaf (boolean flag): requires: Binary tree is not empty. input: None.
     * results: if the current node of the binary tree is a leaf then flag is set to
     * true
     * otherwise it is set to false. output: flag.
     */
    public static int countLeaf() {
        return countLeafRec(root);
    }

    public static int countLeafRec(BTNode<T> n) {
        // special Case
        if (n == null) {
            return 0;
        }
        // base case
        if (n.getLeft() == null && n.getRight() == null) {
            return 1;
        }
        // recursive case
        return countLeafRec(n.getLeft()) + countLeafRec(n.getRight());
    }

    // other answer (using Stack structor)
    // this will not have the same order as the recursive because it will push the
    // right Node before the left
    public static int countLeafStack() {
        if (root == null)
            return 0;
        Stack<BTNode<T>> st = new Stack<BTNode<T>>();
        st.push(root);
        int count = 0;
        while (!st.isEmpty()) {
            BTNode<T> n = st.pop();
            if (n.getLeft() == null && n.getRight() == null)
                count++;
            else {
                if (n.getLeft() != null)
                    st.push(n.getLeft());
                if (n.getRight() != null)
                    st.push(n.getRight());
            }
        }
        return count;
    }

    /*
     * Problem 2
     * Write the member method countNodesIn member of the class BST that returns the
     * number of nodes in the subtree rooted at the node with key k. Assume that k exists.
     * You are not allowed to call any of the BST methods. The method signature is public
     * int countNodesIn(int k). 
     * 
     * Your implementation is as user 
     */
    public static <T> int countLeafs(BT<T> bt){
        if(bt.isEmpty()){
            return 0;
        }
        bt.find(Relative.Root);
        return countLeafsRec(bt);
    }
    public static <T> int countLeafsRec(BT<T> bt){
        if(bt.isLeaf()){
            return 1;
        }
        int nb = 0;
        if(find(Relative.LeftChild))
            nb += countLeafsRec(bt);
            find(Relative.Parent);

        if(find(Relative.RightChild))
            nb += countLeafsRec(bt);
            find(Relative.Parent);

        return nb;
    }

    
    public static void main() {

        // Problem 1:
        countLeafRec(null);

    }

}
