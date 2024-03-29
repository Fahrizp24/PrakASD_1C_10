package P6.Latihan;

import java.util.Scanner;

public class HotelMain10 {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        Hotel10 h= new Hotel10("Lavayette", "Malang", 290000,(byte)5);
        Hotel10 h1= new Hotel10("C1", "Sumenep", 250000, (byte)4);
        Hotel10 h2= new Hotel10("Family", "Sumenep", 345000, (byte)3);
        Hotel10 h3= new Hotel10("Bassfot", "Surabaya", 450000, (byte)2);
        Hotel10 h4= new Hotel10("Utami", "Pamekasan", 234000, (byte)1);
        Hotel10 h5= new Hotel10("Manjoter", "Sidoarjo", 195000, (byte)4);
        HotelService10 listHotel = new HotelService10();
        listHotel.tambah(h);
        listHotel.tambah(h1);
        listHotel.tambah(h2);
        listHotel.tambah(h3);
        listHotel.tambah(h4);
        listHotel.tambah(h5);
        System.out.println("=================================");
        System.out.println("List Hotel Sebelum Diurutkan");
        listHotel.tampilAll();
        System.out.println();
        System.out.println("=================================");
        System.out.println("1. Urut list berdasarkan Harga Terendah");
        System.out.println("2. Urut list berdasarkan Bintang Tertinggi");
        int menu = input10.nextInt();
        if (menu==1) {
            System.out.println("=================================");
            System.out.println("List hotel berdasarkan harga menggunakan bubble sort");
            listHotel.hargaBubbleSort();
            listHotel.tampilAll();
            System.out.println();
            System.out.println("=================================");
            System.out.println("List hotel berdasarkan harga menggunakan selection sort");
            listHotel.hargaSelectionSort();
            listHotel.tampilAll();
        } else if (menu==2) {
            System.out.println("=================================");
            System.out.println("List hotel berdasarkan bintang menggunakan bubble sort");
            listHotel.bintangBubbleSort();
            listHotel.tampilAll();
            System.out.println();
            System.out.println("=================================");
            System.out.println("List hotel berdasarkan bintang menggunakan selection sort");
            listHotel.bintangSelectionSort();
            listHotel.tampilAll();
        }


    }
}
