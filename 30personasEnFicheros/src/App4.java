import java.io.BufferedReader;
import java.io.FileReader;

public class App4 {


    public static void main(String[] args) throws Exception {

        FileReader archivo = null;

        BufferedReader lectorDeLinea = null;

        try {

            archivo = new FileReader("personas.txt");

        lectorDeLinea = new BufferedReader(archivo);

        String linea = "";


        while ((linea = lectorDeLinea.readLine()) != null) {

            System.out.println(linea);

        }

        lectorDeLinea.close();

        archivo.close();
            
        } catch (Exception e) {

            System.out.println("Error");

        }

         

    }

    
}