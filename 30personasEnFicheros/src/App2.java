import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class App2 {

    public static void main(String[] args) throws Exception {

        ArrayList<Persona> personas = new ArrayList<Persona>();

        Collections.addAll(personas, new Persona(),
                new Persona(),
                new Persona(),
                new Persona(),
                new Persona());

        FileReader archivo = null;

        try {

            archivo = new FileReader("personas.txt");

            int dato = archivo.read();

            int persona[] = { 0, 0 };

            while (dato != -1) {

                switch (persona[1]) {

                    case 0:

                    case 1:

                        char acumulado[] = new char[50];

                        int i = 0;

                        while ((char) dato != ' ') {

                            acumulado[i] = (char) dato;

                            i++;

                            dato = archivo.read();

                        }

                        if (persona[1] == 0) {

                            personas.get(persona[0]).setNombre(new String(acumulado));

                        }
                        if (persona[1] == 1) {

                            personas.get(persona[0]).setApellido(new String(acumulado));

                        }

                        persona[1]++;

                        break;

                    case 2:

                        char acumuladoEdad[] = new char[2];

                        int f = 0;

                        while ((char) dato != '\n') {

                            acumuladoEdad[f] = (char) dato;

                            f++;

                            dato = archivo.read();

                        }

                        // int acumuladoInt = Integer.parseInt(new String(acumuladoEdad).trim());

                        personas.get(persona[0]).setEdad(Integer.parseInt(new String(acumuladoEdad).trim()));

                        persona[1] = 0;

                        persona[0]++;

                        break;

                    default:

                        break;
                }

                dato = archivo.read();

            }

            archivo.close();

            System.out.println(personas.get(0).toString());
            System.out.println(personas.get(1).toString());
            System.out.println(personas.get(2).toString());
            System.out.println(personas.get(3).toString());
            System.out.println(personas.get(4).toString());


        } catch (Exception e) {

            System.out.println("Error");

        }

    }

}