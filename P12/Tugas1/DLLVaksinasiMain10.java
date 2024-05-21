package P12.Tugas1;

import java.util.Scanner;

public class DLLVaksinasiMain10 {
    public static void main(String[] args) throws Exception{
        Scanner input10 = new Scanner(System.in);
        Scanner inputint10 = new Scanner(System.in);        
        int input = 0;
        DLLVaksinasi10 dllVaksin = new DLLVaksinasi10();
        do {
            System.out.println("\n+++++++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4.Keluar");
            System.out.println("+++++++++++++++++++++++++++++");
            input = inputint10.nextInt();
            switch (input) {
                case 1:
                    System.out.println("-----------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("-----------------------------");
                    System.out.print("Nomor Antrian : ");
                    String antrian = input10.nextLine();
                    System.out.print("Nama Penerima: ");
                    String nama = input10.nextLine();
                    dllVaksin.addLast(antrian, nama);
                    break;
                case 2:
                    dllVaksin.removeFirst();
                    break;
                case 3: 
                    dllVaksin.print();
                    break;
                case 4: 
                    input=0;
                default:
                    break;
            }
        } while (input!=0);
    }
}
