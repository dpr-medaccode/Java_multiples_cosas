import java.io.BufferedWriter;
import java.io.FileWriter;

public class App4 {
    public static void main(String[] args) throws Exception {

        FileWriter escritor = null;

        BufferedWriter escritorDeLineas = null;

        try {
            
            escritor = new FileWriter("archivo2.txt" /*,true*/);

            escritorDeLineas = new BufferedWriter(escritor);

            for (int i = 0; i < 10; i++) {

                escritorDeLineas.write("linea: " + i);

                escritorDeLineas.newLine();
            
            }

            escritorDeLineas.close();

            escritor.close();

        } catch (Exception e) {
            System.out.println("Error");
        }

    }

}
