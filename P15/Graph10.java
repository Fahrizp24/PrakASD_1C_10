package P15;

public class Graph10 {
    int vertex;
    DoubleLinkedList10 list[];
    public Graph10(int v){
        vertex=v;
        list=new DoubleLinkedList10[v];
        for (int i = 0; i < v; i++) {
            list[i]=new DoubleLinkedList10();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak){
        list[asal].addFirst(tujuan, jarak);
        // list[tujuan].addFirst(asal, jarak); //untuk undirected
    }
    
    public void degree(int asal)throws Exception{
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            //inDgree
            for (int j = 0; j < list[i].size; j++) {
                if (list[i].get(j)==asal) {
                    ++totalIn;
                }
            }
            //outDegree
            for (k = 0; k < list[asal].size(); k++) {
                list[asal].get(k);
            }
            totalOut = k;
        }
        System.out.println("InDegree dari Gedung "+(char) ('A'+asal)+": "+totalIn);
        System.out.println("OutDegree dari Gedung "+(char) ('A'+asal)+": "+totalOut);
        System.out.println("Degree dari Gedung "+(char) ('A'+asal)+": "+(totalIn+totalOut));
        // System.out.println("Degree dari Gedung "+(char) ('A'+asal)+": "+list[asal].size()); //untuk undirected
    }

    
    public void removeEdge (int asal, int tujuan){
        for (int i = 0; i < vertex; i++) {
            if (i==tujuan) {
                list[asal].remove(tujuan);
            }
        }
    }

    public void removeAlledges(){
        for (int i = 0; i < vertex; i++) {
            if (list[i].size()>0) {
                list[i].clear();
            }
        }
        System.out.println("Graf berhasil dikosongkan");
    }

    public void printGraph()throws Exception{
        for (int i = 0; i < vertex; i++) {
            if (list[i].size()>0) {
                System.out.print("Gedung "+(char) ('A'+i)+" Terhubung dengan  ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char) ('A'+list[i].get(j))+"( "+ list[i].getJarak(j)+" m),");
                }
                System.out.println();
            }
        }
        System.out.println();
    }
    
    public int cekTetangga(int asal, int tujuan)throws Exception{
        for (int i = 0; i < vertex; i++) {
            if (list[i].size()>0) {
                for (int j = 0; j < list[i].size(); j++) {
                    if (i==asal&&tujuan==list[i].get(j)) {
                        return 1;
                    }
                }
            }
        }
        return 0;
    }

    public void updateJarak (int asal, int tujuan,int jarak){
        for (int i = 0; i < vertex; i++) {
            if (i==tujuan) {
                list[asal].updateJarak(tujuan, jarak);;
            }
        }
    }

    public void hitungEdges(){
        int totalIn = 0;
        for (int i = 0; i < vertex; i++) {
            //inDgree
            for (int j = 0; j < list[i].size; j++) {
               totalIn++;
            }
            //outDegree
        }
        System.out.println("Edge yang terdapat pada graf sebanyak "+(totalIn));
    }

}
