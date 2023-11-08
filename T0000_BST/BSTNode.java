package T0000_BST;

public class BSTNode {
    private int key;
    private BSTNode left;
    private BSTNode right;

    public BSTNode(int key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }

    public BSTNode(int key, BSTNode left, BSTNode right) {
        this.key = key;
        this.left = left;
        this.right = right;
    }

    public int getKey() {
        return this.key;
    }

    public BSTNode getLeft() {
        return this.left;
    }

    public BSTNode getRight() {
        return this.right;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public void setLeft(BSTNode left) {
        this.left = left;
    }

    public void setRight(BSTNode right) {
        this.right = right;
    }
    
}
