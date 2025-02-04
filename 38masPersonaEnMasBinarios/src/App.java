import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        boolean acc = true;

        while (acc) {

            System.out.println("Personas en Binarios");
            System.out.println("1. Annadir persona");
            System.out.println("2. Listar personas");
            System.out.println("3. Buscar persona");
            System.out.println("4. Salir");

            System.out.print(">>> ");
            int opcion = sc.nextInt();

            System.out.println();

            switch (opcion) {

                case 1:

                    FileOutputStream fos = null;

                    ObjectOutputStream oos = null;

                    try {

                        fos = new FileOutputStream("persona.bin", true);

                        oos = new ObjectOutputStream(fos);

                        System.out.println("Introduzca el nombre");
                        System.out.print(">>> ");
                        String nombre = sc.next();

                        sc.nextLine();

                        System.out.println("Introduzca el apellido");
                        System.out.print(">>> ");
                        String apellido = sc.nextLine();

                        

                        System.out.println("Introduzca la edad");
                        System.out.print(">>> ");
                        int edad = sc.nextInt();

                        Persona p = new Persona(nombre, apellido, edad);

                        oos.writeObject(p);

                    } catch (Exception e) {

                        System.out.println("Error");

                    } finally {

                        try {

                           
                        } catch (Exception e) {
                            System.out.println("Error");
                        }

                    }

                 

                    break;

                case 2:

                FileInputStream fis = null;

                ObjectInputStream ois = null;

                 try {

                    fis = new FileInputStream("persona.bin");

                    while (fis.available()>0) {

                        ois = new ObjectInputStream(fis);

                        System.out.println((Persona)ois.readObject());
                        
                    }

                 } catch (Exception e) {
                    
                    System.out.println(e.getMessage());

                 } finally {

                    try {
                        
                        ois.close();
                        fis.close();

                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    System.out.println();

                 }

                    break;

                case 3:

                    break;

                case 4:

                    acc = false;

                    break;

                default:

                    System.out.println("Opcion no valida");
                    System.out.println();

                    break;
            }

            

        }

    }

}
