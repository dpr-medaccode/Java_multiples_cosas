import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class App3 {

    public static void main(String[] args) throws Exception {

        FileOutputStream fichero = null;

        DataOutputStream flujoDeSalida = null;

        try {

            fichero = new FileOutputStream("prueba.dat");

            flujoDeSalida = new DataOutputStream(fichero);

            for (int i = 65; i <= 90; i++) {

                flujoDeSalida.writeChar(i);

            }

            flujoDeSalida.close();

            fichero.close();

        } catch (Exception e) {

            System.out.println("Error");

        }

    }

}
