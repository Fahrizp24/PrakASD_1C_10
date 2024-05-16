package P11.Tugas2_P11;

public class SLLMainTugasp11 {
    public static void main(String[] args) {
        SLLTugasP11 singLl = new SLLTugasP11();
        singLl.print();
        singLl.addLast("Mhs3","113","Yusuf");
        singLl.print();
        singLl.addLast("Mhs5","115","Sari");
        singLl.print();
        singLl.addLast("Mhs1","111","Anton");
        singLl.print();
        singLl.addLast( "Mhs2", "112", "Prita");
        singLl.print();
        singLl.addLast("Mhs4","114","Doni");
        singLl.print();

        Mahasiswa mhsindex = singLl.getData(1);
        System.out.println("Data Mahasiswa pada index ke 1 ");
        System.out.println(mhsindex.urutan+"\t"+mhsindex.nim+"\t"+mhsindex.nama+"\t");
        System.out.println("Mahasiswa dengan nim 111 berada ada index ke-"+singLl.indexOfNim("111"));
    
        singLl.removeFirst();
        singLl.print();
        singLl.removeFirst();
        singLl.print();
        singLl.removeFirst();
        singLl.print();
        singLl.removeFirst();
        singLl.print();
    }
}
