package P11.Tugas2_P11;

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

    public void addLast (String urutan, String nim, String nama){
        NodeMahasiswa ndInput = new NodeMahasiswa(urutan, nim, nama, null);
        if (IsEmpty()) {
            tail=head=ndInput;
        } else {
            tail.next=ndInput;
            tail=ndInput;
            
        }
    }

    
    Mahasiswa getData (int index){
        NodeMahasiswa temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.mhs;
    }

    int indexOfNim (String nim){
        NodeMahasiswa temp = head;
        int index= -1;
        while (temp!=null && temp.mhs.nim.compareToIgnoreCase(nim)!=0) {
            temp=temp.next;
            index++;
        }
        if (temp==null) {
            return -1;
        }else {
            return  index;
        }
    }

    void removeFirst(){
        if (IsEmpty()) {
            System.out.println("Linked List Masih Kosong, tidak dapat dihapus");
        } else if (head==tail) {
            head=tail=null;
        }else{
            head=head.next;
        }
    }

}
