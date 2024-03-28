package P6;

public class MainBuku10 {
    public static void main(String[] args) {
        Buku10 m = new Buku10(20215,"Alforitma",2019,"Wahyuni", 5);
        Buku10 m1 = new Buku10(20214,"Big Data",2020,"Susilo", 3);
        Buku10 m2= new Buku10(20212,"Desain UI",2021,"Supriandi", 6);
        Buku10 m3 = new Buku10(20211,"Web Programming",2022,"Pustaka Adi", 2);
        Buku10 m4 = new Buku10(2021,"Etika Mahasiswa",2023,"Darmawan Adi", 1);
        DaftarBuku10 listBuku=new DaftarBuku10();
        listBuku.tambah(m);
        listBuku.tambah(m1);
        listBuku.tambah(m2);
        listBuku.tambah(m3);
        listBuku.tambah(m4);

        System.out.println("======================");
        System.out.println("Data Sebelum Diurutkan");
        listBuku.tampil();

        System.out.println("======================");
        System.out.println("Data setelah diurutkan secara Asc berdasarkan sock");
        listBuku.bubbleSort();
        listBuku.tampil();
    }
}
