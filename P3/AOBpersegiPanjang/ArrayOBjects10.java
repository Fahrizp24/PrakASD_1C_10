package P3.AOBpersegiPanjang;

import java.util.Scanner;

public class ArrayOBjects10 {
    public static void main(String[] args) {
        PersegiPanjang10 [] ppArray=new PersegiPanjang10[3];
        Scanner input10 = new Scanner(System.in);
        for (int i = 0; i < ppArray.length; i++) {
            ppArray[i]=new PersegiPanjang10();
            System.out.println("Persegi Panjang ke-"+i);
            System.out.print("Masukkan Panjang: ");
            ppArray[i].panjang=input10.nextInt();
            System.out.print("Masukkan Lebar: ");
            ppArray[i].lebar=input10.nextInt();
        }
        ppArray[0] = new PersegiPanjang10();
        for (int i = 0; i < ppArray.length; i++) {
            System.out.println("Persegi Panjang ke-"+i);
            System.out.println("Panjang: "+ppArray[i].panjang+", lebar: "+ppArray[i].lebar);
        }
        PersegiPanjang10 [][] ppArray2D = new PersegiPanjang10[3][3];
        for (int i = 0; i < ppArray2D.length; i++) {
            for (int j = 0; j < ppArray2D[0].length; j++) {
                ppArray2D[i][j]=new PersegiPanjang10();
                System.out.println("Persegi Panjang Baris ke-"+i+", kolom ke-"+j);
                System.out.print("Masukkan Panjang: ");
                ppArray2D[i][j].panjang=input10.nextInt();
                System.out.print("Masukkan Lebar: ");
                ppArray2D[i][j].lebar=input10.nextInt();
            }
        }
        for (int i = 0; i < ppArray.length; i++) {
            for (int j = 0; j < ppArray2D.length; j++) {
                System.out.println("Persegi Panjang Baris ke-"+i+", kolom ke-"+j);
                System.out.println("Panjang: "+ppArray2D[i][j].panjang+", lebar: "+ppArray2D[i][j].lebar);
            }
        }
        Persegi10[] pgArray = new Persegi10[100];
        pgArray[5].sisi=20;
    }
}
