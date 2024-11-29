import java.util.Scanner;

public class MenuInteractivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== Menú Interactivo ===");
            System.out.println("1. Sumar dos números");
            System.out.println("2. Restar dos números");
            System.out.println("3. Multiplicar dos números");
            System.out.println("4. Dividir dos números");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce el primer número:");
                    double num1 = scanner.nextDouble();
                    System.out.println("Introduce el segundo número:");
                    double num2 = scanner.nextDouble();
                    System.out.println("La suma es: " + (num1 + num2));
                    break;

                case 2:
                    System.out.println("Introduce el primer número:");
                    num1 = scanner.nextDouble();
                    System.out.println("Introduce el segundo número:");
                    num2 = scanner.nextDouble();
                    System.out.println("La resta es: " + (num1 - num2));
                    break;

                case 3:
                    System.out.println("Introduce el primer número:");
                    num1 = scanner.nextDouble();
                    System.out.println("Introduce el segundo número:");
                    num2 = scanner.nextDouble();
                    System.out.println("El producto es: " + (num1 * num2));
                    break;

                case 4:
                    System.out.println("Introduce el primer número:");
                    num1 = scanner.nextDouble();
                    System.out.println("Introduce el segundo número:");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        System.out.println("La división es: " + (num1 / num2));
                    } else {
                        System.out.println("Error: No se puede dividir entre cero.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa. ¡Adiós!");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, intenta de nuevo.");
            }
            System.out.println(); // Línea en blanco para mejor legibilidad
        } while (opcion != 5);

        scanner.close();
    }
}
