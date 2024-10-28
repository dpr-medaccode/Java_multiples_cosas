public class App {
    public static void main(String[] args) throws Exception {
        
        Persona p1 = new Persona("javi", "ramiz", "21/10/2000", 34);

        if(p1.getEdad()> 18) {

            System.out.println("mayor");

        } else {

            System.out.println("menor");

        }

    }
}
