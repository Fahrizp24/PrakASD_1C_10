package P15;

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

    public int size(){
        return size;
    }

    public int get (int index) {
        int jarak=0;
        if (isEmpty()||index>=size||index<0) {
            System.out.println("Nilai index di luar batas");
            return jarak;
        }
        Node10 temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        jarak=temp.data;
        return jarak;
    }

    public void addFirst(int input, int jarak){
        if (isEmpty()) {
            head = new Node10(null,input,jarak, null);   
        } else {
            Node10 ndInput = new Node10(null, input,jarak, head);
            head.prev = ndInput;
            head= ndInput;
        }
        size++;
    }

    public int getJarak (int index)throws Exception{
        if (isEmpty()||index>=size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node10 temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.jarak;
    }

    public void remove (int  index){
        Node10 temp = head;
        while (temp!=null) {
            if (temp.data==index) {
                if (temp.prev!=null) {
                    temp.prev.next=temp.next;
                }else {
                    head=temp.next;
                }
                if (temp.next!= null) {
                    temp.next.prev=temp.prev;
                }
                size--;
                break;
            }
            temp=temp.next;
        }
    }

    public void clear (){
        head = null;
        size = 0;
    }
}
