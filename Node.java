public class Node {
    public int data;
    public Node next;

    public Node(int d) {
        this.data = d;
        this.next = null;
    }

    @Override
    public String toString() {
        return Integer.toString(data);
    }    
}
