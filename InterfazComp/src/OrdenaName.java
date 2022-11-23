import java.util.Comparator;

public class OrdenaName implements Comparator<Student> {
    public int compare(Student a, Student b){
        return a.nombre.compareTo(b.nombre);
    }
}
