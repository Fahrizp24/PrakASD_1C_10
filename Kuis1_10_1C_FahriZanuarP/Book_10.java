package Kuis1_10_1C_FahriZanuarP;

import java.util.Scanner;

public class Book_10 {
    Scanner input10 = new Scanner(System.in);
    Scanner inputint10 = new Scanner(System.in);
    String kodeBuku, judulBuku,pengarang;
    int tahunTerbit, stock;
    void Buku(String kodeBuku, String judulBuku, String pengarang, int tahunTerbit, int stock){
        this.kodeBuku=kodeBuku;
        this.judulBuku=judulBuku;
        this.pengarang=pengarang;
        this.tahunTerbit=tahunTerbit;
        this.stock=stock;
    }
    static void Tampilkan(Book_10 arr){
        System.out.println("Kode Buku : "+arr.kodeBuku);
        System.out.println("Judul Buku : "+arr.judulBuku);
        System.out.println("Pengarang : "+arr.pengarang);
        System.out.println("Tahun terbit : "+arr.tahunTerbit);
        System.out.println("Stock : "+arr.stock);
        System.out.println("=========================================");

    }
    void stock(Book_10 arr[]){
        String inputKode;
        int cocokBuku=1;
        System.out.println("Kurangi stock karena rusak");
        do {
            System.out.println("Input kode buku: ");
            inputKode = input10.nextLine();
            for (int i = 0; i < arr.length; i++) {
                if (inputKode.equalsIgnoreCase(arr[i].kodeBuku)) {
                   System.out.println("Jumlah rusak: ");
                   int jumlahRusak= inputint10.nextInt();
                   arr[i].stock-=jumlahRusak;
                   Tampilkan(arr[i]);
                   cocokBuku=0;
                   break;
                }else if (i==arr.length-1) {
                    System.out.println("Tidak ada kode yang cocok");
                }
            }
        } while (cocokBuku==1);
    }

}
