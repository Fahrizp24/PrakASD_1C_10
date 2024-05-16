package P11.singlelinkedlists;

public class SingleLinkedLists {
    Node head,tail;

    public boolean IsEmpty(){
        return head == null;
    }

    public void print(){
        if (!IsEmpty()) {
            Node tmp = head;
            System.out.print("Isi Linked List:\t");
            while (tmp!=null) {
                System.out.print(tmp.data+"\t");
                tmp=tmp.next;
            }
            System.out.println("");
        }else{
            System.out.println("Linked List Kosong");
        }
    }

    public void addFirst (int input){
        Node ndInput = new Node(input, null);
        if (IsEmpty()) {
            tail =head=ndInput;
        } else {
            ndInput.next=head;
            head = ndInput;
        }
    }

    public void addLast (int input){
        Node ndInput = new Node(input,null);
        if (IsEmpty()) {
            tail=head=ndInput;
        } else {
            tail.next=ndInput;
            tail=ndInput;
            
        }
    }

    void insertAfter (int key, int input){
        Node ndInput = new Node(input,null);
        Node temp = head;
        do {
            if (temp.data==key) {
                ndInput.next=temp.next;
                temp.next=ndInput;
                if (ndInput.next==null) {
                    tail=ndInput;
                }
                break;
            }
            temp=temp.next;
        } while (temp!=null);
    }

    void inserAt(int index, int input){
        Node ndInput = new Node(input, null);
        if (index<0) {
            System.out.println("tidak ada index negatif");
        } else if (index==0) {
            addFirst(input);
        }else {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            ndInput.next=temp.next;
            temp.next=ndInput;
            if (temp.next==null) {
                tail=ndInput;
            }
        }
    }
}
