import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        boolean menu = true;

        do {

            System.out.println("Prueba practica 7");
            System.out.println("1. Mostrar por consola");
            System.out.println("2. Calcular notas medias");
            System.out.println("3. Salir");

            int accion = sc.nextInt();

            System.out.println();

            FileReader lecturaAlumnos = null;

            FileReader lecturaNotasPruebasPracticas = null;

            FileReader lecturaNotasMedias = null;

            FileWriter escritor = null;

            //////////////////////////////////////////////////////////////////////

            switch (accion) {

                case 1:

                    System.out.println("Que desea mostar por consola");
                    System.out.println("X.1 Fichero alumnos.txt");
                    System.out.println("X.2 Fichero notasPruebasPracticas.txt");
                    System.out.println("X.3 Fichero notaMedias.txt");
                    System.out.println("X.4 Alumno con mayor nota media");

                    int accionCaso1 = sc.nextInt();

                    System.out.println();

                    switch (accionCaso1) {

                        //////////////////////////////////////////////////////////////////////

                        case 1:

                            leerarchivo(lecturaAlumnos, "alumnos.txt");

                            System.out.println();
                            System.out.println();

                            break;

                        case 2:

                            leerarchivo(lecturaNotasPruebasPracticas, "notasPruebasPracticas.txt");

                            System.out.println();
                            System.out.println();

                            break;

                        case 3:

                            leerarchivo(lecturaNotasMedias, "notasMedias.txt");

                            System.out.println();
                            System.out.println();

                            break;

                        case 4:

                            /*
                             * 
                             * lecturaNotasMedias = new FileReader("notasMedias.txt");
                             * 
                             * BufferedReader lecturaLienasNotasMedias = new
                             * BufferedReader(lecturaNotasMedias);
                             * 
                             * String linea;
                             * 
                             * String lineaAcumulada;
                             * 
                             * while ((linea = lecturaLienasNotasMedias.readLine()) != null) {
                             * 
                             * linea.
                             * 
                             * }
                             * 
                             */

                            break;

                        default:

                            System.out.println("no es una operacion valida");

                            break;

                        //////////////////////////////////////////////////////////////////////

                    }

                    break;

                case 2:

                    escritor = new FileWriter("notas;edias.txt" /* ,true */);

                    BufferedWriter escritorDeLineas = new BufferedWriter(escritor);

                    lecturaAlumnos = new FileReader("alumnos.txt");

                    BufferedReader lecturaLienasalumno = new BufferedReader(lecturaAlumnos);

                    String linea = lecturaLienasalumno.readLine();

                    linea = lecturaLienasalumno.readLine();

                    lecturaNotasMedias = new FileReader("notasPruebasPracticas.txt");

                    BufferedReader LecturaLineasNotaMedia = new BufferedReader(lecturaNotasMedias);

                    String linea2 = LecturaLineasNotaMedia.readLine();

                    linea2 = LecturaLineasNotaMedia.readLine();

                    int numeroAlumno = 0;

                    for (int j = 0; j < 30; j++) {

                        char email[] = new char[100];

                        for (int i = 0; i < 30; i++) {

                            email[i] = linea.charAt(59 + i);

                        }

                        

                        int media = 0;

                        for (int i = 0; i < 6; i++) {

                            int sumador = 3;

                            int acumulado = 0;

                            char valorno[] = { linea2.charAt(1 + sumador - 3), linea2.charAt(2 + sumador - 3) };

                            // if (valorno[0]  == '0') {

                            //     valorno[0] = ' ';
                                
                            // }

                            System.out.println(valorno);

                            String valor = new String(valorno).trim();

                            media = +Integer.parseInt(valor);

                            sumador += 3;

                        }

                        media = media / 6;

                        escritorDeLineas.write(numeroAlumno +" "+ (new String(email).trim()) +" "+  media);

                        numeroAlumno++;

                        escritorDeLineas.newLine();

                        linea = lecturaLienasalumno.readLine();

                        linea2 = LecturaLineasNotaMedia.readLine();

                    }

                    escritorDeLineas.close();

                    escritor.close();

                    lecturaLienasalumno.close();

                    lecturaAlumnos.close();

                    LecturaLineasNotaMedia.close();

                    lecturaNotasMedias .close();

                    break;

                case 3:

                    break;

                default:

                    break;

            }

            //////////////////////////////////////////////////////////////////////

        } while (menu);

    }

    public static void leerarchivo(FileReader archivoALeer, String archivo) {

        try {

            archivoALeer = new FileReader(archivo);

            int dato = archivoALeer.read();

            while (dato != -1) {

                System.out.print((char) dato);

                dato = archivoALeer.read();

            }

            archivoALeer.close();

        } catch (Exception e) {

            System.out.println("Ha ocurrido un error en la lectura del archivo");

        } finally {

            try {

                archivoALeer.close();

            } catch (IOException e) {

                System.out.println("Tampoco se pudo cerrar el archivo");

            }

        }

    }

}
