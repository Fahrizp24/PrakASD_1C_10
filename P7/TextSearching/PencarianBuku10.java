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

    public int FindseqSearch (int cari){
        int posisi = -1;
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].kodeBuku==cari) {
                posisi=i;
                break;
            }
        }
        return posisi;
    }

    public void TampilPosisi (int x, int pos){
        if (pos!=-1) {
            System.out.println("Data "+x+" ditemukan pada index "+pos);
        }else{
            System.out.println("Data "+x+" tidak ditemukan");
        }
    }
    public void tampilData (int x, int pos){
        if (pos!=-1) {
            System.out.println("Kode Buku\t: "+x);
            System.out.println("Judul\t\t: "+listBk[pos].judulBuku);
            System.out.println("Tahun Terbit \t: "+listBk[pos].tahunTerbit);
            System.out.println("pengarang\t: "+listBk[pos].pengarang);
            System.out.println("Stock\t\t: "+listBk[pos].stock);
        }else{
            System.out.println("Data "+x+" tidak ditemukan");
        }
    }
    public Buku10 FindBuku(int cari){
        int buku = FindseqSearch(cari);
        if (buku!=-1) {
            return listBk[buku];
        }else{
            return null;
        }
    }
}
