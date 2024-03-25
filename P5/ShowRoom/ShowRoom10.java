package P5.ShowRoom;

public class ShowRoom10 {
    
    int TopAcc(int arr[][], int index, int bawah, int atas){
        if (bawah==atas||atas<bawah) {
            return arr[bawah][index];
        }else {
            int mid = (atas+bawah)/2;
            int kiri=TopAcc(arr,index, bawah, mid);
            int kanan=TopAcc(arr,index, mid+1, atas);
            return Math.max(kiri, kanan);
        }
    }

    int MinAcc(int arr[][], int index, int bawah, int atas){
        if (bawah==atas||atas<bawah) {
            return arr[bawah][index];
        }else {
            int mid = (atas+bawah)/2;
            int kiri=MinAcc(arr,index, bawah, mid);
            int kanan=MinAcc(arr,index, mid+1, atas);
            return Math.min(kiri, kanan);
        }
    }
    double Rata(int arr[][],int index){
        double total=0;
        for (int j = 0; j < arr.length; j++) {
            total+=arr[j][index];
        }
        return total/arr.length;
    }
}
