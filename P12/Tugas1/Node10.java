package P12.Tugas1;

public class Node10 {
    Antrian10 pasien;
    Node10 prev, next;

    public Node10( Node10 prev, String urutan, String nama, Node10 next) {
        this.pasien = new Antrian10(urutan, nama);
        this.prev = prev;
        this.next = next;
    }
}
