import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class App {
    public static void main(String[] args) throws Exception {
        
        FileOutputStream fo = new FileOutputStream("binario.bin");

        ObjectOutputStream oos = new ObjectOutputStream(fo);

        Persona p1 = new Persona(1, "Juan", "Lopez", 2);

        oos.writeObject(p1);

        FileInputStream fi = new FileInputStream("binario.bin");

        ObjectInputStream ois = new ObjectInputStream(fi);

        Persona pFichero = (Persona)ois.readObject();

        System.out.println(pFichero);

        oos.close();

        ois.close();




    }
}
