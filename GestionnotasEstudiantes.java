import java.util.Scanner;

public class gestionnotasestudiantes {
    public static void main(String[] args) {
        final int NUM_ESTUDIANTES = 5;
        final int NUM_ASIGNATURAS = 3;
        final double LIMITE_APROBACION = 3.0;

        Scanner scanner = new Scanner(System.in);

        String[] nombres = new String[NUM_ESTUDIANTES];
        String[] identificaciones = new String[NUM_ESTUDIANTES];
        double[][] notas = new double[NUM_ESTUDIANTES][NUM_ASIGNATURAS];
        double[] promedios = new double[NUM_ESTUDIANTES];
        String[] estados = new String[NUM_ESTUDIANTES];

        // Entrada de datos
        for (int i = 0; i < NUM_ESTUDIANTES; i++) {
            System.out.println("Ingrese el nombre del estudiante " + (i + 1) + ":");
            nombres[i] = scanner.nextLine();

            System.out.println("Ingrese la identificación del estudiante " + (i + 1) + ":");
            identificaciones[i] = scanner.nextLine();

            for (int j = 0; j < NUM_ASIGNATURAS; j++) {
                System.out.println("Ingrese la nota de la asignatura " + (j + 1) + " para " + nombres[i] + ":");
                notas[i][j] = scanner.nextDouble();
            }
            scanner.nextLine(); // Limpiar el buffer
        }

        // Cálculo de promedios y estados
        for (int i = 0; i < NUM_ESTUDIANTES; i++) {
            double suma = 0;
            for (int j = 0; j < NUM_ASIGNATURAS; j++) {
                suma += notas[i][j];
            }
            promedios[i] = suma / NUM_ASIGNATURAS;
            estados[i] = promedios[i] >= LIMITE_APROBACION ? "Aprobado" : "Reprobado";
        }

        // Generación de reporte
        System.out.println("\n*** Reporte Final ***");
        for (int i = 0; i < NUM_ESTUDIANTES; i++) {
            System.out.println("Estudiante: " + nombres[i] + " | ID: " + identificaciones[i]);
            System.out.println("Promedio: " + promedios[i] + " | Estado: " + estados[i]);
            System.out.println("--------------------------");
        }

        System.out.println("\nEstudiantes aprobados:");
        for (int i = 0; i < NUM_ESTUDIANTES; i++) {
            if (estados[i].equals("Aprobado")) {
                System.out.println("- " + nombres[i]);
            }
        }

        System.out.println("\nEstudiantes reprobados:");
        for (int i = 0; i < NUM_ESTUDIANTES; i++) {
            if (estados[i].equals("Reprobado")) {
                System.out.println("- " + nombres[i]);
            }
        }
    }
}
