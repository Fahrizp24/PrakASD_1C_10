package P7.TextSearching;

import java.util.Scanner;

public class BukuMain10 {
    public static void main(String[] args) {
        Scanner inputint10 = new Scanner(System.in);
        Scanner inputStr10 = new Scanner(System.in);

        PencarianBuku10 data = new PencarianBuku10();
        int jumBuku=5;

        System.out.println("==============================");
        Buku10 m = new Buku10(20215,"Algoritma",2019,"Wahyuni", 5);
        Buku10 m1 = new Buku10(20214,"Big Data",2020,"Susilo", 3);
        Buku10 m2= new Buku10(20212,"Desain UI",2021,"Supriandi", 3);
        Buku10 m3 = new Buku10(20211,"Web Programming",2022,"Pustaka Adi", 2);
        Buku10 m4 = new Buku10(20210,"Etika Mahasiswa",2023,"Darmawan Adi", 2);
        data.tambah(m);
        data.tambah(m1);
        data.tambah(m2);
        data.tambah(m3);
        data.tambah(m4);

        // System.out.println("==============================");
        // System.out.println("Data keseluruhan buku: ");
        // data.tampil();
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("Pencarian data :");
        System.out.println("Masukkan kode buku yang dicari:");
        System.out.print("Kode buku: ");
        int cari = inputint10.nextInt();
        System.out.println("Menggunakan sequencial search");
        int posisi = data.FindseqSearch(cari);
        data.TampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);
        // System.out.println("Menggunakan Method Find Buku");
        // Buku10 dataBuku = data.FindBuku(cari);
        // if (dataBuku!=null) {
        //     dataBuku.tampilDataBuku();            
        // } else{
        //     System.out.println("Data tidak ditemukan");
        // }
        System.out.println("==============================");
        System.out.println("Menggunakan Binary Search");
        posisi = data.FindBinarySearch(cari, 0, jumBuku-1);
        data.TampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);
    }
}
