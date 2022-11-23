import java.util.Comparator;

public class OrdenaDircc implements Comparator<Student> {
    public int compare(Student a, Student b){
        return a.direccion.compareTo(b.direccion);
    }

}
