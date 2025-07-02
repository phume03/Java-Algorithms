public class BinarySearchTree {
    BinaryNode root;

    public void insert(int value) {
        insert(this.root, value);
    }

    private BinaryNode insert(BinaryNode root, int value) {
        if (root == null) {
            root = new BinaryNode();
            root.data = value;
        } else if (value < root.data) {
            // insert on left
            root.left = insert(root.left, value);
        } else if (value > root.data) {
            // insert on right
            root.right = insert(root.right, value);
        }

        return root;
    }

    public boolean contains(int value) {
        return contains(this.root, value);
    }

    private boolean contains(BinaryNode root, int value) {
        if (root == null) {
            return false;
        }

        if (value < root.data) {
            return contains(root.left, value);
        }

        if (value > root.data) {
            return contains(root.right, value);
        }

        return true;
    }    
}
