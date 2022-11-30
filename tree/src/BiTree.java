import jdk.nashorn.internal.ir.WhileNode;

import java.util.LinkedList;
import java.util.Queue;

public class BiTree {
    Node raiz;

    public BiTree() {
        this.raiz = null;
    }

    public void insertNode(int data){
        Node nuevo = new Node(data);
        if(raiz == null){
            raiz = nuevo;
        }else{
            Node recorre = raiz;
            Node padre;
            while(true){
                padre = recorre;
                if(data < recorre.data){
                    recorre = recorre.left;
                    if(recorre == null){
                        padre.left = nuevo;
                        return;
                    }
                }else{
                    recorre = recorre.right;
                    if(recorre == null){
                        padre.right = nuevo;
                        return;
                    }
                }
            }
        }
    }

    public void insertNodeR(int data){
        raiz = insertRec(raiz, data);
    }
    public Node insertRec(Node father, int data){
        if(father == null){
            return new Node(data);
        }else{
            if(data < father.data){
                father.left = insertRec(father.left, data);
            }else if(data >= father.data){
                father.right = insertRec(father.right, data);
            }
            return father;
        }
    }

    public void recorrerAnchura(){
        if(isEmpty()){
            System.out.println("EL arbol está vacio");
        }else{
            Queue<Node> nodes = new LinkedList<>();
            nodes.add(raiz);
            while(!nodes.isEmpty()){
                Node node = nodes.poll();
                System.out.println(" " + node.data);
                if(node.left != null){
                    nodes.add(node.left);
                }
                if(node.right != null){
                    nodes.add(node.right);
                }
            }
        }
    }
    public void recorrePreOrden(Node recorre){
        if(recorre != null){
            System.out.println(recorre.data);
            recorrePreOrden(recorre.left);
            recorrePreOrden(recorre.right);
        }
    }
    public boolean isEmpty(){
        if (raiz == null){
            return true;
        }else{
            return false;
        }
    }
}
