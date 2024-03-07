package P3.ArrayBalok;

public class Balok10 {
    public int panjang,lebar,tinggi;
    public Balok10(int p, int l, int t){
        panjang=p;
        lebar=l;
        tinggi=t;
    }
    public int hitungVolume(){
        return panjang*lebar*tinggi;
    }
}
