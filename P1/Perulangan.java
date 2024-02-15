package P1;
import java.util.Scanner;
public class Perulangan {
    public static void main(String[] args) {
        long nim,n;
        Scanner input10=new Scanner(System.in);
        System.out.print("Masukkan NIM: ");
        nim=input10.nextLong();
        n=nim%100;
        if (n<10) {
            n+=10;
        }
        System.out.println("n=: "+n);
        for (int i = 1; i <= n; i++) {
            if (i==6||i==10) {
                continue;
            }else if (i%2==0) {
                System.out.print(i+" ");
            }else if (i%2!=0){
                System.out.print("* ");
            }
        }
    }
}
