import java.util.ArrayList;

public class Libro {

    private String titulo;

    private int isbn;

    private ArrayList<Pagina> paginas;

    public Libro(String titulo, int isbn) {
        this.titulo = titulo;

        this.isbn = isbn;

        this.paginas = new ArrayList<Pagina>();

    }

    public void addPagina(int numpag, String text){

        Pagina p = new Pagina(numpag, text);

        this.paginas.add(p);

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", isbn=" + isbn + "]";
    }

    private ArrayList<Pagina> getPaginas(){

        return this.paginas;

    }
    


}
