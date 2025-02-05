import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
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
            System.out.println("4. Borrar persona");
            System.out.println("5. Salir");

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

                        oos.writeObject(new Persona(nombre, apellido, edad));

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

                    break;

                case 2:

                    FileInputStream fis = null;

                    ObjectInputStream ois = null;

                    try {

                        fis = new FileInputStream("persona.bin");

                        while (fis.available() > 0) {

                            ois = new ObjectInputStream(fis);

                            System.out.println((Persona) ois.readObject());

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

                    Persona buscar = null;

                    FileInputStream fis3 = null;

                    ObjectInputStream ois3 = null;

                    try {

                        System.out.println("Introduzca el nombre");
                        System.out.print(">>> ");
                        String nombre = sc.next();

                        fis3 = new FileInputStream("persona.bin");

                        while (fis3.available() > 0) {

                            ois3 = new ObjectInputStream(fis3);

                            Persona comparar = (Persona) ois3.readObject();

                            if (comparar.getNombre().equals(nombre))
                                buscar = comparar;

                        }

                        if (buscar != null)
                            System.out.println(buscar);

                    } catch (Exception e) {

                        System.out.println(e.getMessage());

                    } finally {

                        try {

                            ois3.close();
                            fis3.close();

                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }

                        System.out.println();

                    }

                    break;

                case 4:

                    ArrayList <Persona> personas = new ArrayList<Persona>();

                    FileInputStream fis4 = null;

                    ObjectInputStream ois4 = null;

                    try {

                        fis4 = new FileInputStream("persona.bin");

                        while (fis4.available() > 0) {

                            ois4 = new ObjectInputStream(fis4);

                            personas.add((Persona) ois4.readObject());

                        }

                    } catch (Exception e) {

                        System.out.println(e.getMessage());

                    } finally {

                        try {

                            ois4.close();
                            fis4.close();

                        } catch (Exception e) {

                            System.out.println(e.getMessage());

                        }
                    }

                    sc.nextLine();

                    System.out.println("Ingrese el nombre la persona que quiera borrar");
                    System.out.print(">>> ");

                    String nombre = sc.nextLine();

                    int borrar = 0;

                    for (Persona i : personas) {

                        if (i.getNombre().equals(nombre)) 
                            borrar = personas.indexOf(i);
                        
                    }

                    personas.remove(borrar);

                    FileOutputStream fos4 = null;

                    ObjectOutputStream oos4 = null;

                    try {

                        fos4 = new FileOutputStream("persona.bin");

                        for(int i = 0; i < personas.size(); i++) {

                            oos4 = new ObjectOutputStream(fos4);

                            oos4.writeObject(personas.get(i));

                            oos4.close();

                        }
                        
                    } catch (Exception e) {

                        System.out.println(e.getMessage());

                    } finally {

                        
                        fos4.close();

                    }

                    break;

                case 5:

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
