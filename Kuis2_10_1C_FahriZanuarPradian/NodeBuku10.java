package Kuis2_10_1C_FahriZanuarPradian;

public class NodeBuku10 {
    NodeBuku10 prev, next;
    Buku10 buku;

    public NodeBuku10(NodeBuku10 prev, String kode, String judul, int stock, NodeBuku10 next) {
        this.prev = prev;
        this.next = next;
        this.buku = new Buku10(kode, judul, stock);
    }

}
