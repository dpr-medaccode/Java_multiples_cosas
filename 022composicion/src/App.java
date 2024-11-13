public class App {
    public static void main(String[] args) throws Exception {

        Libro programacion = new Libro("introduccion a java", 1242);

        Libro bases = new Libro("introduccion a bases", 1652);

        bases.addPagina(2, "texto2");

        System.out.println(programacion);

    
    }
}
