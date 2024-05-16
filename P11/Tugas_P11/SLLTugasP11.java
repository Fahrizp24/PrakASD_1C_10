package P11.Tugas_P11;

public class SLLTugasP11 {
    NodeMahasiswa head,tail;

    public boolean IsEmpty(){
        return head == null;
    }

    public void print(){
        if (!IsEmpty()) {
            NodeMahasiswa tmp = head;
            System.out.println("Isi Linked List:\t");
            while (tmp!=null) {
                System.out.println("Urutan : "+tmp.mhs.urutan+"\tNIM: "+tmp.mhs.nim+"\t Nama: "+tmp.mhs.nama);
                tmp=tmp.next;
            }
            System.out.println("");
        }else{
            System.out.println("Linked List Kosong");
        }
    }

    public void addFirst (String urutan, String nim, String nama){
        NodeMahasiswa ndInput = new NodeMahasiswa(urutan, nim, nama, null);
        if (IsEmpty()) {
            tail =head=ndInput;
        } else {
            ndInput.next=head;
            head = ndInput;
        }
    }

    public void addLast (String urutan, String nim, String nama){
        NodeMahasiswa ndInput = new NodeMahasiswa(urutan, nim, nama, null);
        if (IsEmpty()) {
            tail=head=ndInput;
        } else {
            tail.next=ndInput;
            tail=ndInput;
            
        }
    }

    void insertAfter (String key,String urutan, String nim, String nama){
        NodeMahasiswa ndInput = new NodeMahasiswa(urutan, nim, nama, null);
        NodeMahasiswa temp = head;
        do {
            if (key.compareToIgnoreCase(temp.mhs.nim)==0) {
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

    void inserAt(int index, String urutan, String nim, String nama){
        NodeMahasiswa ndInput = new NodeMahasiswa(urutan, nim, nama, null);
        if (index<0) {
            System.out.println("tidak ada index negatif");
        } else if (index==0) {
            addFirst(urutan, nim, nama);
        }else {
            NodeMahasiswa temp = head;
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
