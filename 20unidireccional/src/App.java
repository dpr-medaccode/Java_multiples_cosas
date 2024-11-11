public class App {
    public static void main(String[] args) throws Exception {
        
        Clave c1 = new Clave(12312);

        Usuario u1 = new Usuario("manolo", c1);

        System.out.println(u1);

    }
}
