package P5.Pangkat;

import java.util.Scanner;

public class MainPangkat10 {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        System.out.println("----------------------------");
        System.out.print("Masukkan jumlah elemen: ");
        int jml = input10.nextInt();
        Pangkat10 pk [] = new Pangkat10[jml];
        for (int i = 0; i < pk.length; i++) {
            pk[i]=new Pangkat10();
            System.out.print("Masukkan angka: ");
            pk[i].nilai=input10.nextInt();
            System.out.print("Masukkan nilai pangkat: ");
            pk[i].pangkat=input10.nextInt();            
        }
        System.out.println("HASIL PANGKAT - BRUTE FORCE");
        for (int i = 0; i < pk.length; i++) {
            System.out.println("Hasil dari "+pk[i].nilai+" pangkat "+pk[i].pangkat+" adalah"+pk[i].PangkatBF(pk[i].nilai, pk[i].pangkat));
        }
        System.out.println("HASIL PANGKAY - DIVIDE ");
        for (int i = 0; i < pk.length; i++) {
            System.out.println("Hasil dari "+pk[i].nilai+" pangkat "+pk[i].pangkat+" adalah"+pk[i].PangkatDC(pk[i].nilai, pk[i].pangkat));
        }

    }
}
