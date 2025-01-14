import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;

public class App3 {

    public static void main(String[] args) throws Exception {

        FileWriter escritor = null;

        BufferedWriter escritorDeLineas = null;

        ArrayList<Persona> personas = new ArrayList<Persona>();

        Collections.addAll(personas, new Persona("Paco", "lopez", 45), 
                                    new Persona("Antonio","Garcia", 38),
                                    new Persona("Juan","Fernandez", 50), 
                                    new Persona("Pablo", "Martinez", 29),
                                    new Persona("David", "Sanchez", 33));

        try {

            escritor = new FileWriter("personas.txt");

            escritorDeLineas = new BufferedWriter(escritor);

            for (int i = 0; i < personas.size(); i++) {

                escritorDeLineas.write(personas.get(i).toString());
                
            }
            
        } catch (Exception e) {

            System.out.println("Error");

        }

    }

}
