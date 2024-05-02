package UTS_10_1C_FahriZanuarP;

public class Bank10 {
    String noRekening, nama,namaIbu, noHp, email;

    public Bank10(String noRekening, String nama, String namaIbu, String noHp, String email) {
        this.noRekening = noRekening;
        this.nama = nama;
        this.namaIbu = namaIbu;
        this.noHp = noHp;
        this.email = email;
    }

    public void tampilDataNorek10 (){
        System.out.printf("%-16s %-10s %-15s %-20s %-5s\n", noRekening, nama, namaIbu, noHp,email); 
    }
}
