import java.io.FileOutputStream;

public class App {
    public static void main(String[] args) throws Exception {

        FileOutputStream fichero = null;

        try {

            fichero = new FileOutputStream("prueba.dat");

            for (int i = 0; i < 6; i++) {

                fichero.write(i);

            }

            fichero.close();

        } catch (Exception e) {

            System.out.println("Error");

        }

    }
}
