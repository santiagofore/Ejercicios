import java.util.Scanner;

public class DatosUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, introduce tu nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Introduce tu edad:");
        int edad = scanner.nextInt();

        System.out.println("Introduce tu altura en metros (por ejemplo, 1.75):");
        double altura = scanner.nextDouble();

        System.out.println("\n--- Información Personal ---");
        System.out.println("Hola, " + nombre + "!");
        System.out.println("Tienes " + edad + " años.");
        System.out.println("Tu altura es " + altura + " metros.");

        scanner.close();
    }
}
