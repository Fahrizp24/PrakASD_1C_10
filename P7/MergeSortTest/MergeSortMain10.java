package P7.MergeSortTest;

public class MergeSortMain10 {
    public static void main(String[] args) {
        int data[]= {10,40,30,50,70,20,100,90};
        System.out.println("Sorting dengan merge sort");
        MergeSorting10 mSort = new MergeSorting10();
        System.out.println("Data awal");
        mSort.printArray(data);
        mSort.MergeSort(data);
        System.out.println("Setelah diurutkan");
        mSort.printArray(data);
    }
}
