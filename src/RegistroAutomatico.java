import java.util.Scanner;

public class RegistroAutomatico {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = lector.nextInt();

        System.out.print("Ingrese su nombre: ");
        String nombre = lector.next();

        lector.close();
    }
}