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
        for (int i = 0; i < ppArray.length; i++) {
            System.out.println("Persegi Panjang ke-"+i);
            System.out.println("Panjang: "+ppArray[i].panjang+", lebar: "+ppArray[i].lebar);
        }

    }
}
