import java.util.ArrayList;
import java.util.Scanner;

public class RegistroEstudiantes {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Integer> edades = new ArrayList<>();
        ArrayList<String> localidades = new ArrayList<>();

        int opcion;

        do {
            System.out.println("===== MENÚ =====");
            System.out.println("1. Registrar estudiante.");
            System.out.println("2. Mostrar estudiantes.");
            System.out.println("3. Salir");
            System.out.println();
            System.out.print("Seleccione una opción: ");
            opcion = lector.nextInt();
            System.out.println();

            if (opcion == 1) {
                String nombre = "";
                Integer edad = null;
                String localidad = "";

                System.out.println("Registrar un estudiante.");
                System.out.println();

                System.out.print("Nombre: ");
                nombre = lector.next();
                System.out.print("Edad: ");
                edad = lector.nextInt();
                System.out.print("Localidad: ");
                localidad = lector.next();

                nombres.add(nombre);
                edades.add(edad);
                localidades.add(localidad);

                System.out.println();

            } else if (opcion == 2) {
                System.out.println("===== ESTUDIANTES =====");
                System.out.println();

                for (int i = 0; i < nombres.size(); i++) {
                    System.out.println("Nombre: " + nombres.get(i));
                    System.out.println("Edad: " + edades.get(i));
                    System.out.println("Localidad: " + localidades.get(i));
                    System.out.println();
                    System.out.println("-----------------------------");
                    System.out.println();
                }

                System.out.println();

            } else if (opcion == 3) {
                System.out.println("Ha seleccionado salir del sistema.");
                System.out.println();
            }
        }
        while (opcion != 3);
    }
}