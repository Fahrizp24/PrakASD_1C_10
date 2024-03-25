package P5.SumArray;

import java.util.Scanner;

public class MainSum10 {
    public static void main(String[] args) {
        Scanner input10=new Scanner(System.in);
        System.out.println("=================================");
        System.out.print("Masukkan jumlah perusahaan: ");
        int jmlP=input10.nextInt();
        Sum10 perusahaan [] = new Sum10[jmlP];
        for (int i = 0; i < perusahaan.length; i++) {
            System.out.print("Masukkan Jumlah Bulan Dari Perusahaan ke-"+(i+1)+" : ");
            int elm = input10.nextInt();
            perusahaan[i]=new Sum10(elm);
            System.out.println("=================================");
        }
        for (int i = 0; i < perusahaan.length; i++) {
            System.out.println("Program Menghitung Keuntungan Total Perusahaan ke-"+(i+1)+" (Satuan Juta. Misal 5.9)");
            for (int j = 0; j < perusahaan[i].elemen; j++) {
                System.out.print("Masukkan untung bulan ke-"+(j+1)+"  Dari Perusahaan ke-"+(i+1)+" :");
                perusahaan[i].keuntungan[j]=input10.nextDouble();
            }
        }
        System.out.println("=================================");
        System.out.println("Algoritma Brute Force");
        for (int i = 0; i < perusahaan.length; i++) {
            System.out.println("Total Keuntungan Perusahaan ke-"+(i+1)+" selama "+perusahaan[i].elemen+" bulan adalah = "+perusahaan[i].TotalBF(perusahaan[i].keuntungan));
        }
        System.out.println("=================================");
        System.out.println("Algoritma Divide and Conquer");
        for (int i = 0; i < perusahaan.length; i++) {
            System.out.println("Total Keuntungan Perusahaan ke-"+(i+1)+" selama "+perusahaan[i].elemen+" bulan adalah = "+perusahaan[i].TotalDC(perusahaan[i].keuntungan,0,perusahaan[i].elemen-1));
        }
    }
}
