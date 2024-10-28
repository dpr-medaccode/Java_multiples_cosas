public class App3 {
    public static void main(String[] args) throws Exception {
        
        Persona p1 = new Persona("javi", "ramiz", "21/10/2000", 34);
        Dni d1 = new Dni("31000307");

        p1.setDni(d1);

        System.out.println(p1.getDni());

        

    }
}
