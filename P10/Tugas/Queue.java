package P10.Tugas;

public class Queue {
    Pembeli antrian [], riwayat[];
    int front, rear, size, max, jumlah=-1;
    public Queue(int n) {
        max = n;
        antrian = new Pembeli[max];
        riwayat = new Pembeli[max*10];
        size = 0;
        front = rear= -1;
        
    }

    public boolean IsEmpty () {
        if (size == 0) {
            return true;
        }else {
            return false;
        }
    }

    public boolean IsFull (){
        if (size == max ) {
            return true;
        }else{
            return false;
        }
    }
    
    public void Enqueue (Pembeli dt){
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
        }else{
            if (IsEmpty()) {
                front=rear=0;
            }else{
                if (rear==max-1) {
                    rear=0;
                }else{
                    rear++;
                }
            }
            antrian[rear]=dt;
            size++;
            jumlah++;
            riwayat[jumlah]=dt;
            
        }
    }

    public Pembeli Dequeue(){
        Pembeli dt = new Pembeli();
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        }else{
            dt = antrian[front];
            size--;
            if (IsEmpty()) {
                front = rear=-1;
            }else{
                if (front==max-1) {
                    front=0;
                }else{
                    front++;
                }
            }
        }
        return dt;
    }
    
    public void print(){
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nama+" "+antrian[i].noHp);    
                i = (i+1)%max;
            }
            System.out.println(antrian[i].nama+" "+antrian[i].noHp);    
            System.out.println("Jumlah elemen = "+ size);
        }
    }

    public void peek (){
        if (!IsEmpty()) {
            System.out.println("Elemen terdepan: "+antrian[front].nama+" "+antrian[front].noHp);
        } else{
            System.out.println("Queue masih kosong");
        }
    }

    public void peekRear(){
        if (!IsEmpty()) {
            System.out.println("Elemen Paling Belakang: "+antrian[rear].nama+" "+antrian[rear].noHp);
        } else{
            System.out.println("Queue masih kosong");
        }
    }

    public Pembeli peekPosition(String cari){
        Pembeli dicari = new Pembeli();
        if (!IsEmpty()) {
            int i = front;
            while (i != rear) {                    
                if (cari.compareToIgnoreCase(antrian[i].nama)==0) {
                    dicari=antrian[i];
                    return dicari;
                }
                i = (i+1)%max;
            }
            if (cari.compareToIgnoreCase(antrian[i].nama)==0) {
                dicari=antrian[i];
                return dicari;
            }
        } else{
            System.out.println("Queue masih kosong");
        }
        return dicari;
    } 
    
    public void daftarPembeli(){
        if (jumlah==-1) {
            System.out.println("Masih Belum Ada Pembeli");
        } else {
                for (int i = 0; i <= jumlah; i++) {
                    System.out.println(antrian[i].nama+" "+antrian[i].noHp);    
                }
        }
    }
}
