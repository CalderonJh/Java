public class LinkedList {
    class Node{
        int dato;
        Node next;
        Node(int dato) {
            this.dato = dato;
            this.next = null;
        }
    }
    private Node head;
    private int size;
    public LinkedList() {
        this.head = null;
        this.size = 0;

    }

    public void insertNode(Object dato){
        Node nodeIni = new Node(dato);
        nodeIni.next = head;
        head = nodeIni;
        size++;
    }

    public void insertNodeEnd(Object dato) {
        Node latest = new Node(dato);
        Node through = head;

        while (through.next != null) {
            through = through.next;
        }
        through.next = latest;
    }

    public void insertNodeIndex(Object dato, int idx){
        Node nodeIdx = new Nodo(dato);
        Node trough = head;
        int cont = 0;
        while (cont < idx && trough.next !=null){
            trough = trough.next;
            cont ++;
        }
        nodeIdx.next = trough.next;
        trough.next = nodeIdx;
    }
    public void printList(){
        Node trough = head;

        while (trough != null){
            System.out.print(trough.dato + " -> ");
            trough = trough.next;
        }
        System.out.printf("NULL");
    }



}
