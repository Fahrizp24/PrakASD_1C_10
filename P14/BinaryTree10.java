package P14;

import P11.singlelinkedlists.Node;

public class BinaryTree10 {
    Node10 root;

    public BinaryTree10(){
        root = null;
    }
    
    boolean isEmpty(){
        return root==null;
    }

    void add(int data){
        if (isEmpty()) {
            root = new Node10(data);
        } else {
            Node10 current = root;
            while (true) {
                if (data<current.data) {
                    if (current.left!=null) {
                        current = current.left;
                    }else{
                        current.left = new Node10(data);
                        break;
                    }
                }else if (data>current.data) {
                    if (current.right!=null) {
                        current = current.right;
                    }else{
                        current.right=new Node10(data);
                        break;
                    }
                }else{
                    break;//data is already exist
                }
            }
        }
    }

    boolean find (int data){
        boolean result = false;
        Node10 current = root;
        while (current!=null) {
            if (current.data==data) {
                result = true;
                break;
            }else if (data<current.data) {
                current = current.left;
            }else {
                current = current.right;
            }
        }
        return result;
    }

    void traversePreorder (Node10 node10){
        if (node10!=null) {
            System.out.print(" "+node10.data);
            traversePreorder(node10.left);
            traversePreorder(node10.right);
        }
    }

    void traversePostOrder (Node10 node){
        if (node!=null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" "+node.data);
        }
    }

    void traverseInOrder (Node10 node){
        if (node!=null) {
            traverseInOrder(node.left);
            System.out.print(" "+node.data);
            traverseInOrder(node.right);   
        }
    }

    Node10 getSuccessor (Node10 del){
        Node10 successor = del.right;
        Node10 successorParent=del;
        while (successor.left!=null) {
            successorParent = successor;
            successor=successor.left;
        }
        if (successor!=del.right) {
            successorParent.left=successor.right;
            successor.right=del.right;
        }
        return successor;
    }

    void delete (int data){
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }
        //find node current that will be deleted
        Node10 parent = root;
        Node10 current = root;
        boolean isLeftChild = false;
        while (current!=null) {
            if (current.data==data) {
                break;
            } else if (data<current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            }else if (data>current.data) {
                parent = current;
                current=current.right;
                isLeftChild = false;
            }
            if (current==null) {
                System.out.println("Couln't find data!");
                return;
            }else {
                //if there is no child, simply deelete it
                if (current.left==null && current.right==null) {
                    if (current==root) {
                        root=null;
                    } else {
                       if (isLeftChild) {
                        parent.left=null;
                       } else {
                        parent.right = null;
                       }
                    }
                }else if (current.left==null) {//if there is 1 child right
                    if (current==root) {
                        root=current.right;
                    }else {
                        if (isLeftChild) {
                            parent.left=current.right;
                        }else {
                            parent.right=current.right;
                        }
                    }
                } else if (current.right==null) {//if tehre is 1 child left
                    if (current==root) {
                        root=current.left;
                    }else {
                        if (isLeftChild) {
                            parent.left=current.left;
                        }else {
                            parent.right=current.left;
                        }
                    }
                }else { // if there is 2 childs
                    Node10 successor = getSuccessor(current);
                    if (current == root) {
                        root = successor;
                    } else {
                        if (isLeftChild) {
                            parent.left = successor;
                        } else {
                            parent.right = successor;
                        }
                    }
                    successor.left = current.left;
                }
            }
        }
    }

    void addRekursif (Node10 node,int data){
        if (isEmpty()) {
            root = new Node10(data);
        } else {
            if (data<node.data) {
                if (node.left!=null) {
                    addRekursif(node.left, data);
                }else{
                    node.left = new Node10(data);
                    return;
                }
            }else if (data>node.data) {
                if (node.right!=null) {
                    addRekursif(node.right, data);
                }else{
                    node.right=new Node10(data);                    }
            }else{
                System.out.println("Data sudah ada");;//data is already exist
            }
        }
    }
}
