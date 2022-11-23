import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Student> lista = new ArrayList<>();
        lista.add(new Student(2211, "Alejandro", "Bogota"));
        lista.add(new Student(2212, "Camilo", "Bucaramanga"));
        lista.add(new Student(2112, "Danilo", "Ibague"));
        lista.add(new Student(2316, "Babilio", "Medellin"));

        System.out.println("Sin ordenar...");
        for (Student student : lista) {
            System.out.println(student.toString());
        }

        lista.sort(new OrdenaCod());
        System.out.println("\nOrdenado por codigo...");
        for (Student student : lista) {
            System.out.println(student.toString());
        }

        lista.sort(new OrdenaName());
        System.out.println("\nOrdenado por nombre...");
        for (Student student : lista) {
            System.out.println(student.toString());
        }

        lista.sort(new OrdenaDircc());
        System.out.println("\nOrdenado por direcion...");
        for (Student student : lista) {
            System.out.println(student.toString());
        }
    }
}
