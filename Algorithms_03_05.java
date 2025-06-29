
public class Algorithms_03_05 {

    public static void main(String[] args) {
        CustomLinkedList linkedList = new CustomLinkedList();

        Node firstNode = new Node(7);
        Node secondNode = new Node(5);
        Node thirdNode = new Node(3);
        Node fourthNode = new Node(4);
        Node fifthNode = new Node(1);
        Node sixthNode = new Node(10);

        linkedList.head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = fifthNode;
        fifthNode.next = sixthNode;

        linkedList.displayContents();
        linkedList.deleteKthNodeFromEnd(1);
        linkedList.displayContents();
        System.out.println("Sum: "+linkedList.sum());
    }
}