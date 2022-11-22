public class LinkedList {
    Nodo head;

    public LinkedList() {
        head = null;
    }

    public void addToStart(Object obj) {
        if (head == null) {
            head = new Nodo(obj);
        } else {
            Nodo aux = head;
            //here
        }

    }

    public boolean isEmpty() {
        return head == null;
    }

}
