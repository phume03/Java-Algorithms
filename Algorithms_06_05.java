public class Algorithms_06_05 {



    public static void main(String[] args) {
        /** 
         *            8
         *         4     9
         *       2  3   x  10
         *     1     x
         * **/
        BinaryNode rootNode = new BinaryNode();
        rootNode.data = 8;

        BinarySearchTree tree = new BinarySearchTree();
        tree.root = rootNode;

        tree.insert(4);
        tree.insert(9);
        tree.insert(2);
        tree.insert(3);
        tree.insert(10);
        tree.insert(1);

        System.out.println("First tree contains 1: "+tree.contains(1));
        System.out.println("First tree contains 2: "+tree.contains(2));
        System.out.println("First tree contains 3: "+tree.contains(3));
        System.out.println("First tree contains 4: "+tree.contains(4));

        System.out.println("First tree contains 5: "+tree.contains(5));
        System.out.println("First tree contains -4: "+tree.contains(-4));
        System.out.println("First tree contains 0: "+tree.contains(0));
        System.out.println("First tree contains 6: "+tree.contains(6));
        
        System.out.println("Height of the first tree: "+tree.treeHeight());


        /** 
         *                  20
         *          10             30
         *       4     15     18         45
         *     1  x  12  x   x  x    32      50
         *    x x   x  x           31  42  48    x
         *                        x x x x x 49
         * **/
        rootNode = new BinaryNode();
        rootNode.data = 20;

        tree = new BinarySearchTree();
        tree.root = rootNode;

        tree.insert(10);
        tree.insert(30);
        tree.insert(4);
        tree.insert(15);
        tree.insert(18);
        tree.insert(45);
        tree.insert(1);
        tree.insert(12);
        tree.insert(32);
        tree.insert(50);
        tree.insert(31);
        tree.insert(42);
        tree.insert(48);
        tree.insert(49);

        System.out.println("Height of the second tree: "+tree.treeHeight());        
    }
}
