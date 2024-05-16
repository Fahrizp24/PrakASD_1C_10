package P11.Tugas_P11;

public class NodeMahasiswa {
    Mahasiswa mhs;
    NodeMahasiswa next;

    public NodeMahasiswa(String urutan, String nim, String  nama, NodeMahasiswa berikutnya) {
        mhs = new Mahasiswa(urutan, nim, nama);
        next = berikutnya;
    }
}
