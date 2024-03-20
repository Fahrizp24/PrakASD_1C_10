package P5.Faktorial;

public class Faktorial10 {
    public int nilai;
    int faktorialIBF(int n){
        int fakto=1;
        for (int i = 1; i <= n; i++) {
            fakto=fakto*i;   
        }
        return fakto;
    }
    int faktorialIDC(int n){
        if (n==1) {
            return 1;
        }else {
            int fakto=n*faktorialIDC(n-1);
            return fakto;
        }

    }
}
