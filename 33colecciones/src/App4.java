import java.util.ArrayList;

import java.util.Collections;
import java.util.TreeSet;

public class App4 {
    public static void main(String[] args) throws Exception {

        ArrayList<Personas> personas = new ArrayList<Personas>();

        Personas p1 = new Personas(1, "Paco 1", "Ramon", 13);

        Personas p2 = new Personas(1, "Paco 2", "Iguera", 13);

        Personas p3 = new Personas(3, "Juan 3", "Ramirez", 14);

        Personas p4 = new Personas(4, "Pepe 4", "jose", 35);

        Personas p5 = new Personas(5, "Juan 5", "manolo", 12);

        personas.add(p3);

        personas.add(p1);

        personas.add(p2);

       Collections.sort(personas);
       System.out.println(personas);




            
        }

    }


