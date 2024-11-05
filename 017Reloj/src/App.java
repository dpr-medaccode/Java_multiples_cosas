public class App {
    public static void main(String[] args) throws Exception {
        
        Reloj r1 = new Reloj();

        for(int i = 86405; i > 0; i--){

            System.out.println(r1);

            r1.incrementar();

        }



    }
}
