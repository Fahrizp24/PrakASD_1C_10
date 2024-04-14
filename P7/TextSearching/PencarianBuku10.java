package P7.TextSearching;

public class PencarianBuku10 {
    Buku10 listBk []= new Buku10[5]; 
    int idx; 
    
    void tambah(Buku10 m){
        if (idx<listBk.length) {
            listBk[idx]=m;
            idx++;
        } else {
            System.out.println("Data Sudah Penuh");
        }
    }

    void tampil(){
        for (Buku10 m : listBk) {
            m.tampilDataBuku();
        }
    }

    public int FindseqSearch (String cari){
        int posisi = -1;
        for (int i = 0; i < listBk.length; i++) {
            if (cari.compareToIgnoreCase(listBk[i].kodeBuku)==0) {
                posisi=i;
                break;
            }
        }
        return posisi;
    }

    public void TampilPosisi (String x, int pos){
        if (pos!=-1) {
            System.out.println("Data "+x+" ditemukan pada index "+pos);
        }else{
            System.out.println("Data "+x+" tidak ditemukan");
        }
    }
    public void tampilData (String x, int pos){
        if (pos!=-1) {
            System.out.println("Kode Buku\t: "+listBk[pos].kodeBuku);
            System.out.println("Judul\t\t: "+listBk[pos].judulBuku);
            System.out.println("Tahun Terbit \t: "+listBk[pos].tahunTerbit);
            System.out.println("pengarang\t: "+listBk[pos].pengarang);
            System.out.println("Stock\t\t: "+listBk[pos].stock);
        }else{
            // System.out.println("Data "+x+" tidak ditemukan");
        }
    }
    public Buku10 FindBuku(String cari){
        int buku = FindseqSearch(cari);
        if (buku!=-1) {
            return listBk[buku];
        }else{
            return null;
        }
    }
    public int FindBinarySearch (String cari, int left, int right){
        int mid;
        if (right>=left) {
            mid=(left+right)/2;
            if (cari.compareToIgnoreCase(listBk[mid].kodeBuku)==0) {
                return (mid);
            } else if (listBk[mid].kodeBuku.compareToIgnoreCase(cari)<0) {
                return FindBinarySearch(cari, left, mid-1);
            } else {
                return FindBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }

    public int FindBinarySearchJudBuku (String cari, int left, int right){
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari.compareToIgnoreCase(listBk[mid].judulBuku) == 0) {
                return mid;
            } else if (cari.compareToIgnoreCase(listBk[mid].judulBuku) < 0) {
                return FindBinarySearchJudBuku(cari, left, mid - 1);
            } else {
                return FindBinarySearchJudBuku(cari, mid + 1, right);
            }
        }
        return -1;
    }
    public int FindseqSearchJudBuku (String cari){
        int posisi = -1;
        for (int i = 0; i < listBk.length; i++) {
            if (cari.compareToIgnoreCase(listBk[i].judulBuku)==0) {
                posisi=i;
                break;
            }
        }
        return posisi;
    }
    public void BubbleSortKode(){
        for (int i = 0; i < listBk.length-1; i++) {
            for (int j = 0; j < listBk.length-1; j++) {
                if (listBk[j].kodeBuku.compareToIgnoreCase(listBk[j+1].kodeBuku)>0) {
                    Buku10 tempBk = listBk[j];
                    listBk[j]=listBk[j+1];
                    listBk[j+1]=tempBk;
                }
            }
        }
    }
    public void BubbleSortJudulBuku(){
        for (int i = 0; i < listBk.length-1; i++) {
            for (int j = 0; j < listBk.length-i-1; j++) {
                if (listBk[j].judulBuku.compareToIgnoreCase(listBk[j+1].judulBuku)>0) {
                    Buku10 tempBk = listBk[j];
                    listBk[j]=listBk[j+1];
                    listBk[j+1]=tempBk;
                }
            }
        }
    }
   
}
