package es.sergiomendez;

public class ArrayIndexOutOfBounds extends Exception {
    public ArrayIndexOutOfBounds() {
        super("No puedes acceder: longitud del array menor al índice solicitado");
    }
}
