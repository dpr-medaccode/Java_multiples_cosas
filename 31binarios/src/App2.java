import java.io.FileInputStream;

public class App2 {

    public static void main(String[] args) throws Exception {

        FileInputStream fichero = null;

        try {
            
            fichero = new FileInputStream("prueba.dat");

            while (fichero.available() > 0) {
                
                System.out.println(fichero.read());

            }

            fichero.close();

        } catch (Exception e) {
            
            System.out.println("Error");

        }

    }
    
}
