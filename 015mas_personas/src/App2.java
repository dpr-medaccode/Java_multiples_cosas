public class App2 {
    public static void main(String[] args) throws Exception {
        
        Coche c1 = new Coche("145988K", "Audi", "A4", "negro");

        Coche c2 = new Coche("387467H", "Mercedes", "E3", "amarillo");

        c1.arrancar();

        c1.acelerar(50);

        c1.frenar(20);

        System.out.println(c1);


    }
}