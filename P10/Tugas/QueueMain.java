package P10.Tugas;
import java.util.Scanner;

public class QueueMain {

    public static void menu(){
        System.out.println("Pilih Menu: ");
        System.out.println("1. Antrian Baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek Pembeli Terdepan");
        System.out.println("4. Cek Semua Pembeli Yang Mengantri");
        System.out.println("5. Cek Pembeli Paling Belakang");
        System.out.println("6. Cek Seluruh Pembeli");
        System.out.println("-------------------------------------");
    }
    public static void main(String[] args) {
        Scanner input10=new Scanner(System.in);
        Scanner inputstr10=new Scanner(System.in);
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
                    System.out.print("Nama : ");
                    String nama = inputstr10.nextLine();
                    System.out.print("No Hp : ");
                    int umur = input10.nextInt();
                    Pembeli pb = new Pembeli(nama, umur);
                    input10.nextLine();
                    antri.Enqueue(pb);
                    break;
                case 2:
                    Pembeli data = antri.Dequeue();
                    if (!"".equals(data.nama)&&data.noHp!=0) {
                            System.out.println("Antrian yang keluar : "+data.nama+" "+ data.noHp);
                    }
                    break;
                case 3: 
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
                case 5:
                    antri.peekRear();
                    break;
                case 6: 
                    antri.daftarPembeli();
                    break;
                default:
                break;
            }
        } while (pilih==1 ||pilih ==2 || pilih ==3 || pilih ==4 || pilih==5||pilih==6);
        
    }
}
