package P3.ArrayBalok;

public class ArrayBalok10 {
    public static void main(String[] args) {
        Balok10[] blArray=new Balok10[4];   
        blArray[0]=new Balok10(100, 30, 12);
        blArray[1]=new Balok10(120, 40, 15);
        blArray[2]=new Balok10(210, 50, 25);
        blArray[3]=new Balok10(200, 10);
        for (int i = 0; i < blArray.length; i++) {
            System.out.println("Volume balok ke-"+i+": "+blArray[i].hitungVolume());
            System.out.println("Luas balok ke-"+i+": "+blArray[i].hitungLuas());
        }
        Segitiga10[] sgArray10=new Segitiga10[4];
        sgArray10[0]=new Segitiga10(10, 4);
        sgArray10[1]=new Segitiga10(20, 10);
        sgArray10[2]=new Segitiga10(15, 6);
        sgArray10[3]=new Segitiga10(25, 10);
        for (int i = 0; i < sgArray10.length; i++) {
            System.out.println("Luas segitiga ke-"+i+": "+sgArray10[i].hitungLuas());
            System.out.println("Keliling segitiga ke-"+i+": "+sgArray10[i].hitungKeliling());
        }
    }
    
}
