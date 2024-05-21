package P12.doublelinkedlist;

public class DoubleLinkedList10 {
    Node10 head;
    int size;

    public DoubleLinkedList10 (){
        head = null;
        size = 0;
    }

    public boolean isEmpty (){
        return head == null;
    }

    public void addFirst(int input){
        if (isEmpty()) {
            head = new Node10(null,input, null);   
        } else {
            Node10 ndInput = new Node10(null, input, head);
            head.prev = ndInput;
            head= ndInput;
        }
        size++;
    }

    public void addLast(int input){
        if (isEmpty()) {
            addFirst(input);
        } else {
            Node10 temp = head;
            while (temp.next!= null) {
                temp= temp.next;
            }
            Node10 ndInput = new Node10(temp, input, null);
            temp.next = ndInput;
            size++;
        }
        
    }

    public void add (int input, int index) throws Exception{
        if (isEmpty()) {
            addFirst(input);
        } else if (index<0 || index > size) {
            throw new Exception("Nilai index di luar batas");
        }else {
            Node10 temp = head;
            int i = 0;
            while (i < index) {
                temp = temp.next;
                i++;
            }
            Node10 ndInput = new Node10(temp.prev, input, temp);
            temp.prev.next = ndInput;
            temp.prev = ndInput;
            size++;
        }
    }

    public int size (){
        return size;
    }

    public void clear (){
        head = null;
        size = 0;
    }

    public void print (){
        if (!isEmpty()) {
            Node10 temp = head;
            while (temp != null) {
                System.out.print(temp.data + "\t");
                temp = temp.next;
            }
            System.out.println("\nBerhasil terisi");
        } else{
            System.out.println("Linked list kosong");
        }
    }
}
