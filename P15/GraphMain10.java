package P15;

import java.util.Scanner;

public class GraphMain10 {
    public static void main(String[] args)throws Exception {
        Scanner input  = new Scanner(System.in);
        Graph10 gedung = new Graph10(6);
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        gedung.degree(0);
        gedung.printGraph();
        // gedung.removeEdge(1, 3);
        // gedung.printGraph();
        System.out.print("Masukkan Gedung Asal: ");
        int asal = input.nextInt();
        System.out.print("Masukkan Gedung Tujuan: ");
        int tujuan = input.nextInt();
        int jarak = gedung.cekTetangga(asal, tujuan);
        if (jarak!=0) {
            System.out.println("Gedung "+(char) ('A'+asal)+" dan "+(char)('A'+tujuan)+" Bertetangga");
        }else{
            System.out.println("Gedung "+(char) ('A'+asal)+" dan "+(char)('A'+tujuan)+"Tidak Bertetangga");
        }
    }
}
