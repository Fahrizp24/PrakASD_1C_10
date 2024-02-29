package P2.dragonGame;

import java.util.Scanner;

public class DragonMain10 {
    public static void main(String[] args) {
        Dragon10 ng10 = new Dragon10();
        Scanner input10 = new Scanner(System.in);
        ng10.height=10;
        ng10.width=10;
        int kondisi = 0;
        while (kondisi==0) {
            
       
            System.out.print("Masukkan Inputan(W-A-S-D): ");
            String inputan = input10.next();
            if (inputan.equalsIgnoreCase("w")) {
                //atas
                ng10.moveUp();
            } else if (inputan.equalsIgnoreCase("a")) {
                //kiri
                ng10.moveLeft();
            } else if (inputan.equalsIgnoreCase("d")) {
                //kanan
                ng10.moveRight();
            }else if (inputan.equalsIgnoreCase("s")) {
                //bawah
                ng10.moveDown();
            }else{
                System.out.println("Inputan tidak valid");
            }
            ng10.printPosition();
            if ((ng10.x<0||ng10.x>ng10.width)||(ng10.y<0||ng10.y>ng10.height)) {
                ng10.detectCollision(ng10.x, ng10.y);
                kondisi=1;
            }
        }
    }
}
