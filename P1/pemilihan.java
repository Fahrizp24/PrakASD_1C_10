package P1;

/**
 * pemilihan
 */
import java.util.Scanner;
public class pemilihan {

    public static void main(String[] args) {
        int nilaiUas,nilaiUts,nilaiTugas,nilaiKuis;
        String nilaiHuruf;
        double nilaiAkhir;
        Scanner input10 = new Scanner(System.in);
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas=input10.nextInt();
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis=input10.nextInt();
        System.out.print("Masukkan nilai UTS: ");
        nilaiUts=input10.nextInt();
        System.out.print("Masukkan nilai UAS: ");
        nilaiUas=input10.nextInt();
        if ((nilaiKuis<0||nilaiKuis>100)||(nilaiTugas<0||nilaiTugas>100)||(nilaiUas<0||nilaiUas>100)||(nilaiUts<0||nilaiUts>100)) {
            System.out.println("Nilai Tidak Valid");
        }else{
            nilaiAkhir=nilaiTugas*0.2+nilaiKuis*0.2+nilaiUas*0.3+nilaiUts*0.3;
            System.out.println("Nilai akhir : "+nilaiAkhir);
            if (nilaiAkhir<=39) {
                System.out.println("Nilai huruf: E");
            }else if (nilaiAkhir>39&&nilaiAkhir<=50) {
                System.out.println("Nilai huruf: D");
            }else if (nilaiAkhir>50&&nilaiAkhir<=60) {
                System.out.println("Nilai huruf: C");
            }else if (nilaiAkhir>60&&nilaiAkhir<=65) {
                System.out.println("Nilai huruf: C+");
            }else if (nilaiAkhir>65&&nilaiAkhir<=73) {
                System.out.println("Nilai huruf: B");
            }else if (nilaiAkhir>73&&nilaiAkhir<=80) {
                System.out.println("Nilai huruf: B+");
            }else if (nilaiAkhir>80&&nilaiAkhir<=100) {
                System.out.println("Nilai huruf: A");
            }            
            if (nilaiAkhir>50) {
                System.out.println("Selamat anda lulus");
            }else{
                System.out.println("Anda Tidak Lulus");
            }
        }

    }
}