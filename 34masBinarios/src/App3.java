import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class App3 {

    public static void main(String[] args) throws Exception {

        ArrayList<Persona> personas = new ArrayList<Persona>();

        for (int i = 0; i < 5; i++) {

            Persona p = new Persona(i, "nomber" + 1, "apellido" + 1, i);

            personas.add(p);

        }

        FileOutputStream fos = new FileOutputStream("persona.bin");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        for (int i = 0; i < personas.size(); i++){

            oos.writeObject(personas.get(i));

        }

        FileInputStream fis = new FileInputStream("persona.bin");

        ObjectInputStream ois = new ObjectInputStream(fis);

        while (fis.available() > 0) {

            Persona p = (Persona) ois.readObject();

            if (p.getEdad() > 19) System.out.println(p);
            
        }

        oos.close();
        fos.close();

        ois.close();
        fis.close();





    }

}
