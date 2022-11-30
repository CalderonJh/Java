public class Main {
    public static void main(String[] args) {
        BiTree tree = new BiTree();
        tree.insertNode(32);
        tree.insertNode(1);
        tree.insertNodeR(43);
        tree.insertNodeR(90);
        tree.recorrerAnchura();
        tree.recorrePreOrden(tree.raiz);

    }
}