package P6;

public class Buku10 {
    int kodeBuku, tahunTerbit, stock;
    String judul, pengarang;
    public Buku10(int kodeBuku, String judul, int tahunTerbit, String pengarang, int stock){
        this.kodeBuku=kodeBuku;
        this.judul = judul;
        this.tahunTerbit=tahunTerbit;
        this.pengarang=pengarang; 
        this.stock=stock;
    }
    public void tampilDataBuku(){
        System.out.println("=================================");
        System.out.println("Kode Buku : "+kodeBuku);
        System.out.println("Judul Buku : "+judul);
        System.out.println("Pengarang : "+pengarang);
        System.out.println("Tahun  terbit : "+tahunTerbit );
        System.out.println("Stock : "+stock);
    }
}
