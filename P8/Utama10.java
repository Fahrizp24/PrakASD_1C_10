package P8;

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
            System.out.println("5. Keluar");
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
                    break;
                default:
                    System.out.println("Pilihan yang anda input tidak valid");
            }
        }
    }
}
