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

    public void removeFirst() throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked List Masih Kosong, tidak dapat dihapus");
        }else if (size==1) {
            removeLast();
        }else {
            head = head.next;
            head.prev=null;
            size--;
        }
    }

    public void removeLast ()throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, belum dapat dihapus");
        }else if (head.next==null) {
            head=null;
            size--;
            return;
        }else {
            Node10 temp = head;
            while (temp.next.next !=null) {
                temp=temp.next;
            }
            temp.next=null;
            size--;
        }
    }

    public void remove(int index)throws Exception{
        if (isEmpty()||index>=size||index<0) {
            throw new Exception("Nilai index diluar batas");
        }else if (index==0) {
            removeFirst();;
        }else{
            Node10 temp = head;
            int i = 0;
            while (i<index) {
                temp=temp.next;
                i++;
            }
            if (temp.next==null) {
                temp.prev.next=null;
            } else if (temp.prev==null) {
                temp = temp.next;
                temp.prev=null;
                head=temp;
            } else {
                temp.prev.next=temp.next;
                temp.next.prev=temp.prev;
            }
            size--;
        }
    }

    public int getFirst()throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked list Kosong");
        }
        return head.data;
    }

    public int getLast ()throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked List Kosong");
        }
        Node10 temp = head;
        while (temp.next!=null) {
            temp = temp.next;
        }
        return temp.data;
    }

    public int get (int index)throws Exception{
        if (isEmpty()||index>=size||index<0) {
            throw new Exception("Nilai index di luar batas");
        }
        Node10 temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }
}
