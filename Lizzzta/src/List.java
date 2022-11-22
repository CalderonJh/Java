public class List {
    private Node head, lastes;
    private int size;

    public List(){
        head = null;
        lastes = null;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void printListSE(){
        Node nodoRecorre = head;
        System.out.println("HEAD --> ");
        while (nodoRecorre != null){
            System.out.println(nodoRecorre.value + " --> ");
            nodoRecorre = nodoRecorre.next;
        }
        System.out.println(" END ");
    }

    public void printListES(){
        Node nodoRecorre = lastes;
        System.out.println("HEAD --> ");
        while (nodoRecorre != null){
            System.out.println(nodoRecorre.value + " --> ");
            nodoRecorre = nodoRecorre.next;
        }
        System.out.println(" BEGINNING ");
    }

    public void addNodeB(Object dato){
        Node aux = new Node(dato);

        if(isEmpty()){
            lastes = aux;
        }else{
            head.previous = aux;
        }
        aux.next = head;
        aux.previous = null;

        head = aux;
        size ++;
    }

    public void addNodeE(Object dato){
        Node aux = new Node(dato);

    }

}
