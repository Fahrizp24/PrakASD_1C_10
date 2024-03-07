package P3.AOBMahasiswa;

import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        DataMahasiswa10 [] mhs = new DataMahasiswa10[3];
        Scanner inputStr10 = new Scanner(System.in);
        Scanner inputDb10 = new Scanner(System.in);
        Scanner inputchar10 = new Scanner(System.in);

        for (int i = 0; i < mhs.length; i++) {
            mhs[i]= new DataMahasiswa10();
            System.out.println("Masukkan data mahasiswa ke-"+(i+1));
            System.out.print("Masukkan nama: ");
            mhs[i].nama=inputStr10.nextLine();
            System.out.print("Masukkan nim: ");
            mhs[i].nim=inputStr10.nextLine();
            System.out.print("Masukkan jenis kelamin (p/l): ");
            mhs[i].jenisKelamin=inputchar10.next().charAt(0);
            System.out.print("Masukkan ipk: ");
            mhs[i].ipk=inputDb10.nextDouble();
        }
        System.out.println();
        for (int i = 0; i < mhs.length; i++) {
            System.out.println("Data mahasiswa ke-"+(i+1));
            System.out.println("Nama: "+mhs[i].nama);
            System.out.println("Nim: "+mhs[i].nim);
            System.out.println("Jenis kelamin: "+mhs[i].jenisKelamin);
            System.out.println("Ipk: "+mhs[i].ipk);
        }
    }
}
