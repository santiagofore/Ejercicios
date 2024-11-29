import java.util.Scanner;

public class PromedioNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int suma = 0;

        System.out.println("Ingresa 5 números:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
            suma += numeros[i];
        }

        double promedio = suma / 5.0;
        System.out.println("El promedio es: " + promedio);
    }
}
