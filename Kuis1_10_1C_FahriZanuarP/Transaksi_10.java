package Kuis1_10_1C_FahriZanuarP;

import java.util.Random;
import java.util.Scanner;

public class Transaksi_10 {
    String idTransaksi;
    Book_10 Books[]= new Book_10[10];

    static void addData(Book_10 arrBook[]){
        int cocok=1;
        Scanner input10 = new Scanner(System.in);
        Random nomor = new Random(); 
        System.out.println("Peminjaman");
        do {
            System.out.println("Input kode buku: ");
            String inputKode = input10.nextLine();
            for (int i = 0; i < arrBook.length; i++) {
                if (inputKode.equalsIgnoreCase(arrBook[i].kodeBuku)) {
                    int noTransaksi = nomor.nextInt(500);
                    System.out.println("=========================================");
                    System.out.println("No transaksi: "+noTransaksi);
                    arrBook[i].stock--;
                    Book_10.Tampilkan(arrBook[i]);
                    cocok=2;
                    break;
                }else if (i==arrBook.length-1) {
                    System.out.println("Tidak ada kode yang cocok");
                }
            }
            
        } while (cocok==1);
    }
    // static Book_10 getDatabyName(Book_10 arrBook[],String Name){
    //     for (int i = 0; i < arrBook.length; i++) {
    //         if (Name.equalsIgnoreCase(arrBook[i].kodeBuku)) {
    //             return arrBook[i];
    //         }
              
    //     }
         
    // } 
}
