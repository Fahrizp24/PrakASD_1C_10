package P14;

public class BinaryTreeMain10 {
    public static void main(String[] args) {
        BinaryTree10 bt = new BinaryTree10();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);
        System.out.print("PreOrder Traversal : ");
        bt.traversePreorder(bt.root);
        System.out.println("");
        System.out.print("inOrderTraversal: ");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        System.out.print("postOrderTraversal: ");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Find Node : "+bt.find(5));
        System.out.println("Delete Node 8: ");
        bt.delete(8);
        System.out.println("");
        System.out.print("PreOrder Traversal: ");
        bt.traversePreorder(bt.root);
        System.out.println("");
        bt.addRekursif(bt.root, 20);
        System.out.println("Tambah Node 20 secara rekursif");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        System.out.println("Data terkecil: "+bt.FindTerkecil());
        System.out.println("Data terbesar: "+bt.FindTerbesar());
        System.out.println();
        System.out.print("Cetak Leaf: ");
        bt.TampilDataLeaf(bt.root);
        System.out.println();
        System.out.println("Jumlah leaf yang ada di tree:"+bt.JumlahLeaf(bt.root));
    }
}
