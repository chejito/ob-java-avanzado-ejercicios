package ejemploSingleton;

public class MiSingleton {
    private static MiSingleton instancia;
    public String texto = "";

    private MiSingleton() {}

    public static MiSingleton getInstance() {
        if (instancia == null) {
            instancia = new MiSingleton();
        }

        return instancia;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
