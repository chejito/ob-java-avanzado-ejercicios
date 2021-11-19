package ejemploSingleton;

public class Main {
    public static void main(String[] args) {
        MiSingleton miSingleton = MiSingleton.getInstance();
        miSingleton.setTexto("Hola, mundo");

        MiSingleton miSingleton2 = MiSingleton.getInstance();

        System.out.println("El texto es: " + miSingleton2.getTexto());
    }
}
