import java.io.FileWriter;

public class App3 {
    
    public static void main(String[] args) throws Exception {

        FileWriter escritor;

        try {

            escritor = new FileWriter("archivo2.txt" /*, true*/); // true = sobreescribir

        for ( int i = 65; i < 91; i++){

            escritor.write((char)i);

        }

        escritor.close();
            
        } catch (Exception e) {
            
            System.out.println("Error");

        }

    }

}
