package P11.Tugas_P11;

public class SLLMainTugasp11 {
    public static void main(String[] args) {
        SLLTugasP11 singLl = new SLLTugasP11();
        singLl.print();
        singLl.addFirst("Mhs3","113","Yusuf");
        singLl.print();
        singLl.addLast("Mhs5","115","Sari");
        singLl.print();
        singLl.addFirst("Mhs1","111","Anton");
        singLl.print();
        singLl.insertAfter("111", "Mhs2", "112", "Prita");
        singLl.print();
        singLl.inserAt(2, "Mhs4","114","Doni");
        singLl.print();

    }
}
