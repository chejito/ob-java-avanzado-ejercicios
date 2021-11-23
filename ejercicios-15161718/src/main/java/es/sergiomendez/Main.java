package es.sergiomendez;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        // Probamos la excepción Arithmetic
        try {
            System.out.println(dividir(3, 2));
            System.out.println(dividir(5, 0));
        } catch (Arithmetic e) {
            System.out.println(e.getMessage());
        }

        imprimirDivisor();

        // Probamos la excepción ArrayIndexOutOfBounds
        int[] array = {1, 3, 2, 6, 7, 0};

        try {
            System.out.println("Posición 3 del array: " + accederAIndiceArray(array, 3));
        } catch (ArrayIndexOutOfBounds e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Posición 6 del array: " + accederAIndiceArray(array, 6));
        } catch (ArrayIndexOutOfBounds e) {
            System.out.println(e.getMessage());
        }

        imprimirDivisor();

        // Probamos la excepción FileNotFound

        try {
            File fichero1 = accederAArchivo("archivoPrueba1.txt");
            System.out.println(fichero1.length());
        } catch (FileNotFound | URISyntaxException e) {
            System.out.println(e.getMessage());
        }

        try {
            File fichero2 = accederAArchivo("archivoPrueba2.txt");
            System.out.println(fichero2.length());
        } catch (FileNotFound | URISyntaxException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void imprimirDivisor() {
        System.out.println("\n----------------------------------------------------\n");
    }

    public static int dividir(int dividendo, int divisor) throws Arithmetic {
        if (divisor == 0) {
            throw new Arithmetic();
        }
        else {
            return dividendo / divisor;
        }
    }

    public static int accederAIndiceArray(int[] array, int indice) throws ArrayIndexOutOfBounds {
        if (indice >= array.length) {
            throw new ArrayIndexOutOfBounds();
        }
        return array[indice];
    }

    public static File accederAArchivo(String path) throws FileNotFound, URISyntaxException {
        URL archivo = Main.class.getClassLoader().getResource(path);
        if (archivo == null) {
            throw new FileNotFound();
        }
        return new File(archivo.toURI());
    }
}
