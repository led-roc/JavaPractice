import java.util.Scanner;

public class MenuOpciones {

    public static void main(String[] args) {

        System.out.println("Menu de Opciones");

        System.out.println();

        System.out.println("1 - Registrar una persona.");
        System.out.println("2 - Buscar persona.");
        System.out.println("3 - Salir.");
        System.out.println("4 - Solicitar una opción.");

        System.out.println();
        System.out.print("Ingrese una opción: ");
        Scanner lector = new Scanner(System.in);
        int opcion = lector.nextInt();


        switch (opcion) {
            case 1:
                System.out.print("Seleccionaste: Registrar persona.");
                break;
            case 2:
                System.out.print("Seleccionaste: Buscar persona.");
                break;
            case 3:
                System.out.print("Seleccionaste: Salir.");
                break;
            case 4:
                System.out.print("Seleccionaste: Solicitar una opción.");
                break;
            default:
                System.out.print("Opción ingresada incorrecta.");


        }
        System.out.println();
    }
}
