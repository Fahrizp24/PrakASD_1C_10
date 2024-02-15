package P1;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner input10=new Scanner(System.in);
        String[] matkul = {"Pancasila","Konsep Teknologi Informasi"
        , "CTPS", "Matematika Dasar", "Bahasa INggris","Dasar Pemrograman","Praktikum dasar Pemrograman","Keselamatan dan Kesehatan Kerja"};
        int nilaiAngka[]=new int[8];
        String nilaiHuruf[]= new String[8];
        int sks[]={2,2,2,3,2,2,3,2};
        double bobotnilai[]=new double[8];
        int ip;
        for (int i = 0; i < matkul.length; i++) {
            System.out.print("Masukkan nilai angka untuk MK "+matkul[i]+": ");
            nilaiAngka[i]=input10.nextInt();
        }
        for (int i = 0; i < matkul.length; i++) {
            if (nilaiAngka[i]<=39) {
                nilaiHuruf[i]="E";
                bobotnilai[i]=0;
            }else if (nilaiAngka[i]>39&&nilaiAngka[i]<=50) {
                nilaiHuruf[i]="D";
                bobotnilai[i]=1;
            }else if (nilaiAngka[i]>50&&nilaiAngka[i]<=60) {
                nilaiHuruf[i]="C";
                bobotnilai[i]=2;
            }else if (nilaiAngka[i]>60&&nilaiAngka[i]<=65) {
                nilaiHuruf[i]="C+";
                bobotnilai[i]=2.5;
            }else if (nilaiAngka[i]>65&&nilaiAngka[i]<=73) {
                nilaiHuruf[i]="B";
                bobotnilai[i]=3;
            }else if (nilaiAngka[i]>73&&nilaiAngka[i]<=80) {
                nilaiHuruf[i]="B+";
                bobotnilai[i]=3.5;
            }else if (nilaiAngka[i]>80&&nilaiAngka[i]<=100) {
                nilaiHuruf[i]="A";
                bobotnilai[i]=4;
            }
        }
        System.out.println();
        for (int i = 0; i < matkul.length; i++) {
            System.out.printf("%-25s %-11i %-11s %-11d %n", matkul[i],nilaiAngka[i],nilaiHuruf[i],bobotnilai[i] );
        }
        int total=0;
        for (int i = 0; i < bobotnilai.length; i++) {
            total+=bobotnilai[i]*sks[i];
        }
        ip=total/18;
        System.out.println("IP: "+ip);
    }
}
