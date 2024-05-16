package P11.singlelinkedlists;

public class SLLMain {
    public static void main(String[] args) {
        SingleLinkedLists singLl = new SingleLinkedLists();
        singLl.print();
        singLl.addFirst(890);
        singLl.print();
        singLl.addLast(760);
        singLl.print();
        singLl.addFirst(700);
        singLl.print();
        singLl.insertAfter(700,999);
        singLl.print();
        singLl.inserAt(3, 833);
        singLl.print();

        System.out.println("Data pada index ke 1 = "+singLl.getData(1));
        System.out.println("Data 3 berada ada index ke-"+singLl.indexOf(760));
    
        singLl.remove(999);
        singLl.print();
        singLl.removeAt(0);
        singLl.print();
        singLl.removeFirst();
        singLl.print();
        singLl.removeLast();
        singLl.print();
    }
}
