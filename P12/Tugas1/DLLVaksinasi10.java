package P12.Tugas1;

public class DLLVaksinasi10 {
    Node10 head;
    int size;

    public DLLVaksinasi10 (){
        head = null;
        size = 0;
    }

    public boolean isEmpty (){
        return head == null;
    }

    public void addFirst(String urutan, String nama){
        if (isEmpty()) {
            head = new Node10(null,urutan, nama, null);   
        } else {
            Node10 ndInput = new Node10(null, urutan, nama, head);
            head.prev = ndInput;
            head= ndInput;
        }
        size++;
    }

    public void addLast(String urutan, String nama){
        if (isEmpty()) {
            addFirst(urutan, nama);
        } else {
            Node10 temp = head;
            while (temp.next!= null) {
                temp= temp.next;
            }
            Node10 ndInput = new Node10(temp, urutan, nama, null);
            temp.next = ndInput;
            size++;
        }
        
    }

    public void add (String urutan, String nama, int index) throws Exception{
        if (isEmpty()) {
            addFirst(urutan, nama);
        } else if (index<0 || index > size) {
            throw new Exception("Nilai index di luar batas");
        }else {
            Node10 temp = head;
            int i = 0;
            while (i < index) {
                temp = temp.next;
                i++;
            }
            Node10 ndInput = new Node10(temp.prev, urutan, nama, temp);
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
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("Daftar Pengantri Vaksin");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.printf("|%-8s | %-8s| \n","No.","Nama");            
            while (temp != null) {
                System.out.printf("|%-8s | %-8s| \n",temp.pasien.antrian,temp.pasien.nama);            
                temp = temp.next;
            }
            System.out.println("Sisa Atrian: "+size());
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
            System.out.println(head.pasien.nama+" telah selesai divaksinasi");
            head = head.next;
            head.prev=null;
            size--;
        }
    }

    public void removeLast ()throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, belum dapat dihapus");
        }else if (head.next==null) {
            System.out.println(head.pasien.nama+" telah selesai divaksinasi");
            head=null;
            size--;
            return;
        }else {
            Node10 temp = head;
            while (temp.next.next !=null) {
                temp=temp.next;
            }
            System.out.println(temp.pasien.nama+" telah selesai divaksinasi");
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

    public Antrian10 getFirst()throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked list Kosong");
        }
        return head.pasien;
    }

    public Antrian10 getLast ()throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked List Kosong");
        }
        Node10 temp = head;
        while (temp.next!=null) {
            temp = temp.next;
        }
        return temp.pasien;
    }

    public Antrian10 get (int index)throws Exception{
        if (isEmpty()||index>=size||index<0) {
            throw new Exception("Nilai index di luar batas");
        }
        Node10 temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.pasien;
    }
}
