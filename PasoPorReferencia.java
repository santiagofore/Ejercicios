class Contenedor {
    int valor;
}

public class PasoPorReferencia {
    public static void cambiarValor(Contenedor obj) {
        obj.valor = 42; 
        System.out.println("Valor dentro del método: " + obj.valor);
    }

    public static void main(String[] args) {
        Contenedor miContenedor = new Contenedor();
        miContenedor.valor = 10; 
        System.out.println("Valor antes del método: " + miContenedor.valor);

        cambiarValor(miContenedor); 

        System.out.println("Valor después del método: " + miContenedor.valor);
    }
}
