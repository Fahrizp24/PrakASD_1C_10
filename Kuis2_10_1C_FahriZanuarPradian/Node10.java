package Kuis2_10_1C_FahriZanuarPradian;

public class Node10 {
    Antrian10 antrian;
    Anggota10 anggota;
    Node10 prev, next;

    public Node10( Node10 prev,String kode,String nama, String nohp, int nomorAntrian, Node10 next) {
        this.prev = prev;
        this.next = next;
        this.anggota= new Anggota10(kode, nama, nohp);
        this.antrian = new Antrian10(nomorAntrian, anggota);
    }
}
