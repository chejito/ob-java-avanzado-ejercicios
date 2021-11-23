package es.sergiomendez;

public class FileNotFound extends Exception {
    public FileNotFound() {
        super("Archivo no encontrado en el path suministrado");
    }
}
