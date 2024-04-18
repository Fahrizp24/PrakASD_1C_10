package P8.Postfix_Infix;

import java.util.Scanner;

public class PostFixMain10 {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        String P,Q;
        System.out.println("Masukkan ekspresi matematika (infix): ");
        Q= input10.nextLine();
        Q=Q.trim();
        Q=Q+")";
        int total = Q.length();
        Postfix10 post = new Postfix10(total);
        P=post.konversi(Q);
        System.out.println("Postfix : "+P);
    }
}
