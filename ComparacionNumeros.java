import java.util.Scanner;

public class ComparacionNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer número:");
        int numero1 = scanner.nextInt();

        System.out.println("Introduce el segundo número:");
        int numero2 = scanner.nextInt();

        System.out.println("Introduce el tercer número:");
        int numero3 = scanner.nextInt();

        if (numero1 > numero2 && numero1 < numero3) {
            System.out.println("El primer número (" + numero1 + ") es mayor que el segundo (" + numero2 + ") y menor que el tercero (" + numero3 + ").");
        } else {
            System.out.println("El primer número (" + numero1 + ") no cumple la condición de ser mayor que el segundo (" + numero2 + ") y menor que el tercero (" + numero3 + ").");
        }

        scanner.close();
    }
}
