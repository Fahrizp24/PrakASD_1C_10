package P2.penjualanBuku;

import java.util.Scanner;

public class BukuMain10 {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        Buku10 bk1= new Buku10();
        bk1.judul="Today Ends Tomorrow Comes";
        bk1.pengarang="Denanda Pratiwi";
        bk1.halaman=198;
        bk1.stok=13;
        bk1.harga=71000;
        
        bk1.tampilInformasi();
        // bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();
        
        Buku10 bk2 = new Buku10("Self Reward","Maheera Ayesha",160,29,59000);
        // bk2.terjual(11);
        bk2.tampilInformasi();
        
        Buku10 bukuFahri = new Buku10("Endless Happiness", "Fahri Zanuar Pradian", 342, 24,100000);
        bukuFahri.tampilInformasi();

        System.out.println("\n list buku: \n1. ");
        bk1.tampilInformasi();
        System.out.println("2. ");
        bk2.tampilInformasi();
        System.out.println("3. ");
        bukuFahri.tampilInformasi();

        int pilih,banyak,total=0,hargaAwal=0,hargaDiskon=0,hargaAkhir=0;
            System.out.print("Pilih buku yang ingin dibeli: ");
            pilih=input10.nextInt();
            if (pilih==1) {
                System.out.print("Masukkkan jumlah buku yg ingin dibeli");
                banyak=input10.nextInt();
                total=bk1.terjual(banyak);
                System.out.println(total);
                if (total>0) {
                    hargaAwal=bk1.hitungHargaTotal(total, bk1.harga);
                    hargaDiskon=bk1.hitungDiskon(hargaAwal);
                    hargaAkhir=bk1.hitungHargaBayar(hargaAwal, hargaDiskon);
                }else{}
            }else if (pilih==2) {
                System.out.print("Masukkkan jumlah buku yg ingin dibeli");
                banyak=input10.nextInt();
                total=bk2.terjual(banyak);
                if (total>0) {
                    hargaAwal=bk2.hitungHargaTotal(total, bk2.harga);
                    hargaDiskon=bk2.hitungDiskon(hargaAwal);
                    hargaAkhir=bk2.hitungHargaBayar(hargaAwal, hargaDiskon);
                }else{}
            }else if (pilih==3) {
                System.out.print("Masukkkan jumlah buku yg ingin dibeli");
                banyak=input10.nextInt();
                total=bukuFahri.terjual(banyak);
                if (total>0) {
                    hargaAwal=bukuFahri.hitungHargaTotal(total, bukuFahri.harga);
                    hargaDiskon=bukuFahri.hitungDiskon(hargaAwal);
                    hargaAkhir=bukuFahri.hitungHargaBayar(hargaAwal, hargaDiskon);
                }
            }
            System.out.println("Harga Bayar Sebanyak: "+hargaAkhir);
        
        
    }
    
}
