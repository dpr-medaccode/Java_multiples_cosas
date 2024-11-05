public class Contador {

    private int numero;

    public Contador(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return this.numero + "";
    }

    public void incrementar() {

        this.numero++;

    }

    public void decrementar() {

        this.numero--;

    }

}
