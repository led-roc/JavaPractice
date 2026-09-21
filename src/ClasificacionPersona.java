import java.util.Scanner;

public class ClasificacionPersona {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = lector.next();
        System.out.print("Ingrese su edad: ");
        int edad = lector.nextInt();
        System.out.println();

        String clasificacionEstado;

        if (edad >= 18) {
            clasificacionEstado = "Mayor de edad.";
        } else {
            clasificacionEstado = "Menor de edad.";
        }

        System.out.println("Bienvenido/a " + nombre + ".");
        System.out.print("Estado: " + clasificacionEstado);
        System.out.println();

        lector.close();
        }

}