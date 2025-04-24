import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            
            fos = new FileOutputStream("datos.bin");
            oos = new ObjectOutputStream(fos);

            oos.writeObject(new Numeros());

        } catch (Exception e) {

            System.out.println(e.getMessage());
            
        } finally {

            try {

                oos.close();
                fos.close();

            } catch (Exception e) {

                System.out.println(e.getMessage());

            }

        }


        FileInputStream fis = null;

        ObjectInputStream ois = null;

        Numeros numeros = null;

        try {

            fis = new FileInputStream("datos.bin");
            ois = new ObjectInputStream(fis);
            numeros = (Numeros) ois.readObject();
            
        } catch (Exception e) {

            System.out.println(e.getMessage());

        } finally {

            try {

                ois.close();
                fis.close();

            } catch (Exception e) {

                System.out.println(e.getMessage());

            }


        }

        int par = 0;

        int impar = 0;

        for (int i = 0; i < numeros.getArray().length; i++) {

           if (esPar(numeros.getArray()[i])) {

            par++;
            
           } else {

            impar++;

           }
            
        }

        System.out.println("del array " + numeros);
        System.out.println("hay " + par + " pares");
        System.out.println("y " + impar + " impares");

    }

    public static boolean esPar(int numero) {

        return (numero % 2) == 0;

    }

}