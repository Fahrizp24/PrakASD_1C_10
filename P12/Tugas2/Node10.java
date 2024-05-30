package P12.Tugas2;

public class Node10 {
    Film10 film;
    Node10 prev, next;

    public Node10( Node10 prev, String id, String judul, Float rating, Node10 next) {
        this.film = new Film10(id, judul, rating);
        this.prev = prev;
        this.next = next;
    }
}
