import java.util.Scanner;

public class MiniCalculadora {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese su primer número: ");
        int num1 = lector.nextInt();

        System.out.print("Ingrese su segundo número: ");
        int num2 = lector.nextInt();

        System.out.println();

        System.out.println("======= Calculadora =======");

        System.out.println();

        System.out.println("Primer número: " + num1);
        System.out.println("Segundo número: " + num2);

        System.out.println();

        System.out.println("Suma: " + (num1 + num2));

        System.out.println("Resta: " + (num1 - num2));

        System.out.println("Multiplicación: " + (num1 * num2));

        System.out.println("División: " + num1 / num2);

        int modulo1 = num1 % num2;

        System.out.println("Resto: " + modulo1);

        System.out.println("Es divisible: " + (modulo1 == 0 ? "Si" : "No"));

        double moduloNumPrimero = num1 % 2;
        double moduloNumSegundo = num2 % 2;

        System.out.println(num1 + (moduloNumPrimero == 0 ? ": Es par." : ": Es par."));

        System.out.println(num2 + (moduloNumSegundo == 0 ? ": Es par." : ": Es par."));

    }
}