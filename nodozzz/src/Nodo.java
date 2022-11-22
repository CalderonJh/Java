public class Nodo {
    Object value;
    Nodo next;

    public Nodo(Object value) {
        this.value = value;
        this.next = null;
    }

    public void linkNext(Nodo n){
        next = n;
    }

    public Nodo getNext() {
        return next;
    }

    public Object getValue() {
        return value;
    }
}
