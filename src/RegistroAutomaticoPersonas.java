import java.util.ArrayList;
import java.util.Scanner;

public class RegistroAutomaticoPersonas {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        String nombre = "";
        ArrayList<String> personas = new ArrayList<>();

        int opcion = 0;
        while (opcion != 3) {
            System.out.println("===== MENÚ =====");
            System.out.println();
            System.out.println("1. Registrar persona.");
            System.out.println("2. Mostrar personas.");
            System.out.println("3. Salir.");
            System.out.println();
            System.out.print("Seleccione una opción: ");
            opcion = lector.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    System.out.println("Registro de persona.");
                    System.out.println();
                    System.out.print("Ingrese el nombre: ");
                    nombre = lector.next();
                    personas.add(nombre);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("2. Mostrar personas.");
                    System.out.println();
                    System.out.println("Personas registradas: " + personas);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Programa finalizado.");
                    System.out.println();
                    break;
                default:
                    System.out.println("La opción ingresada no es válida.");
                    System.out.println();
            }
        }
    }
}