package P3.AOBBangunDatar;
import P3.AOBpersegiPanjang.*;
import P3.ArrayBalok.*;
public class BangunDatar10 {
    Segitiga10[] segitigas;
    PersegiPanjang10[] persegiPanjangs;

    void tambahSgt(Segitiga10[] segitiga){
        this.segitigas=segitiga;
    }
    void tambahpp(PersegiPanjang10[] persegiPanjang){
        this.persegiPanjangs=persegiPanjang;
    }
    void tampilBangundatar(){
        for (int i = 0; i < persegiPanjangs.length; i++) {
            System.out.println("Persegi panjang "+(1+i));
            System.out.println("Panjang: "+persegiPanjangs[i].panjang);
            System.out.println("Lebar: "+persegiPanjangs[i].lebar);
        }
        System.out.println("===================================");
        for (int i = 0; i < segitigas.length; i++) {
            System.out.println("Segitiga: "+(i+1));
            System.out.println("Alas: "+segitigas[i].alas);
            System.out.println("Tinggi: "+segitigas[i].tinggi);
        }
    }
}
