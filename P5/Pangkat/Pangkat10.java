package P5.Pangkat;

public class Pangkat10 {
    public int nilai, pangkat;
    int PangkatBF(int a, int n){
        int hasil = 1;
        for (int i = 0; i < n; i++) {
            hasil *= a;
        }
        return  hasil;
    }
    int PangkatDC(int a, int n){
        if (n==1) {
            return a;
        } else{
            if (n%2==1) {
                return (PangkatDC(a, n/2)*PangkatDC(a, n/2)*a);
            }
                return (PangkatDC(a, n/2)*PangkatDC(a, n/2));
        }
    }
}
