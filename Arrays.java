import java.util.*;

public class Arrays {

    public static void main(String[] args) {
        int edadEstudiante[] = new int[25];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < edadEstudiante.length; i++) {
            System.out.println("Digite la edad del estudiante " + (i + 1) + ": ");
            edadEstudiante[i] = scan.nextInt();

        }

        for (int i = 0; i < edadEstudiante.length; i++) {
            System.out.println("Edades[" +i+"]=" + edadEstudiante[i]);

        }

    }
}
