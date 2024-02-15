package P1;
import java.util.Scanner;
public class Fungsi {
    
    public static void main(String[] args) {
        int stokbunga[][]={
            {10,5,15,7},
            {6,11,9,12},
            {2,10,10,5},
            {5,7,12,9}};
        int harga[]={75000,50000,60000,10000};
        String bunga[]={"Aglonema","Keladi","Alocasia","Mawar"};
        hitungStok(stokbunga, bunga);
    }
    static void hitungStok(int stok[][],String bunga[]){
        System.out.println("Cabang ke berapa yang ingin dirubah?");
        Scanner input10 = new Scanner(System.in);
        int cabang = input10.nextInt();
        for (int i = 0; i < stok.length; i++) {
            System.out.print("masukkan bunga "+bunga[i]+" yang mati: ");
            int bungaMati=input10.nextInt();
            stok[cabang-1][i]-=bungaMati;
        }            
        System.out.println("\nStok bunga pada cabang RoyalGarden 4 ");
        for (int i = 0; i < bunga.length; i++) {
            System.out.println("Stok bunga "+bunga[i]+": "+stok[cabang-1][i]);
        }
    }
    
}
