package Kuis2_10_1C_FahriZanuarPradian;
public class DoubleLinkedList10 {
    Node10 head;
    NodeBuku10 headBuku;
    int size,jumlahBuku, nomorAntrian;
    public DoubleLinkedList10() {
        head = null;
        size = 0;
        nomorAntrian =0;
        jumlahBuku =0;
        
    }

    public boolean isEmpty10() {
        return head == null;
    }

    public boolean isBukuEmpty10() {
        return headBuku == null;
    }

    public void addLast10(String kode,String nama, String nohp) {
        nomorAntrian++;
        if (isEmpty10()) {
            head = new Node10(null, kode, nama, nohp,nomorAntrian, null);
        } else {
            
            Node10 temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            Node10 ndInput = new Node10(temp, kode, nama, nohp,nomorAntrian, null);
            temp.next = ndInput;
        }
        size++;
    }

    public void addBuku10(String kode,String nama, int stock) {
        if (isBukuEmpty10()) {
            headBuku = new NodeBuku10(null, kode, nama, stock, null);
        } else {
            NodeBuku10 temp = headBuku;
            while (temp.next != null) {
                temp = temp.next;
            }
            NodeBuku10 ndInput = new NodeBuku10(temp, kode, nama, stock, null);
            temp.next = ndInput;
        }
        jumlahBuku++;
    }

    public int size10() {
        return size;
    }

    public void print10() {
        if (!isEmpty10()) {
            Node10 temp = head;
            int jumlahAntrian=0;
            System.out.println("|Nomor antrian\t\t\t|Kode Agt\t\t\t|Customer Name\t\t\t|Telephone ");
            while (temp != null){
                jumlahAntrian++;
                System.out.println("|"+temp.antrian.noAntrian+"\t\t\t\t|"+temp.anggota.kodeAnggota+"\t\t\t\t|"+temp.anggota.namaAnggota+"\t\t\t|"+temp.anggota.noHp);
                temp = temp.next;
            }
            System.out.println("Jumlah Antrian: "+jumlahAntrian);
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void printBuku10() {
        if (!isBukuEmpty10()) {
            NodeBuku10 temp = headBuku;
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Daftar Buku Di Perpustakaan");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("|Kode Buku\t\t\t|Judul Buku\t\t\t|Stock");
            while (temp != null){ 
                System.out.println("|"+temp.buku.kodeBuku+"\t\t\t\t|"+temp.buku.judulBuku+"\t\t\t\t|"+temp.buku.stock);
                temp = temp.next;
            }
            System.out.println("Sukses Cetak Buku");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void removeFirst10(){
        if (isEmpty10()) {
            System.out.println("Linked List Masih Kosong, tidak dapat dihapus");
            return;
        } else if (size == 1) {
            head = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    public int cariBuku10(String kode){
        int posisi = -1;
        NodeBuku10 temp = headBuku;
        for (int i = 0; i < jumlahBuku; i++) {
            if (kode.compareToIgnoreCase(temp.buku.kodeBuku)==0) {
                posisi=i;
                break;
            }
            temp= temp.next;
        }
        return posisi;
    }

    public void pinjamBuku10 (int posisi, int jumlah){
        NodeBuku10 temp = headBuku;
        for (int i = 0; i < posisi; i++) {
            temp= temp.next;
        }
        if (jumlah<temp.buku.stock) {
            temp.buku.stock-=jumlah;
            System.out.println("Data Buku Yang Dipinjam");
            System.out.println("Kode\t\t: "+temp.buku.kodeBuku);
            System.out.println("Judul\t\t: "+temp.buku.judulBuku);
            System.out.println("stock\t\t: "+temp.buku.stock);
        }else{
            System.out.println("Permintaan Ditolak Karena Melebihi Stock");
        }
    }

    public void stockTerkecil10(){
        int posisi = 0;
        NodeBuku10 temp = headBuku;
        for (int i = 0; i < jumlahBuku-1; i++) {
            if (temp.buku.stock<temp.next.buku.stock) {
                posisi=i;
                break;
            }
            temp= temp.next;
        }
        NodeBuku10 cetakTerkceil = headBuku;
        for (int i = 0; i < posisi ; i++) {
            cetakTerkceil=cetakTerkceil.next;
        }
        System.out.println("Data: ");
        System.out.println("Kode\t\t: "+cetakTerkceil.buku.kodeBuku);
        System.out.println("Judul\t\t: "+cetakTerkceil.buku.judulBuku);
    }
}