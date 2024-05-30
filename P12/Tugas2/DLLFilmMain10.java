package P12.Tugas2;

import java.util.Scanner;

public class DLLFilmMain10 {
    public static void main(String[] args) throws Exception{
        Scanner input10 = new Scanner(System.in);
        Scanner inputint10 = new Scanner(System.in);        
        int input = 0;
        DLLFilm10 dllFilm = new DLLFilm10();
        do {
            System.out.println("\n=====================================");
            System.out.println("DATA    FILM   LAYAR   LEBAR");
            System.out.println("=====================================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Index Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID Film");
            System.out.println("9. urut Data rating Film-Desc");
            System.out.println("10. Keluar");
            System.out.println("=====================================");
            input = inputint10.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Masukkan Data Film Posisi Awal");
                    System.out.print("ID Film : ");
                    String idF = input10.nextLine();
                    System.out.print("Judul Film: ");
                    String judulF = input10.nextLine();
                    System.out.print("Rating Film: ");
                    float ratingF = inputint10.nextFloat();
                    dllFilm.addFirst(idF, judulF, ratingF);
                    break;
                case 2:
                    System.out.println("Masukkan Data Film Posisi Akhir");
                    System.out.print("ID Film : ");
                    String idL = input10.nextLine();
                    System.out.print("Judul Film: ");
                    String judulL = input10.nextLine();
                    System.out.print("Rating Film: ");
                    float ratingL = inputint10.nextFloat();
                    dllFilm.addLast(idL, judulL, ratingL);
                    break;
                case 3: 
                    System.out.println("Masukkan Data Film Urutan Ke-");
                    System.out.print("ID Film : ");
                    String idI = input10.nextLine();
                    System.out.print("Judul Film: ");
                    String judulI = input10.nextLine();
                    System.out.print("Rating Film: ");
                    float ratingI = inputint10.nextFloat();
                    System.out.println("Data film ini akan masuk di urutan ke-");
                    int urutan = inputint10.nextInt();
                    dllFilm.add(idI, judulI, ratingI, urutan);
                    break;
                case 4: 
                    dllFilm.removeFirst();
                    break;
                case 5: 
                    dllFilm.removeLast();
                    break;
                case 6: 
                    System.out.print("Index film yang ingin dihapus: ");
                    int hapusFIlm = inputint10.nextInt();
                    dllFilm.remove(hapusFIlm);
                    break;
                case 7:
                    dllFilm.print();
                    break;
                case 8: 
                    System.out.print("Masukkan ID FILM yang ingin dicari: ");
                    String cariID = input10.nextLine();
                    int hasilCari = dllFilm.CariID(cariID);
                    dllFilm.cetakCari(hasilCari);
                    break;
                case 9 :
                    dllFilm.bubbleSort();
                    dllFilm.print();
                    break;
                case 10: 
                    input=0;
                    break;
                default:
                    break;
            }
        } while (input!=0);
    }
}
