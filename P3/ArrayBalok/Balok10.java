package P3.ArrayBalok;

public class Balok10 {
    public int panjang,lebar,tinggi;
    public Balok10(int p, int l, int t){
        panjang=p;
        lebar=l;
        tinggi=t;
    }
    public Balok10(){

    }
    public Balok10(int p,int l){
        panjang=p;
        lebar=l;
    }
    public int hitungVolume(){
        return panjang*lebar*tinggi;
    }
    public int hitungLuas(){
        return panjang*lebar;
    }
}
