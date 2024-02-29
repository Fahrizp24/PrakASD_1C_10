package P2.penjualanBuku;

public class Buku10 {
    String judul, pengarang;
    int halaman, stok, harga;

    void tampilInformasi(){
        System.out.println("Judul: "+judul);
        System.out.println("Pengarang: "+ pengarang);
        System.out.println("Jumlah halaman: "+halaman);
        System.out.println("Sisa stok: "+stok);
        System.out.println("Harga: "+harga);
    }
    void terjual(int jml){
        if (stok>0) {
            stok-=jml;
        }
    }
    void restock(int jml){
        stok+=jml;
    }
    void gantiHarga(int hrg){
        harga=hrg;
    }
}

