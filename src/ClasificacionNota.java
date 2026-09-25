import java.util.Scanner;

public class ClasificacionNota {


    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = lector.next();
        System.out.print("Ingrese su nota: ");
        int nota = lector.nextInt();
        System.out.println();

        String estadoMateria;

        if (nota >= 8) {
            estadoMateria = "Excelente";
        } else if (nota >= 6) {
            estadoMateria = "Aprobado";
        } else {
            estadoMateria = "Desaprobado";
        }

        System.out.println("Nombre " + nombre + ".");
        System.out.println("Nota " + nota);
        System.out.print("Resultado: " + estadoMateria);
        System.out.println();

        lector.close();
    }
}

