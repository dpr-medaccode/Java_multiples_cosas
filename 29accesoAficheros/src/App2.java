import java.io.BufferedReader;
import java.io.FileReader;

public class App2 {
    public static void main(String[] args) throws Exception {

        FileReader archivo = new FileReader("personas.txt");

        BufferedReader lectorDeLinea = new BufferedReader(archivo);

        String linea;

        while ((linea = lectorDeLinea.readLine()) != null) {

            System.out.println(linea);

        }

        lectorDeLinea.close();

        archivo.close();

    }

}