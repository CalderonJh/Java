public class Student {
    int codigo;
    String nombre, direccion;

    public Student(int codigo, String nombre, String direccion){
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Codigo= " + codigo +". Nombre= " + nombre +". Direccion= " + direccion;
    }

    public void agregaEstudiante(String nombre, int codigo, String direccion){
        Student nuevo = new Student(codigo, nombre, direccion);
    }
}
