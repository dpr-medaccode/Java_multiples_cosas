public class App {
    public static void main(String[] args) throws Exception {
        
        Cuenta c1 = new Cuenta("0001", "javi");
        
        Cuenta c2 = new Cuenta("0002", "Manolo", 2400);

        Cuenta c3 = new Cuenta("0003", "Antonio", 2400);

        Cuenta c4 = new Cuenta(c3);

        Cuenta c5 = new Cuenta();

        
        c3.meter(500);

        System.out.println(c1);

    }
}
