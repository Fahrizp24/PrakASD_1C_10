package P7.MergeSortTest;

public class MergeSorting10 {
    public void MergeSort(int[] data){
        sort(data, 0, data.length-1);
    }
    public void merge (int data[], int left, int midle, int right){
        int temp[]= new int[data.length];
        for (int i = left; i <= right; i++) {
            temp[i]=data[i];
        }
        int a = left;
        int b = midle + 1; 
        int c = left;
        while (a<= midle&&b<=right) {
            if (temp[a]<= temp[b]) {
                data[c]=temp[a];
                a++;
            } else {
                data[c]=temp[b];
                b++;
            }
            c++;
        }
        int s = midle-a;
        for (int i = 0; i <= s; i++) {
            data[c+i]=temp[a+i];
        }
    }
    public void sort(int data[], int left, int right){
        if (left<right) {
            int midle=(left+right)/2;
            sort(data, left, midle);
            sort(data, midle+1, right);
            merge(data, left, midle, right);
        }
    }
    public void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
