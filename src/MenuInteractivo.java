import java.util.Scanner;

public class MenuInteractivo {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        int opcion = 0;
        while (opcion != 3) {
            System.out.println("===== MENÚ =====");
            System.out.println();
            System.out.println("1. Registrar persona.");
            System.out.println("2. Mostrar mensaje de bienvenida.");
            System.out.println("3. Salir.");
            System.out.println();
            System.out.print("Seleccione una opción: ");
            opcion = lector.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    System.out.println("Registrar una persona.");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("¡Bienvenido/a al sistema!");
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




/*
Menú interactivo
Desarrollá un programa en Java que muestre un menú de opciones y permita al usuario interactuar con él.

1- Crear el menú
El menú debe mostrar las siguientes opciones:

Registrar una persona.
Mostrar un mensaje de bienvenida.
Salir.
2- Repetir el menú
El programa debe continuar mostrando el menú hasta que el usuario seleccione la opción Salir.

3- Procesar las opciones
Utilizá switch para procesar las diferentes opciones y mostrar un mensaje según la opción elegida.

4- Controlar opciones inválidas
Si el usuario ingresa una opción que no existe, mostrá un mensaje indicando que la opción no es válida.

5- Ejemplo
===== MENÚ =====

1. Registrar persona

2. Mostrar mensaje de bienvenida

3. Salir

Seleccione una opción: 2

¡Bienvenido/a al sistema!

Seleccione una opción: 3

Programa finalizado.
 */