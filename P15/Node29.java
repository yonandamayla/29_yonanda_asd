public class Node29 {
    int data;
    Node29 prev;
    Node29 next;
    int jarak;

    public Node29(Node29 prev, int data, int jarak, Node29 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
        this.jarak = jarak;
    }
}
