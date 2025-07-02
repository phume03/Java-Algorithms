public class Algorithms_06_04 {

    public static void main(String[] args) {

        //          5
        //       2        4
        //    9    10  7

        BinaryNode rootNode = new BinaryNode();
        rootNode.data = 5;
        BinaryNode nodeTwo = new BinaryNode();
        nodeTwo.data = 2;
        BinaryNode nodeFour = new BinaryNode();
        nodeFour.data = 4;
        BinaryNode nodeNine = new BinaryNode();
        nodeNine.data = 9;
        BinaryNode nodeTen = new BinaryNode();
        nodeTen.data = 10;
        BinaryNode nodeSeven = new BinaryNode();
        nodeSeven.data = 7;

        rootNode.left = nodeTwo;
        rootNode.right = nodeFour;
        nodeTwo.left = nodeNine;
        nodeTwo.right = nodeTen;
        nodeFour.left = nodeSeven;

        BinaryTree tree = new BinaryTree();
        tree.root = rootNode;

        tree.preOrderTraversal();
        System.out.println();

        tree.inOrderTraversal();
        System.out.println();

        tree.postOrderTraversal();
        System.out.println();        

    }
}
