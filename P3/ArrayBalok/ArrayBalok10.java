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
    }
    
}
