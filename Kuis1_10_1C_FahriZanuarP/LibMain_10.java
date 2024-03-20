package Kuis1_10_1C_FahriZanuarP;

import java.util.Scanner;

public class LibMain_10 {
    public static void main(String[] args) {
        Scanner inputint10 = new Scanner(System.in);
        Scanner inputStr10 = new Scanner(System.in);
        boolean perulanganMenu=true;
        Book_10 arrBuku []= new Book_10[20];
        for (int i = 0; i < arrBuku.length; i++) {
            arrBuku[i]=new Book_10();
        }
        int jumlahBuku=0;
        do {
            System.out.println("============== JTI Library ==============");
            System.out.println("Menu: \n1. Input data buku\n2. Display data\n3. Kurangi stock\n4. Peminjaman\n5. Exit");
            System.out.print("Select menu : ");
            int pilihMenu = inputint10.nextInt();
            if (pilihMenu==1) {
                //Menu input
                System.out.print("Masukkan Judul Buku: ");
                String judulBuku = inputStr10.nextLine();
                System.out.print("Masukkan Kode Buku: ");
                String kodeBuku= inputStr10.nextLine();
                System.out.print("Masukkan Pengarang Buku: ");
                String pengarang = inputStr10.nextLine();
                System.out.print("Masukkan Tahun Terbitnya Buku: ");
                int tahunTerbit = inputint10.nextInt();
                System.out.print("Masukkan Stock Buku: ");
                int stockBuku=inputint10.nextInt();
                arrBuku[jumlahBuku]=new Book_10();
                arrBuku[jumlahBuku].Buku(kodeBuku, judulBuku, pengarang, tahunTerbit, stockBuku);
                jumlahBuku++;
                System.out.println("Data Berhasil Ditambahkan");
                System.out.println("=========================================");
                boolean kembali = pertanyaanMenu();
                if (kembali=true) {
                    continue;
                }else if (kembali=false) {
                    perulanganMenu=false;
                    break;
                }

            }else if (pilihMenu==2) {
               //menu menunjukkan 
               System.out.println("=========================================");
               for (int i = 0; i < jumlahBuku; i++) {
                    arrBuku[i].Tampilkan(arrBuku[i]);
               }
               boolean kembali = pertanyaanMenu();
               if (kembali=true) {
                   continue;
               }else{
                   perulanganMenu=false;
                   break;
               }
            }else if (pilihMenu==3) {
                //menu kurangi stock
                arrBuku[0].stock(arrBuku);
                boolean kembali = pertanyaanMenu();
                if (kembali=true) {
                    continue;
                }else{
                    perulanganMenu=false;
                    break;
                }
            }else if (pilihMenu==4) {
                //menu peminjaman
                Transaksi_10.addData(arrBuku);
                boolean kembali = pertanyaanMenu();
                if (kembali=true) {
                    continue;
                }else{
                    perulanganMenu=false;
                    break;
                }
            }else if (pilihMenu==5) {
                //exit
                perulanganMenu=false;
                break;
            }
        } while (perulanganMenu=true);
    }
    static boolean pertanyaanMenu(){
        Scanner inputStr10=new Scanner(System.in);
        boolean pertanyaanMenu = true,perulanganMenu=true;
            System.out.println("Apakah ingin kembali ke menu? (y/n)");
            String pertanyaanKembaliKeMenu = inputStr10.nextLine();
            if (pertanyaanKembaliKeMenu.equalsIgnoreCase("y")) {
                pertanyaanMenu=false;
                perulanganMenu=true;
            } else if(pertanyaanKembaliKeMenu.equalsIgnoreCase("n")) {
                pertanyaanMenu=false;
                perulanganMenu=false;
            } else {
            pertanyaanMenu();
            }
            return perulanganMenu;
    }
}
