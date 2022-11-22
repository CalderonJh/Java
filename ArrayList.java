import java.util.*;

public class ArrayList {

    public static void main(String[] args) {
        ArrayList<String> nombreEstudiantes = new ArrayList<>();
        String nombre;
        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("Dijite el nombre del estudiante: ");
            nombre = scan.nextLine();
            nombreEstudiantes.add(nombre);
        }while(!nombre.equals("STOP"));

        for (int i = 0; i< nombreEstudiantes.size()-1 ;i++ ) {
            System.out.println("Nombre " + i+ ": "+ nombreEstudiantes.get(i));
        }

        //remplazar  un registro

        System.out.println("Nombres despues de remplazar ");
        nombreEstudiantes.set(2, "Nombre modifcado");

        for (int i = 0; i< nombreEstudiantes.size()-1 ;i++ ) {
            System.out.println("Nombre " + i+ ": "+ nombreEstudiantes.get(i));
        }

        //remover un registro

        System.out.println("Nombres despues de remover ");
        nombreEstudiantes.remove(0);

        for (int i = 0; i< nombreEstudiantes.size()-1 ;i++ ) {
            System.out.println("Nombre " + i+ ": "+ nombreEstudiantes.get(i));
        }

    }
}