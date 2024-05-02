package UTS_10_1C_FahriZanuarP;

public class Transaksi10 {
    String kodeTransaksi, tanggalTransaksi, type;
    double saldo, inOutSaldo, finalsaldo;
    Bank10 bankAcc;

    public Transaksi10(String kodeTransaksi, String tanggalTransaksi, String type, double saldo, double inOutSaldo, double finalsaldo, Bank10 bankAcc) {
        this.kodeTransaksi = kodeTransaksi;
        this.tanggalTransaksi = tanggalTransaksi;
        this.type = type;
        this.saldo = saldo;
        this.inOutSaldo = inOutSaldo;
        this.finalsaldo = finalsaldo;
        this.bankAcc = bankAcc;
    }

    public void tampilDataTransaksi10(){
        System.out.printf("%-15s %-17s %-15s %-15s %-15s %13s %12s \n", kodeTransaksi, bankAcc.noRekening, saldo, inOutSaldo,finalsaldo,tanggalTransaksi,type ); 
    }

}
