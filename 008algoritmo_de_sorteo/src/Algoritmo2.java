import java.util.Scanner;

public class Algoritmo2 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[8];

        for (int j = 0; j < 8; j++) {

            System.out.println("inserte el " + (j + 1) + "º numero");

            numeros[j] = sc.nextInt();

        }

        for (int i = 100; i != 0; i--) {

            for (int f = 0; f < numeros.length - 1; f = f + 2) {

                if (numeros[f] > numeros[f + 1]) {

                    int num = numeros[f];

                    numeros[f] = numeros[f + 1];

                    numeros[f + 1] = num;

                }

            }

            for (int y = 1; y < numeros.length - 2; y = y + 2) {

                if (numeros[y] > numeros[y + 1]) {

                    int num = numeros[y];

                    numeros[y] = numeros[y + 1];

                    numeros[y + 1] = num;

                }

            }

        }

        for (int a = 0; a < numeros.length; a++) {

            System.out.print(numeros[a] + "/");

        }

    }

}

// el siguiente algoritmo se podria usar para arrays mas largos y ordenar mas
// numeros, el unico problema que en teoria solo sirve para arrays con una
// cantidad par de numeros, debido que con impares no funcionaria