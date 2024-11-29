class Estudiante {
    String nombre;
    int edad;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}

public class PasoPorReferenciaConEstudiante {
    public static void modificarEstudiante(Estudiante estudiante) {
        estudiante.nombre = "Nuevo Nombre"; 
        estudiante.edad = 30; 
        System.out.println("Dentro del método -> Nombre: " + estudiante.nombre + ", Edad: " + estudiante.edad);
    }

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Juan", 25); 
        System.out.println("Antes del método -> Nombre: " + estudiante.nombre + ", Edad: " + estudiante.edad);

        modificarEstudiante(estudiante); 
        System.out.println("Después del método -> Nombre: " + estudiante.nombre + ", Edad: " + estudiante.edad);
    }
}
