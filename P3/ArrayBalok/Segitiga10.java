package P3.ArrayBalok;
public class Segitiga10 {
    public int alas, tinggi;
    double keliling;
    
    public Segitiga10(int a, int t){
        alas = a;
        tinggi=t;
    }
    public double hitungLuas(){
        return (alas*tinggi/2);
    }
    public double hitungKeliling(){
        keliling= Math.sqrt(alas*alas+tinggi*tinggi);
        return keliling;
    }       
}