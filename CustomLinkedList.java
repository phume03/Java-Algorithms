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

    public void deleteKthNodeFromEnd(int k) {

        if (head == null || k == 0) {
            return;
        }

        // list = [a, b, c, d]; k = 2
        Node first = head; // a
        Node second = head; // a

        for (int i = 0; i < k; i++) {
            second = second.next;
            if (second.next == null) {
                // K >= length of list
                if (i == k - 1) {
                    head = head.next;
                }
                return;
            }
        }

        // second = c

        while (second.next != null) {
            first = first.next;
            second = second.next;
        }

        // first = b
        // second = d

        first.next = first.next.next;


    }

    // Return the sum of the contents in the linked list
    public int sum() {
        
        int sum = 0;
        if (this.head != null) {
            Node current = this.head;
            while (current != null) {
                sum = sum + current.data;
                current = current.next;
            }
        }
        return sum;
    }
}
