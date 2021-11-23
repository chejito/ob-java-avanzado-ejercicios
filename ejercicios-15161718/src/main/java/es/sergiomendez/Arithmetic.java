package es.sergiomendez;

public class Arithmetic extends Exception {
    public Arithmetic() {
        super("No se puede dividir por 0");
    }
}
