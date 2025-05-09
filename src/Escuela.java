import java.util.ArrayList;

public class Escuela {
    private ArrayList<Estudiante> estudiantes;

    public Escuela() {
        estudiantes = new ArrayList<>();
    }

    public boolean agregarEstudiante(Estudiante estudiante) {

        for (Estudiante e : estudiantes) {
            if (e.getId() == estudiante.getId()) {
                return false;
            }
        }
        estudiantes.add(estudiante);
        return true;
    }

    public Estudiante buscarEstudiante(int id) {
        for (Estudiante e : estudiantes) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }
}
