package UTS_10_1C_FahriZanuarP;

public class StackTrannsaksi10 {
    Transaksi10 trs[];
    int size, top,jumlahAkun=0;
    Bank10 acc[];

    
    public void akunBank10 (int kapasitas){
        acc = new Bank10[kapasitas];
    }

    public void tambahAkunBank10(Bank10 akun){
        jumlahAkun++;
        acc[jumlahAkun-1]=akun;
    }

    public void StackTrannsaksiBank10(int kapasitas){
        trs = new Transaksi10[kapasitas];
        size = kapasitas;
        top=-1;
    }
    public boolean cekKosong10(){
        return top==-1;
    }

    public boolean cekPenuh10(){
        return top == size-1;
    }
    
    public void push10(Transaksi10 data){
        if (cekPenuh10()) {
            System.out.println("Stack Penuh");
        }else{
            top++;
            trs[top]=data;
        }
    }

    public Transaksi10 pop10(){
        if (cekKosong10()) {
            System.out.println("Stack Kosong");
            return null;
        }else{
            Transaksi10 data=trs[top];
            top--;
            return data;
        }
    }

    public void BubbleSortnorekAkun(){
        System.out.println("Sebelum diurutkan:");
        displayData10(1);
        System.out.println("\nSetelah diurutkan");
        for (int i = 0; i < jumlahAkun-1; i++) {
            for (int j = 0; j < jumlahAkun-i-1; j++) {
                if (acc[j].noRekening.compareToIgnoreCase(acc[j+1].noRekening)>0) {
                    Bank10 temp = acc[j];
                    acc[j]=acc[j+1];
                    acc[j+1]=temp;
                }
            }
        }
        displayData10(1);
    }

    public void displayData10(int pilihan){
        if (pilihan==1) {
            System.out.println("No Rekening      Nama       Nama Ibu        NoHp                 email");
            for (int i = 0; i < jumlahAkun; i++) {
                acc[i].tampilDataNorek10();
            }
        }else if (pilihan==2) {
            System.out.println("Kode transaksi  No Rekening       Saldo           Debit/Kredit    Final Saldo     Tanggal Transaksi   Type");
            for (int i = top; i >= 0; i--) {
                trs[i].tampilDataTransaksi10();
            }
        }
    }

    public int SearchingBinaryNorek10 (String cari, int left, int right){
        int mid;
        if (right>=left) {
            mid=(left+right)/2;
            if (cari.compareToIgnoreCase(acc[mid].noRekening)==0) {
                return mid;
            } else if (acc[mid].noRekening.compareToIgnoreCase(cari)>0) {
                return SearchingBinaryNorek10(cari, left, mid-1);
            } else {
                return SearchingBinaryNorek10(cari, mid+1, right);
            }
        }
        return -1;
    }
    public void maxSaldo (){
        double max = -1;
        int posisi = -1;
        for (int i = 0; i < 4; i++) {
            if (trs[i].finalsaldo<trs[i+1].finalsaldo) {
                posisi=i+1;
            }
        }
        System.out.println("Kode Transaksi : "+ trs[posisi].kodeTransaksi);
            System.out.println("No rekening : "+ trs[posisi].bankAcc.noRekening);
            System.out.println("Nama : "+trs[posisi].bankAcc.nama);
            System.out.println("Saldo : "+trs[posisi].saldo);
            System.out.println("Debit/kredit : "+trs[posisi].inOutSaldo);
            System.out.println("Saldo Akhir : "+trs[posisi].finalsaldo);
            System.out.println("Tanggal Transaksi: "+trs[posisi].tanggalTransaksi);
            System.out.println("Type : "+trs[posisi].type);
    }
    public void tampilMinmMax(){

    }
    public void tampilSearching10 (String cari){
        int hasil = SearchingBinaryNorek10(cari, 0, jumlahAkun-1);
        if (hasil!=-1) {
            System.out.println("Kode Transaksi : "+ trs[hasil].kodeTransaksi);
            System.out.println("No rekening : "+ trs[hasil].bankAcc.noRekening);
            System.out.println("Nama : "+trs[hasil].bankAcc.nama);
            System.out.println("Saldo : "+trs[hasil].saldo);
            System.out.println("Debit/kredit : "+trs[hasil].inOutSaldo);
            System.out.println("Saldo Akhir : "+trs[hasil].finalsaldo);
            System.out.println("Tanggal Transaksi: "+trs[hasil].tanggalTransaksi);
            System.out.println("Type : "+trs[hasil].type);
        }else{
            System.out.println("Transaksi tidak ditemukan");
        }
    }
}
