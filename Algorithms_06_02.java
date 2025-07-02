public class Algorithms_06_02 {

    public static void main(String[] args) {

        BinaryNode rootNode = new BinaryNode();
        rootNode.data = 2;

        BinarySearchTree tree = new BinarySearchTree();
        tree.root = rootNode;

        tree.insert(1);
        tree.insert(3);
        tree.insert(4);
    }
}
