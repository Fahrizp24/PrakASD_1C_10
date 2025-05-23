package P15;

public class GraphMatriks10 {
    int vertex;
    int[][] matriks;

    public GraphMatriks10 (int v){
        vertex = v;
        matriks = new int [v][v];
    }

    public void makeEdge(int asal, int tujuan, int jarak){
        matriks[asal][tujuan]=jarak;
    }

    public void removeEdge(int asal, int tujuan){
        matriks[asal][tujuan]=0;
    }

    public void printGraph(){
        for (int i = 0; i < vertex; i++) {
            System.out.print("Gedung "+(char) ('A'+i)+":  ");
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j]!=-1) {
                    System.out.print("Gedung"+(char) ('A'+j)+"( "+ matriks[i][j]+" m),");
                }

            }
            System.out.println();
        }
    }

    public void printDegree(int asal){
        int degree [][]=new int[vertex][2];
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j]>0) {
                    degree[i][0]++;
                    degree[j][1]++;
                }
            }
        }
        System.out.println("InDegree dari Gedung "+(char) ('A'+asal)+": "+degree[asal][0]);
        System.out.println("OutDegree dari Gedung "+(char) ('A'+asal)+": "+degree[asal][1]);
        System.out.println("Degree dari Gedung "+(char) ('A'+asal)+": "+(degree[asal][0]+degree[asal][1]));        
    }

}
