import java.io.DataInputStream;
import java.io.FileInputStream;

public class App4 {

    public static void main(String[] args) throws Exception {

        FileInputStream fichero = null;

        DataInputStream flujoDeEntrda = null;

        try {

            fichero = new FileInputStream("prueba.dat");

            flujoDeEntrda = new DataInputStream(fichero);

            while (flujoDeEntrda.available() > 0) {

                for (int i = 0; i <= 26; i++){


                    
                }
                
            }
            
        } catch (Exception e) {

            System.out.println("Error");

        }

    }
    
}
