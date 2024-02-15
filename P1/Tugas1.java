package P1;
import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        char Kode[]={'A','B','D','E','F','G','H','L','N','T'};
        char kota [][]={
            {'B','A','N','T','E','N'},
            {'J','A','K','A','R','T','A'},
            {'B','A','N','D','U','N','G'},
            {'C','I','R','E','B','O','N'},
            {'B','O','G','O','R'},
            {'P','E','K','A','L','O','N','G','A','N'},
            {'S','E','M','A','R','A','N','G'},
            {'S','U','R','A','B','A','Y','A'},
            {'M','A','L','A','N','G'},
            {'T','E','N','G','A','L'}
        };
        Scanner input10=new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor: ");
        String kode = input10.nextLine();
        if (kode.equalsIgnoreCase("A")) {
            System.out.println("Banten");
        }else if (kode.equalsIgnoreCase("B")) {
            System.out.println("Jakarta");
        }else if (kode.equalsIgnoreCase("D")) {
            System.out.println("Bandung");
        }else if (kode.equalsIgnoreCase("E")) {
            System.out.println("Cirebon");
        }else if (kode.equalsIgnoreCase("F")) {
            System.out.println("Bogor");
        }else if (kode.equalsIgnoreCase("G")) {
            System.out.println("Pekalongan");
        }else if (kode.equalsIgnoreCase("H")) {
            System.out.println("Semarang");
        }else if (kode.equalsIgnoreCase("L")) {
            System.out.println("Surabaya");
        }else if (kode.equalsIgnoreCase("N")) {
            System.out.println("Malang");
        }else if (kode.equalsIgnoreCase("T")) {
            System.out.println("Tegal");
        }else{
            System.out.println("Kode tidak ditemukan");
        }
    }
}
