public class Main {
    public static void main(String[] args) {
        Nodo first = new Nodo("Example");
        Nodo second = new Nodo(12);
        Nodo third  = new Nodo(true);

        first.linkNext(second);
        first.getNext().linkNext(third);

        System.out.println(first.getNext().getValue().toString());

    }
}