package P12.Tugas2;

public class DLLFilm10 {
    Node10 head;
    int size;

    public DLLFilm10 (){
        head = null;
        size = 0;
    }

    public boolean isEmpty (){
        return head == null;
    }

    public void addFirst(String id, String judul, float rating){
        if (isEmpty()) {
            head = new Node10(null,id, judul, rating, null);   
        } else {
            Node10 ndInput = new Node10(null, id, judul, rating, head);
            head.prev = ndInput;
            head= ndInput;
        }
        size++;
    }

    public void addLast(String id, String judul, float rating){
        if (isEmpty()) {
            addFirst(id, judul, rating);
        } else {
            Node10 temp = head;
            while (temp.next!= null) {
                temp= temp.next;
            }
            Node10 ndInput = new Node10(temp, id, judul, rating, null);
            temp.next = ndInput;
            size++;
        }
        
    }

    public void add (String id, String judul, float rating, int index) throws Exception{
        if (isEmpty()) {
            addFirst(id, judul, rating);
        } else if (index<0 || index > size) {
            System.out.println("Nilai index di luar batas");
            return;
        }else if (index==size) {
            addLast(id, judul, rating);
        }else {
            Node10 temp = head;
            int i = 0;
            while (i < index) {
                temp = temp.next;
                i++;
            }
            Node10 ndInput = new Node10(temp.prev, id, judul, rating, temp);
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
            System.out.println("=====================================");
            System.out.println("Cetak Data");
            while (temp != null) {
                System.out.println("ID: "+temp.film.id);
                System.out.println("   Judul FIlm: "+temp.film.judul+"\n   ipk: "+temp.film.rating);
                temp = temp.next;
            }
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
            System.out.println("Nilai index diluar batas");
            return;
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

    public Film10 getFirst()throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked list Kosong");
        }
        return head.film;
    }

    public Film10 getLast ()throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked List Kosong");
        }
        Node10 temp = head;
        while (temp.next!=null) {
            temp = temp.next;
        }
        return temp.film;
    }

    public Film10 get (int index)throws Exception{
        if (isEmpty()||index>=size||index<0) {
            throw new Exception("Nilai index di luar batas");
        }
        Node10 temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.film;
    }

    public int CariID (String id){
        int index = -1;
        Node10 temp = head;
        int i=0;
        while (i<size) {
            if (temp.film.id.compareToIgnoreCase(id)==0) {
                index = i;
                return index;
            } else{
                temp = temp.next;
                i++;
            }
        }
        return index;
    }

    public void cetakCari (int index){
        if (index==-1) {
            System.out.println("Film dengan ID Tersebut tidak ditemukan");
        } else{
            Node10 temp = head;
            int i=0;
            while (i<index) {
                temp = temp.next;
                i++;
            }
            System.out.println("ID: "+temp.film.id);
            System.out.println("   Judul FIlm: "+temp.film.judul+"\n   ipk: "+temp.film.rating);        
        }
    }

    void bubbleSort() {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
            return;
        }
        Node10 temp1, temp2;
        for (int i = 0; i < size - 1; i++) {
            temp1 = head;
            temp2 = head.next;

            for (int j = 0; j < size - 1 - i; j++) {
                if (temp1.film.rating < temp2.film.rating) {
                    Film10 tempFilm = temp1.film;
                    temp1.film = temp2.film;
                    temp2.film = tempFilm;
                }
                temp1 = temp2;
                temp2 = temp2.next;
            }
        }
    }
}
