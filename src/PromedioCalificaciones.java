import java.util.Scanner;

public class PromedioCalificaciones {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        int nota = 0;
        double sumaNotas = 0;
        double promedio = 0;

        int opcion;
        int cantidadCalificaciones = 0;
        do {
            System.out.println("===== MENÚ =====");
            System.out.println("1. Calcular promedio");
            System.out.println("2. Ayuda");
            System.out.println("3. Salir");
            System.out.println();
            System.out.print("Seleccione una opción: ");
            opcion = lector.nextInt();
            System.out.println();

            if (opcion == 1) {
                System.out.print("¿Cuántas calificaciones desea ingresar?: ");
                cantidadCalificaciones = lector.nextInt();

                for (int i = 1; i <= cantidadCalificaciones; i++) {
                    System.out.print("la calificación " + i + ": ");
                    nota = lector.nextInt();
                    sumaNotas = sumaNotas + nota;
                }
                promedio = sumaNotas / cantidadCalificaciones;
                System.out.println("Promedio: " + promedio);
                System.out.println();

            } else if (opcion == 2) {
                System.out.println("Seleccionó opción ayuda.");
                System.out.println();
            } else if (opcion == 3) {
                System.out.println("Ha seleccionado salir del sistema.");
                System.out.println();
            }
        }
        while (opcion != 3);
    }
}

/*
Promedio de calificaciones
Continuando con la idea de una aplicación para docentes, desarrollá un programa en Java que permita calcular el promedio de un grupo de calificaciones.

1- Crear el menú
El programa debe mostrar las siguientes opciones:

Calcular promedio.
Mostrar mensaje de ayuda.
Salir.

2- Calcular el promedio
Cuando el usuario seleccione Calcular promedio, preguntá cuántas calificaciones desea ingresar.
Luego solicitá cada calificación y utilizá un bucle for para realizar los ingresos.

3- Utilizar un acumulador
Utilizá una variable acumuladora para sumar todas las calificaciones.
Al finalizar, calculá y mostrá el promedio.

4- Volver al menú
Después de mostrar el resultado, el programa debe volver al menú principal y permitir seleccionar otra opción.

5- Ejemplo
===== MENÚ =====
1. Calcular promedio
2. Ayuda
3. Salir

Seleccione una opción: 1

¿Cuántas calificaciones desea ingresar? 3

Ingrese la calificación 1: 7

Ingrese la calificación 2: 8

Ingrese la calificación 3: 6

Promedio: 7.0

💡 Pista: el do-while puede encargarse de mantener funcionando el menú, mientras que el for puede utilizarse para repetir el ingreso de las calificaciones.
 */