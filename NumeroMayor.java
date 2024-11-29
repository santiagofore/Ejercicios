public class NumeroMayor {
    public static int mayorDeTres(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        System.out.println("Mayor: " + mayorDeTres(3, 5, 1)); // Prueba 1
        System.out.println("Mayor: " + mayorDeTres(10, 7, 15)); // Prueba 2
        System.out.println("Mayor: " + mayorDeTres(-5, -2, -8)); // Prueba 3
    }
}
