package UTS_10_1C_FahriZanuarP;

import java.util.Scanner;

public class MainBank10 {
    public static void main(String[] args) {
        Scanner inputint = new Scanner(System.in);
        Scanner inputStr= new Scanner(System.in);
        StackTrannsaksi10 stack = new StackTrannsaksi10();
        stack.StackTrannsaksiBank10(5);
        Bank10 acc = new Bank10("16030927", "Wallace", "Mei Mei", "082-458-264-3263", "wallace@gmail.com");
        Bank10 acc1 = new Bank10("16100617", "Darius", "Susanti", "081-357-843-0547", "dairius@opt.org");
        Bank10 acc2 = new Bank10("16240401", "Fuller", "Rosalia ", "085-556-712-7062", "fuller@gmail.com");
        Bank10 acc3 = new Bank10("16270525", "Maria", "Krabelia ", "082-267-223-0234", "maria@gmail.com");
        Bank10 acc4 = new Bank10("16101617", "Gery", "Fatimah ", "083-683-416-8323", "gery@gery.com");
        stack.akunBank10(5);
        stack.tambahAkunBank10(acc);
        stack.tambahAkunBank10(acc1);
        stack.tambahAkunBank10(acc2);
        stack.tambahAkunBank10(acc3);
        stack.tambahAkunBank10(acc4);
        Transaksi10 tr = new Transaksi10("Tr001", "23-04-2024", "Debit", 500000, 100000,400000, acc);
        Transaksi10 tr1 = new Transaksi10("Tr002", "23-04-2024", "Kredit", 500000, 100000, 600000, acc1);
        Transaksi10 tr2 = new Transaksi10("Tr003", "23-04-2024", "Debit", 500000, 300000, 200000, acc2);
        Transaksi10 tr3 = new Transaksi10("Tr004", "23-04-2024", "Kredit", 500000, 150000, 650000, acc3);
        Transaksi10 tr4 = new Transaksi10("Tr005", "23-04-2024", "Kredit", 500000, 200000, 700000, acc4);
        stack.push10(tr);
        stack.push10(tr1);
        stack.push10(tr2);
        stack.push10(tr3);
        stack.push10(tr4);
        do {
            System.out.println("====================POLINEMA BANK=====================");
            System.out.println("BANK MENU: ");
            System.out.println("1. Data Norek");
            System.out.println("2. Data Transaksi (dalam stack)");
            System.out.println("3. Search Data (Mohon untuk mengurutkan terlebih dahulu di opsi 5)");
            System.out.println("4. Display Min/Max Data (Max Final Saldo)");
            System.out.println("5. Sort Data Dengan (Bubble Sort)");
            System.out.println("6. Exit");
            int pilihan = inputint.nextInt();
            switch (pilihan) {
                case 1:
                    stack.displayData10(pilihan);
                    break;
                case 2: 
                    stack.displayData10(pilihan);
                    break;
                case 3:
                    System.out.print("Input No Rekening Pengguna: ");
                    String norek = inputStr.nextLine();
                    stack.tampilSearching10(norek);
                    break;
                case 4:
                    System.out.println("Menampilkan Saldo Tertinggi");
                    stack.maxSaldo();
                    break;
                case 5:
                    stack.BubbleSortnorekAkun();
                default:
                    break;
            }
            
        } while (true);
    }
}
