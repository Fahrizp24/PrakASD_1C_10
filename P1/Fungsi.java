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
        pendapatan(harga, stokbunga);
    }
    static void pendapatan(int harga[],int terjual[][]){
        int pendapatanpercabang[]=new int[4];
        for (int i = 0; i < pendapatanpercabang.length; i++) {
            for (int j = 0; j < harga.length; j++) {
                pendapatanpercabang[i]+=terjual[i][j]*harga[j];
            }
            System.out.println("Pendapatan dari cabang ke-"+(i+1)+" adalah: "+pendapatanpercabang[i]);
        }
    }
}
