package P3.AOBBangunDatar;
import P3.AOBpersegiPanjang.PersegiPanjang10;
import P3.ArrayBalok.*;

public class BangunMain {
    public static void main(String[] args) {
        Segitiga10 sg1 = new Segitiga10(5,10);
        Segitiga10 sg2 = new Segitiga10(10,15);
        Segitiga10 sg3 = new Segitiga10(15,20);
        PersegiPanjang10 pp1= new PersegiPanjang10(5,10);
        PersegiPanjang10 pp2= new PersegiPanjang10(2,8);
        PersegiPanjang10 pp3= new PersegiPanjang10(10,15);

        Segitiga10[] s = new Segitiga10[3];
        PersegiPanjang10[]p=new PersegiPanjang10[3];
        s[0]=sg1;
        s[1]=sg2;
        s[2]=sg3;
        p[0]=pp1;
        p[1]=pp2;
        p[2]=pp3;
        BangunDatar10 bd = new BangunDatar10();
        bd.tambahSgt(s);
        bd.tambahpp(p);
        bd.tampilBangundatar();

    }
}
