import java.util.Scanner;

public class FactorialNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero positivo: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("El factorial no está definido para números negativos.");
        } else {
            long factorial = 1;
            int i = 1;

            while (i <= numero) {
                factorial *= i;
                i++;
            }

            System.out.println("El factorial de " + numero + " es: " + factorial);
        }

        scanner.close();
    }
}
