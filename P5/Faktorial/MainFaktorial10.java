package P5.Faktorial;

import java.util.Scanner;

public class MainFaktorial10 {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        System.out.println("-------------------------------");
        System.out.print("Masukkan jumlah elemen: ");
        int jml = input10.nextInt();
        Faktorial10[] fk = new Faktorial10[10];
        for (int i = 0; i < jml; i++) {
            fk[i]=new Faktorial10();
            System.out.println("Masukkan nilai data ke-"+(i+1)+" :");
            fk[i].nilai= input10.nextInt();
        }
        System.out.println("Hasil Brute Force");
        for (int i = 0; i < jml; i++) {
            System.out.println("Hasil perhitungan faktorial menggunakan brute force adalah "+fk[i].faktorialIBF(fk[i].nilai));
        }
        System.out.println("Hasil Divide Conquer");
        for (int i = 0; i < jml; i++) {
            System.out.println("Hasil perhitungan faktorial menggunakan divide conquer adalah "+fk[i].faktorialIDC(fk[i].nilai));
        }
    }
}
