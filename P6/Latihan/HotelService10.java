package P6.Latihan;

public class HotelService10 {
    Hotel10 rooms[]=new Hotel10[10];
    int idx;
    void tambah (Hotel10 H){
        if (idx<rooms.length) {
            rooms[idx]=H;
            idx++;
        }else {
            System.out.println("Daftar sudah penuh!");
        }
    }
    void tampilAll(){
        for (int i = 0; i < idx; i++) {
            System.out.println("=====================================");
            System.out.println("Nama Hotel: "+rooms[i].nama);
            System.out.println("Kota: "+rooms[i].kota);
            System.out.println("Harga: "+rooms[i].harga);
            System.out.println("Bintang: "+rooms[i].bintang);
        }
    }

    void hargaBubbleSort(){
        for (int i = 0; i < idx; i++) {
            for (int j = 0; j < idx-i-1; j++) {
                if (rooms[j].harga>rooms[j+1].harga) {
                    Hotel10 temp = rooms[j];
                    rooms[j]=rooms[j+1];
                    rooms[j+1]=temp;
                }
            }
        }
    }

    void hargaSelectionSort(){
        for (int i = 0; i < idx-1; i++) {
            int indexmin=i;
            for (int j = i+1; j < idx; j++) {
                if (rooms[indexmin].harga>rooms[j].harga) {
                    indexmin=j;
                }
            }
            Hotel10 temp = rooms[indexmin];
            rooms[indexmin]=rooms[i];
            rooms[i]=temp;
        }
    }

    void bintangBubbleSort(){
        for (int i = 0; i < idx; i++) {
            for (int j = 0; j < idx-i-1; j++) {
                if (rooms[j].bintang>rooms[j+1].bintang) {
                    Hotel10 temp = rooms[j];
                    rooms[j]=rooms[j+1];
                    rooms[j+1]=temp;
                }
            }
        }
    }

    void bintangSelectionSort(){
        for (int i = 0; i < idx; i++) {
            int indexmin=i;
            for (int j = i+1; j < idx; j++) {
                if (rooms[indexmin].bintang>rooms[j].bintang) {
                    indexmin=j;
                }
            }
            Hotel10 temp = rooms[indexmin];
            rooms[indexmin]=rooms[i];
            rooms[i]=temp;
        }
    }

}
