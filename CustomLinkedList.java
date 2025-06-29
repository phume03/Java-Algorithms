public class CustomLinkedList {

    Node head;

    public void displayContents() {
        if (head != null) {
            Node current = head;
            while(current.next != null) { // switch here to current.next necessitates an if check because we cannot check next of a null
                System.out.print(current.data + "->");
                current = current.next;
            }
            System.out.print(current.data);
        }
        System.out.println();
    }
}
