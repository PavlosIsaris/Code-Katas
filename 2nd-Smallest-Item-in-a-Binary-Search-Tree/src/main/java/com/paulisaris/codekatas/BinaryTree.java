package main.java.com.paulisaris.codekatas;

public class BinaryTree {

    BinaryTreeNode root;

    public void add(int value) {
        root = addRecursive(root, value);
    }

    public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }

    public int findSmallestValue() {
        return findSmallestValueRecursive(root);
    }

    public int findSecondSmallestValue() {
        return findSecondSmallestValueRecursive(root);
    }

    protected BinaryTreeNode addRecursive(BinaryTreeNode current, int value) {
        if (current == null) {
            return new BinaryTreeNode(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }

    protected boolean containsNodeRecursive(BinaryTreeNode current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }
        return value < current.value
                ? containsNodeRecursive(current.left, value)
                : containsNodeRecursive(current.right, value);
    }

    protected int findSmallestValueRecursive(BinaryTreeNode root) {
        return root.left == null ? root.value : findSmallestValueRecursive(root.left);
    }

    BinaryTreeNode current;
    protected int findSecondSmallestValueRecursive(BinaryTreeNode root) {
        if(root.left != null)
            current = root;
        return root.left == null ? current.value : findSecondSmallestValueRecursive(root.left);
    }
}
