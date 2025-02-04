import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Encriptar frase en un fichero");
        System.out.println("2. Desencriptar frase de un fichero");
        System.out.print(">>> ");
        
        int accion = sc.nextInt();

        sc.nextLine();
       

        switch (accion) {

            case 1:

                System.out.println("Inserte la frase");
                System.out.print(">>> ");
                String frase = sc.nextLine();
                

               

                System.out.println("inserte en numero de la encriptacion");
                System.out.print(">>> ");
                int valor = sc.nextInt();


                char[] fraseEncriptada = new char[frase.length()];

                for (int i = 0; i < frase.length(); i++) {

                    if (frase.charAt(i) != ' ') {

                        fraseEncriptada[i] = traductorPosicionalUniversal(valor, frase.charAt(i));

                    } else {

                        fraseEncriptada[i] = ' ';

                    }

                }

                String frasefinal = new String(fraseEncriptada);

                FileWriter fw = null;

                BufferedWriter bfw = null;

                try {

                    fw = new FileWriter("archivo.txt");

                    bfw = new BufferedWriter(fw);

                    bfw.write(frasefinal);

                    bfw.close();

                    System.out.println("frase cifrada y escrita correctamente");


                } catch (Exception e) {

                   System.out.println("hubo un error en la escritura");

                }

                break;

            case 2:

            System.out.println("inserte en numero de la encriptacion");
            System.out.print(">>> ");
            int valor2 = sc.nextInt();

            valor2 = valor2 * -1;

            FileReader fr = null;

            BufferedReader br = null;

            try {

                fr = new FileReader("archivo.txt");

                br = new BufferedReader(fr);

                

                
            } catch (Exception e) {
                
                System.out.println("Error al leer el archivo");

            }

            String frase2 = br.readLine();

            char [] fraseEncriptada2 = new char[frase2.length()];

                for (int i = 0; i < frase2.length(); i++) {

                    if (frase2.charAt(i) != ' ') {

                        fraseEncriptada2[i] = traductorPosicionalUniversal(valor2, frase2.charAt(i));

                    } else {

                        fraseEncriptada2[i] = ' ';

                    }

                }

                String frasefinal2 = new String(fraseEncriptada2);

                System.out.println(frasefinal2);

                break;

            default:

                System.out.println("Accion no valida");

                break;
        }

    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static int traductorPosicionalPositivo(int numero, int letra) {

        if (numero <= 26) {

            int suma = (letra + numero);

            if (suma > 26)
                suma = suma - 26;

            return suma;
        } else {
            return traductorPosicionalPositivo(numero - 26, letra);
        }

    }

    public static int traductorPosicionalNegativo(int numero, int letra) {

        if (numero <= 26) {

            int resta = letra - numero;

            if (resta < 0)

                resta = resta + 26;

            return resta;

        } else {
            return traductorPosicionalNegativo(numero - 26, letra);
        }

        /*
         * if (numero >= 26 + letra)
         * return numero - letra;
         * 
         * int i = traductorPosicionalNegativo(numero + (26 - letra), 0);
         * 
         * return i;
         */

    }

    public static char traductorPosicionalUniversal(int numero, char letra) {

        if (numero == 0)
            return conversorAbecedario(numero);

        if (numero < 0) {

            numero = numero * -1;

            return conversorAbecedario(traductorPosicionalNegativo(numero, conversorNumero(letra)));

        }

        return conversorAbecedario(traductorPosicionalPositivo(numero, conversorNumero(letra)));

    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static char conversorAbecedario(int numero) {

        if (numero < 1 || numero > 26)
            return '?';

        numero--;

        String abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        return abecedario.charAt(numero);

    }

    public static int conversorNumero(char letra) {

        LinkedList<Character> abcdario = new LinkedList<Character>();

        for (int i = 65; i <= 90; i++) {

            abcdario.add((char) i);

        }

        int numero = abcdario.indexOf(letra) + 1;

        if (numero == 0)
            return -1;

        return numero;

    }

}
