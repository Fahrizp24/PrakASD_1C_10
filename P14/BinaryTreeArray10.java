package P14;

public class BinaryTreeArray10 {
    int[] data;
    int idxLast;

    public BinaryTreeArray10 (){
        data = new int[10];
    }

    void populateData(int data[], int idxLast){
        this.data = data;
        this.idxLast = idxLast;
    }

    void TraverseInOrder(int idxStart){
        if (idxStart<=idxLast) {
            TraverseInOrder(2*idxStart+1);
            System.out.print(data[idxStart]+ " ");
            TraverseInOrder(2*idxStart+2);
        }
    }

    void TraversePrOrder(int idxStart){
        if (idxStart<=idxLast) {
            System.out.print(data[idxStart]+ " ");
            TraversePrOrder(2*idxStart+1);
            TraversePrOrder(2*idxStart+2);
        }
    }

    void TraversePostOrder(int idxStart){
        if (idxStart<=idxLast) {
            TraversePostOrder(2*idxStart+1);
            TraversePostOrder(2*idxStart+2);    
            System.out.print(data[idxStart]+ " ");
        }
        
    }

    void add(int input){
        int idxStart = 0;
        int idx=0;
        while (idx<data.length-1) {
            if (data[idx]==0) {
                data[idx]=input;
                if (idxLast<idx) {
                    idxLast=idx;
                }
                return;
            } else if (input<data[idxStart]) {
                idx= idx*2+1;
            } else if (input > data[idxStart]) {
                idx=idx*2+2;
            }else if (input==data[idx]){
                System.out.println("Data sudah ada");
                return;
            }
        }            
    }
}
