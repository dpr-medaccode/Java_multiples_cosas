public class App {
    public static void main(String[] args) throws Exception {
        
        Cliente c1 = new Cliente("manolo");

        CtaCte cta1 = new CtaCte(12, c1);

        System.out.println(c1);

        System.out.println();

        System.out.println(cta1);

        System.out.println(cta1.getDuenno());

    }
}
