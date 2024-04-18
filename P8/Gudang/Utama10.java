package P8.Gudang;

import java.util.Scanner;

public class Utama10 {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        Scanner inputstr10 = new Scanner(System.in);
        System.out.print("Masukkan jumlah kapasitas gudang : ");
        int kapasitas = input10.nextInt();
        Gudang10 gudang = new Gudang10(kapasitas);
        while (true) {
            System.out.println("\n Menu:");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil Barang");
            System.out.println("3. Tampilkan Tumpukan Barang");
            System.out.println("4. Lihat Barang Teratas");
            System.out.println("5. Lihat Barang terbawah");
            System.out.println("6. Cari Barang");
            System.out.println("7. Keluar");
            System.out.print("Pilih Operasi: ");
            int pilihan = input10.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = input10.nextInt();
                    System.out.print("Masukkan nama barang: ");
                    String nama = inputstr10.nextLine();
                    System.out.print("Masukkan kategori barang: ");
                    String kategori = inputstr10.nextLine();
                    Barang10 barangBaru = new Barang10(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2: 
                    gudang.ambilBarang();
                    break;
                case 3: 
                    gudang.tampilkanBarang();
                    break;
                case 4: 
                    gudang.lihatBarangTeratas();
                    break;
                case 5:
                    gudang.lihatBarangterbawah();
                    break;
                case 6: 
                    System.out.println("Cari barang berdasarkan ");
                    System.out.println("1. Kode\n2. Barang");
                    int berdasarkan = input10.nextInt();
                    int cariKode=0;
                    String cariNama="";
                    switch (berdasarkan) {
                        case 1:
                            System.out.print("Masukkan kode: ");
                            cariKode = input10.nextInt();
                            break;
                        case 2:
                            System.out.print("Masukkan nama: ");
                            cariNama = inputstr10.nextLine();
                        default:
                            break;
                    }
                    gudang.cariBarang(berdasarkan, cariKode, cariNama);
                    break;
                case 7:
                    break;
                    default:
                    System.out.println("Pilihan yang anda input tidak valid");
            }
        }
    }
}
