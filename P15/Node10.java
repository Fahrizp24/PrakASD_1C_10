package P15;

public class Node10 {
    int data;
    Node10 prev, next;
    int jarak;

    public Node10(Node10 prev, int data,  int jarak,Node10 next ) {
        this.data = data;
        this.prev = prev;
        this.next = next;
        this.jarak = jarak;
    }

    public Node10() {
    }
}
