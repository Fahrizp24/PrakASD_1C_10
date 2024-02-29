package P2.penjualanBuku;

public class Buku10 {
    String judul, pengarang;
    int halaman, stok, harga;
    public Buku10(){
        
    }
    public Buku10(String jud, String pg, int hal, int stok, int har){
        judul=jud;
        pengarang=pg;
        halaman=hal;
        this.stok=stok;
        harga=har;
    }
    void tampilInformasi(){
        System.out.println("Judul: "+judul);
        System.out.println("Pengarang: "+ pengarang);
        System.out.println("Jumlah halaman: "+halaman);
        System.out.println("Sisa stok: "+stok);
        System.out.println("Harga: "+harga);
        System.out.println();
    }
    int terjual(int jml){
        int biaya=0;
        if (stok>0&&stok>=jml) {
            stok-=jml;
            biaya=jml;
        }else{
            System.out.println("Penjualan "+jml+" buah tidak bisa dilaksanakan karena stok habis atau stok tidak memadai");
        }
        return biaya;
    }
    int restock(int jml){
        stok+=jml;
        return stok;
    }
    void gantiHarga(int hrg){
        harga=hrg;
    }
    int hitungHargaTotal(int jml, int hrg){
        int hargaTotal=jml*hrg;
        return hargaTotal;
    }
    int hitungDiskon(int hargaTotal){
        double hargaDiskon=0;
        if (hargaTotal>150000) {
            hargaDiskon=hargaTotal*0.12;
        }else if (hargaTotal>=75000&&hargaTotal<=150000) {
            hargaDiskon=hargaTotal*0.05;
        }else if (hargaTotal<75000) {
            hargaDiskon=hargaTotal;
        }
        return (int)hargaDiskon;
    }
    int hitungHargaBayar(int hargaTotal, int hargaDiskon){
        int hargaBayar=hargaTotal-hargaDiskon;
        return hargaBayar;
    }
}

