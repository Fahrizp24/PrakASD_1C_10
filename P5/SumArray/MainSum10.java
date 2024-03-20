package P5.SumArray;

import java.util.Scanner;

public class MainSum10 {
    public static void main(String[] args) {
        Scanner input10=new Scanner(System.in);
        System.out.println("=================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.print("Masukkan Jumlah Bulan: ");
        int elm = input10.nextInt();
        Sum10 sm = new Sum10(elm);
        System.out.println("=================================");
        for (int i = 0; i < sm.elemen; i++) {
            System.out.print("Masukkan untung bulan ke-"+(i+1)+" :");
            sm.keuntungan[i]=input10.nextDouble();
        }
        System.out.println("=================================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total Keuntungan Perusahaan selama "+sm.elemen+" bulan adalah = "+sm.TotalBF(sm.keuntungan));
        System.out.println("=================================");
        System.out.println("Algoritma Divide and Conquer");
        System.out.println("Total Keuntungan Perusahaan selama "+sm.elemen+" bulan adalah = "+sm.TotalDC(sm.keuntungan,0,sm.elemen-1));

    }
}
