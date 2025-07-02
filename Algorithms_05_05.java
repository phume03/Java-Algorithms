public class Algorithms_05_05 {

    public static void main(String[] args) {

        CustomLinkedList noCycleLinkedList = new CustomLinkedList();
        Node firstNode = new Node(3);
        Node secondNode = new Node(4);
        Node thirdNode = new Node(5);
        Node fourthNode = new Node(6);

        noCycleLinkedList.head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;

        System.out.println(noCycleLinkedList.hasCycle());

        CustomLinkedList cycleLinkedList = new CustomLinkedList();
        cycleLinkedList.head = firstNode;
        // already done: firstNode.next = secondNode;
        // already done: secondNode.next = thirdNode;
        thirdNode.next = secondNode; // switch to create cycle

        System.out.println(cycleLinkedList.hasCycle());
    }
}
