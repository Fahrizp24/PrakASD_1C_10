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

    }
}
