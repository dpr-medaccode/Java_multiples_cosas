import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

// no s porque esto esta aqui

public class App2 {

    public static void main(String[] args) throws Exception {

        ArrayList<Persona> personas = new ArrayList<Persona>();

        for (int i = 0; i < 5; i++) {

            Persona p = new Persona(i, "nomber" + 1, "apellido" + 1, i);

            personas.add(p);

        }

        FileWriter fw = new FileWriter("personas.txt");

        BufferedWriter br = new BufferedWriter(fw);

        for (int i = 0; i < personas.size(); i++){

           br.write(personas.get(i).toString());

           br.newLine();
            
        }

        br.close();

        fw.close();

        
    }

}
