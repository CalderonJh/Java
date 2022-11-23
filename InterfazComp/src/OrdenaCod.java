import java.util.Comparator;
public class OrdenaCod implements  Comparator<Student>{
    public int compare(Student a, Student b)
    {
        return  a.codigo - b.codigo;
    }
}
