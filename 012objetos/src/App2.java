public class App2 {
    public static void main(String[] args) throws Exception {
        
        Persona p1 = new Persona("Javi", "10/09/1999");
        Persona p2 = new Persona("Paco", "10/08/1999");
        
        Persona[]  personas = {p1, p2};

        for(int i = 0; i < personas.length; i++){

            System.out.println(personas[i].toString());

        }

    }

}

