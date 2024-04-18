package P8;

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
            for (int i = 0; i <= top; i++) {
                System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong");
        }
    }
}
