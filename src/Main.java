import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Escuela escuela = new Escuela();

        int opcion;

        do {
            System.out.println();
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Buscar por ID");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();

                    System.out.print("ID: ");
                    int id = scanner.nextInt();

                    System.out.print("Calificación: ");
                    double calificacion = scanner.nextDouble();

                    if (id <= 0 || calificacion < 0 || calificacion > 10) {
                        System.out.println("Intenta de nuevo.");
                        break;
                    }

                    Estudiante nuevo = new Estudiante(nombre, id, calificacion);
                    if (escuela.agregarEstudiante(nuevo)) {
                        System.out.println("agregado.");
                        System.out.println();
                        System.out.println("-----------------");

                    } else {
                        System.out.println(" Ya existe .");
                    }
                    break;

                case 2:
                    System.out.print("Ingrese ID del estudiante: ");
                    int buscarId = scanner.nextInt();
                    Estudiante encontrado = escuela.buscarEstudiante(buscarId);
                    if (encontrado != null) {
                        System.out.println();
                        System.out.println("------------");
                        encontrado.mostrarFicha();
                    } else {
                        System.out.println(" no encontrado.");
                    }
                    break;

                case 3:
                    System.out.println(" Saliendo...");
                    break;

                default:
                    System.out.println(" no válida.");
            }

        } while (opcion != 3);
    }
}
