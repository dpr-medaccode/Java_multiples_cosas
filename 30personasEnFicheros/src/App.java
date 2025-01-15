import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Persona> personas = new ArrayList<Persona>();

        Collections.addAll(personas, new Persona("Paco", "lopez", 45),
                new Persona("Antonio", "Garcia", 38),
                new Persona("Juan", "Fernandez", 50),
                new Persona("Pablo", "Martinez", 29),
                new Persona("David", "Sanchez", 33));

        FileWriter escritor;

        try {

            escritor = new FileWriter("personas.txt");// hotfix
//                                                         |
            for (int i = 0; i < personas.size(); i++) {//  V
//////////////////////////////////////////////////////////////////////////////////////////

                for (int f = 0; f < personas.get(i).getNombre().length(); f++) {

                    escritor.write(personas.get(i).getNombre().charAt(f));

                }

                escritor.write(" ");

                for (int f = 0; f < personas.get(i).getApellido().length(); f++) {

                    escritor.write(personas.get(i).getApellido().charAt(f));
                    
                }
                
                escritor.write(" ");

                for (int f = 0; f < Math.log10(personas.get(i).getEdad()) + 1; f++) {

                    escritor.write(personas.get(i).getApellido().charAt(f));
                    
                }

////////////////////////////////////////////////////////////////////////////////////////////

                escritor.write("\n");

            }

            escritor.close();

        } catch (Exception e) {

            System.out.println("Error");

        }

    }
}
