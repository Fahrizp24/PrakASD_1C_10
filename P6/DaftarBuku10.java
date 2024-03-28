package P6;

public class DaftarBuku10 {
    Buku10 listBk[]= new Buku10[5];
    int idx;
    void tambah (Buku10 m){
        if (idx<listBk.length){
            listBk[idx]=m;
            idx++;
        }else{
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil(){
        for (Buku10 m : listBk) {
            m.tampilDataBuku();
        }
    }
    void bubbleSort(){
        for (int i = 0; i < listBk.length; i++) {
            for (int j = 0; j < listBk.length-i-1; j++) {
                if (listBk[j].stock>listBk[j+1].stock) {
                    Buku10 tempBk = listBk[j];
                    listBk[j]=listBk[j+1];
                    listBk[j+1]=tempBk;
                }
            }
        }
    }
    void selectionSort(){
        for (int i = 0; i < listBk.length-1; i++) {
            int idxMin = i;
            for (int j = i+1; j < listBk.length; j++) {
                if (listBk[j].stock>listBk[idxMin].stock) {
                    idxMin=j;
                }   
            }
            Buku10 tempBk = listBk[idxMin];
            listBk[idxMin]=listBk[i];
            listBk[i]=tempBk;
        }
    }
    void insertionSort (){
        for (int i = 1; i < listBk.length; i++) {
            Buku10 tempBk = listBk[i];
            int j = i;
            while (j>0 && listBk[j-1].stock<tempBk.stock) {
                listBk[j]=listBk[j-1];
                j--;
            }               
            listBk[j]=tempBk;
        }
    }
}
