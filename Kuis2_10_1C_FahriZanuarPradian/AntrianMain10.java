package Kuis2_10_1C_FahriZanuarPradian;

import java.util.Scanner;

public class AntrianMain10 {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        Scanner inputstr10 = new Scanner(System.in);
        int pilih = 0;
        DoubleLinkedList10 dll = new DoubleLinkedList10();
        dll.addLast10("agt01", "Mamluatul", "08224500000");
        dll.addLast10("agt05", "Abyaz A.M", "08224511111");
        dll.addLast10("agt07", "Yoshinoya", "08224522222");

        dll.addBuku10("BK-01", "Algoritma Struktur Data", 5);
        dll.addBuku10("BK-02", "Merancang Basis Data Sederhana", 5);
        dll.addBuku10("BK-03", "Desain Website Interaktif", 5);
        dll.addBuku10("BK-04", "Basic Pemrograman Komputer", 5);
        dll.addBuku10("BK-05", "Rekayasa Perangkat Lunak", 5);
        
        do {
            System.out.println("\n===============================================");
            System.out.println("Menu");
            System.out.println("1. Add Antrian");
            System.out.println("2. Print Antrian");
            System.out.println("3. Delete Antrian");
            System.out.println("4. Stock Buku Paling Sedikit");
            System.out.println("5. Exit");
            System.out.println("===============================================");
            System.out.print("Select Menu (1-5): ");
            pilih = input10.nextInt();
            System.out.println("\n===============================================");
            switch (pilih) {
                case 1:
                    System.out.println("Input Data Antrian");
                    System.out.println("===============================================");
                    System.out.println("Nomor Antrian\t\t: "+(dll.nomorAntrian+1));
                    System.out.print("Kode Anggota\t\t: ");
                    String kode = inputstr10.nextLine();
                    System.out.print("Nama Anggota\t\t: ");
                    String nama = inputstr10.nextLine();
                    System.out.print("Nomor HP\t\t: ");
                    String noHp = inputstr10.nextLine();
                    dll.addLast10(kode, nama, noHp);
                    break;
                case 2:
                    System.out.println("Daftar Antrian");
                    System.out.println("===============================================");
                    dll.print10();
                    break;
                case 3:
                    System.out.println("Anggota "+dll.head.anggota.kodeAnggota+" Meminjam Buku.");
                    dll.printBuku10();
                    System.out.println("===============================================");
                    System.out.println("Peminjaman Buku");
                    System.out.println("===============================================");
                    System.out.print("Masukkan Kode Buku: ");
                    String kodePinjam = inputstr10.nextLine();
                    System.out.println("\n===============================================");

                    int posisi = dll.cariBuku10(kodePinjam);
                    if (posisi!=-1) {
                        System.out.println("===============================================");
                        System.out.println("Data "+kodePinjam+" Berada Pada Incex ke-"+posisi);
                        System.out.println("===============================================");
                        System.out.print("Masukkan Jumlah Pinjam: ");
                        int jumlahPinjam = input10.nextInt();
                        dll.pinjamBuku10(posisi, jumlahPinjam);
                        System.out.println("===============================================");
                        dll.removeFirst10();
                    }
                    break;
                case 4:
                    System.out.println("Stock Terkecil");
                    dll.stockTerkecil10();
                    break;
                case 5:
                    break;
            
                default:
                    break;
            }
        } while (pilih!=5);
    }
}
