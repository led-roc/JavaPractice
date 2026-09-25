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
