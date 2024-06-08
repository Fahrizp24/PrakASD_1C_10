package P15;

import java.util.Scanner;

public class GraphMain10 {
    public static void main(String[] args)throws Exception {
        Scanner input  = new Scanner(System.in);
        Graph10 gedung = new Graph10(6);
        GraphMatriks10 gdg = new GraphMatriks10(4);
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);

        // gedung.degree(0);
        // gedung.printGraph();
        // gedung.removeEdge(1, 3);
        // gedung.printGraph();
        // System.out.print("Masukkan Gedung Asal: ");
        // int asal = input.nextInt();
        // System.out.print("Masukkan Gedung Tujuan: ");
        // int tujuan = input.nextInt();
        // int jarak = gedung.cekTetangga(asal, tujuan);
        // if (jarak!=0) {
        //     System.out.println("Gedung "+(char) ('A'+asal)+" dan "+(char)('A'+tujuan)+" Bertetangga");
        // }else{
        //     System.out.println("Gedung "+(char) ('A'+asal)+" dan "+(char)('A'+tujuan)+" Tidak Bertetangga");
        // }

        // gdg.makeEdge(0, 1, 50);
        // gdg.makeEdge(1, 0, 60);
        // gdg.makeEdge(1, 2, 70);
        // gdg.makeEdge(2, 1, 80);
        // gdg.makeEdge(2, 3, 40);
        // gdg.makeEdge(3, 0, 90);
        // gdg.printGraph();
        // System.out.println("Hasil Setelah Penghapusan Edge");
        // gdg.removeEdge(2, 1);
        // gdg.printGraph();
        // System.out.print("Masukkan gedung untuk dihitung degreenya: ");
        // int degree = input.nextInt();
        // gdg.printDegree(degree);

        int pilih=0;
        do {
            System.out.println("Menu graph");
            System.out.println("0. Exit");
            System.out.println("1. Add Edge");
            System.out.println("2. Remove Edge");
            System.out.println("3. Degree");
            System.out.println("4. Print Graph");
            System.out.println("5. Cek Edge");
            System.out.print("Menu:");
            pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Asal Edge: ");
                    int tambahAsal = input.nextInt();
                    System.out.print("Tujuan Edge: ");
                    int tambahTujuan=input.nextInt();
                    System.out.print("Jarak: ");
                    int tambahJarak=input.nextInt();
                    if (gedung.cekTetangga(tambahAsal, tambahTujuan)!=0) {
                        System.out.println("Sudah ada Edge dengan asal dan tujuan yang sama");
                    }else{
                        gedung.addEdge(tambahAsal, tambahTujuan, tambahJarak);
                        System.out.println("Penambahan edge berhasil");
                    }
                    break;
                case 2:
                    System.out.print("Asal Edge: ");
                    int hapusAsal = input.nextInt();
                    System.out.print("Tujuan Edge: ");
                    int hapusTujuan=input.nextInt();
                    System.out.println(gedung.cekTetangga(hapusAsal, hapusTujuan)!=0);
                    if (gedung.list[hapusAsal].getJarak(hapusTujuan)==0) {
                        System.out.println("Tidak ada edge dengan asal dan tujuan yang sama");
                    }else{
                        gedung.removeEdge(hapusAsal, hapusTujuan);
                        System.out.println("Penghapusan edge berhasil");
                    }
                    break;
                case 3:
                    System.out.print("Gedung yang ingin dihitung : ");
                    int edge =input.nextInt();
                    gedung.degree(edge);
                    break;
                case 4:
                    gedung.printGraph();
                    break;
                case 5:
                    System.out.print("Masukkan asal: ");
                    int cekAsal=input.nextInt();
                    if (gedung.list[cekAsal].size()>0) {
                        System.out.print("Gedung "+(char) ('A'+cekAsal)+" Terhubung dengan  ");
                        for (int j = 0; j < gedung.list[cekAsal].size(); j++) {
                            System.out.print((char) ('A'+gedung.list[cekAsal].get(j))+"( "+ gedung.list[cekAsal].getJarak(j)+" m),");
                        }
                        System.out.println();
                    }
                    break;
                default:
                    break;
            }
        } while (pilih!=0);
        
    }
}
