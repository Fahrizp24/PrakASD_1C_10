package P2.dragonGame;

public class Dragon10 {
    int x,y,width,height;
    void moveLeft(){
        x--;
    }
    void moveRight(){
        x++;
    }
    void moveUp(){
        y++;
    }
    void moveDown(){
        y--;
    }
    void printPosition(){
        System.out.println("posisi anda pada x:"+x+" y:"+y);
       
    }
    void detectCollision(int x, int y){
        System.out.println("ANDA KLAH MUAHAHAHAHAHAH");
    }
}
