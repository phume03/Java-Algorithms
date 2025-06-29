public class CustomLinkedList {

    Node head;
   
    public CustomLinkedList() {
    }

    public void displayContents() {
        if (this.head != null) {
            Node current = this.head;
            for(; current.next != null; current = current.next) {
                System.out.print(current.data + "->");
            }
            System.out.print(current.data);
        }

        System.out.println();
    }

    public void deleteBackHalf() {
      if (this.head == null || this.head.next == null) {
         this.head = null;
      }

      Node slow = this.head;
      Node fast = this.head;

      Node prev;
      for(prev = null; fast != null && fast.next != null; slow = slow.next) {
         fast = fast.next.next;
         prev = slow;
      }

      prev.next = null;
   }
}
