public class Estudiante {
    private String nombre;
    private int id;
    private double calificacion;

    public Estudiante(String nombre, int id, double calificacion) {
        this.nombre = nombre;
        this.id = id;
        this.calificacion = calificacion;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }


    public void mostrarFicha() {
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Calificación: " + calificacion);
    }
}
