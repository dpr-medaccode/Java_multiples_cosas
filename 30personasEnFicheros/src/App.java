import java.io.FileReader;

public class App {
    public static void main(String[] args) throws Exception {
        
         try {

            FileReader archivo = new FileReader("personas.txt");

            int dato = archivo.read();

            while (dato != -1) {

                System.out.print((char) dato);

                dato = archivo.read();

            }

            archivo.close();

            System.out.print("\n");

        } catch (Exception e) {

            System.out.println("Error");

        }

    }
}
