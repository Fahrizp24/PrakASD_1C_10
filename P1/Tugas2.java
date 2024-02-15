package P1;
import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        int s,v,t;
        int menu=menu();
        Scanner input10=new Scanner(System.in);
        switch (menu) {
            case 1:
                System.out.print("Masukkan jarak (meter): ");
                s=input10.nextInt();
                System.out.print("Masukkan waktu (detik): ");
                t=input10.nextInt();
                kecepatan(s,t);
                break;
            case 2:
                System.out.print("Masukkan kecepatan (meter/detik): ");
                v=input10.nextInt();
                System.out.print("MAsukkan waktu (detik): ");
                t=input10.nextInt();
                jarak(v, t);
                break;
            case 3:
                System.out.print("MAsukkan jarak (meter): ");
                s=input10.nextInt();
                System.out.print("MAsukkan kecepatan (meter/detik): ");
                v=input10.nextInt();
                waktu(s, v);
                break;
            default:
                break;
        }

    }
    static int menu(){
        System.out.println("Rumus apa yang ingin anda gunakan?");
        System.out.println("1. Mencari Kecepatan\n2. Mencari Jarak\n3. Mencari Waktu");
        Scanner input10 = new Scanner(System.in);
        int menu=input10.nextInt();
        return menu;
    }
    static void kecepatan(int s, int t){
        double v = (double)s/t;
        System.out.println("Kecepatannya adalah "+v+" m/detik");
    }
    static void jarak(int v, int t){
        int s=v*t;
        System.out.println("Jaraknya adalah "+s+" meter");
    }
    static void waktu(int s, int v){
        int t=s/v;
        System.out.println("Waktunya adalah "+t+" detik");
    }

}
