public class App {
    public static void main(String[] args) throws Exception {

        Bulbasur b1 = new Bulbasur("Manolo");

        Charmander c1 = new Charmander("Jose", 3);

        Squirtel s1 = new Squirtel("Alfredo")

        System.out.println(b1);

        System.out.println(c1);

        b1.atacar(c1);

        System.out.println();

        System.out.println(c1);

    }

}
