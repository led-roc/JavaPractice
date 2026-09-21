import java.text.BreakIterator;
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


/*
Menú de opciones
En este desafío vas a crear un pequeño menú de opciones utilizando la estructura switch.

1- Mostrar el menú
El programa debe mostrar las siguientes opciones:

1 - Registrar persona
2 - Buscar persona
3 - Salir
2- Solicitar una opción
Pedir al usuario que ingrese el número correspondiente a la opción que desea seleccionar.

3- Mostrar un mensaje
Utilizar switch para determinar qué mensaje mostrar según la opción ingresada.

Ejemplo
Menú

1 - Registrar persona

2 - Buscar persona

3 - Salir

Opción seleccionada: 1

Mensaje: Seleccionaste Registrar persona.

Importante: por ahora no es necesario implementar el registro ni la búsqueda de personas. El objetivo es practicar el uso de switch para responder a diferentes opciones.
 */