import java.util.Scanner;

public class ClasificacionNota {

}
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




/*

En este desafío vas a trabajar con una nota numérica y estructuras condicionales para determinar el resultado obtenido.

1- Solicitar
Nombre
Nota

2- Definir
Vos vas a definir el rango de números correspondiente a cada calificación:

Excelente
Aprobado
Desaprobado

3- Mostrar
Mostrar el nombre de la persona y la calificación que obtuvo según la nota ingresada.

Ejemplo

Juan
Nota: 9
Resultado: Excelente

Importante: los rangos de notas para determinar Excelente, Aprobado y Desaprobado quedan a tu criterio.

 */