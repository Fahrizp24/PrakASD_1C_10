package P14;

public class BinaryTreeArrayMain10 {
    public static void main(String[] args) {
        BinaryTreeArray10 bta = new BinaryTreeArray10();
        int[] data = {6,4,8,3,5,7,9,0,0,0};
        int idxLast = 6;
        bta.populateData(data, idxLast);
        System.out.print("\nInOrder Traversal : ");
        bta.TraverseInOrder(0);
        System.out.println("\n");
        System.out.println("Menambahkan data 2");
        bta.add(2);
        System.out.print("\nInorder Traversal : ");
        bta.TraverseInOrder(0);
        System.out.print("\nPreorder Traversal : ");
        bta.TraversePrOrder(0);
        System.out.print("\nPostorder Traversal : ");
        bta.TraversePostOrder(0);
    }
}
