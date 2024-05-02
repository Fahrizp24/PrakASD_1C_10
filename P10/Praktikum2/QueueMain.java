package P10.Praktikum2;
import java.util.Scanner;

public class QueueMain {

    public static void menu(){
        System.out.println("Pilih Menu: ");
        System.out.println("1. Antrian Baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek Antrian Terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("-------------------------------------");
    }
    public static void main(String[] args) {
        Scanner input10=new Scanner(System.in);
        System.out.print("Masukkan Kapasitas Queue: ");
        int jumlah = input10.nextInt();
        Queue antri = new Queue(jumlah);
        int pilih;
        do {
            menu();
            pilih = input10.nextInt();
            input10.nextLine();
            switch (pilih) {
                case 1:
                    System.out.println("Masukkan data baru");
                    System.out.print("No Rekening : ");
                    String norek = input10.nextLine();
                    System.out.print("Nama : ");
                    String nama = input10.nextLine();
                    System.out.print("Alamat : ");
                    String alamat = input10.nextLine();
                    System.out.print("Umur : ");
                    int umur = input10.nextInt();
                    System.out.print("Saldo : ");
                    double saldo = input10.nextDouble();
                    Nasabah nb = new Nasabah(norek, nama, alamat, umur, saldo);
                    input10.nextLine();
                    antri.Enqueue(nb);
                    break;
                case 2:
                    Nasabah data = antri.Dequeue();
                    if (!"".equals(data.norek)&&!"".equals(data.nama)&&!"".equals(data.alamat)
                        &&data.umur!=0&&data.saldo!=0) {
                            System.out.println("Antrian yang keluar : "+data.norek +" " +data.nama+" "+
                                " "+data.alamat+" "+data.umur+" "+data.saldo);
                    }
                    break;
                case 3: 
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
                default:
                    break;
            }
        } while (pilih==1 ||pilih ==2 || pilih ==3 || pilih ==4);
        
    }
}
