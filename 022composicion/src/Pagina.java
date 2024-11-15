public class Pagina {

    private int numeroPagina;

    private String texto;

    public Pagina(int numeroPagina, String texto) {
        this.numeroPagina = numeroPagina;
        this.texto = texto;
    }

    public int getNumeroPagina() {
        return numeroPagina;
    }

    public void setNumeroPagina(int numeroPagina) {
        this.numeroPagina = numeroPagina;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "Pagina [ numeroPagina = " + numeroPagina + ", texto = " + texto + " ]";
    }
   
}
