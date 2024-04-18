package P8.Gudang;

public class Gudang10 {
    Barang10[] tumpukan;
    int size, top;
    public Gudang10 (int kapasitas){
        size=kapasitas;
        tumpukan=new Barang10[size];
        top=-1;
    }
     
    public boolean cekKosong(){
        if (top==-1) {
            return true;
        }else{
            return false;
        }
    }

    public boolean cekPenuh(){
        if (top==size-1) {
            return true;
        }else{
            return false;
        }
    }

    public void tambahBarang (Barang10 brg){
        if (!cekPenuh()) {
            top++;
            tumpukan[top]=brg;
            System.out.println("Barang "+brg.nama +" berhasil ditambahkan ke gudang");
        }else {
            System.out.println("Gagal! Tumpukan Barang Sudah Penuh!");
        }
    }

    public Barang10 ambilBarang (){
        if (!cekKosong()) {
            Barang10 delete = tumpukan[top];
            top--;
            System.out.println("Barang "+delete.nama+" diambil dari gudang");
            System.out.println("Kode unik dalam biner: "+konversiDesimalkeBiner(delete.kode));
            return delete;
        }else{
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public Barang10 lihatBarangTeratas (){
        if (!cekKosong()) {
            Barang10 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: "+barangTeratas.nama);
            return barangTeratas;
        }else{
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public void tampilkanBarang(){
        if (!cekKosong()) {
            System.out.println("Rincian barang di gudang :");
            for (int i = top; i >= 0; i--) {
                System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong");
        }
    }

    public String konversiDesimalkeBiner(int kode){
        StackKonversi10 stack = new StackKonversi10();
        while (kode!=0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner+=stack.pop();
        }
        return biner;
    }

    public Barang10 lihatBarangterbawah (){
        if (!cekKosong()) {
            Barang10 barangTerbawah = tumpukan[0];
            System.out.println("Barang terbawah: "+barangTerbawah.nama);
            return barangTerbawah;
        }else{
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public int cariBarang(int cari, int cariKode, String cariNama){
        if (!cekKosong()) {
            if (cari==1) {
                for (int i = top; i >= 0; i--) {
                    if (cariKode==tumpukan[i].kode) {
                        System.out.println("Barang anda ada pada index ke-"+i);
                        System.out.println("Kode barang: "+tumpukan[i].kode);
                        System.out.println("Nama barang: "+tumpukan[i].nama);
                        System.out.println("Kategori: "+tumpukan[i].kategori);
                        return i;
                    }
                }
                System.out.println("Barang tidak ditemukan");
                return -1;
            }else {
                for (int i = top; i >=0; i--) {
                    if (cariNama.compareToIgnoreCase(tumpukan[i].nama)==0) {
                        System.out.println("Barang anda ada pada index ke-"+i);
                        System.out.println("Kode barang: "+tumpukan[i].kode);
                        System.out.println("Nama barang: "+tumpukan[i].nama);
                        System.out.println("Kategori: "+tumpukan[i].kategori);
                        return i;
                    }
                }
                System.out.println("Barang tidak ditemukan");
                return -1;
            }
        }else{
            System.out.println("Tumpukan barang kosong");
            return -1;
        }
    }
}
