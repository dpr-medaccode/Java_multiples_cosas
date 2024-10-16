import java.util.Scanner;

public class Prueba3_2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int[] tablas = { 4, 5, 10, 2, 3 };

        for (int i = tablas.length - 1; i > 0; i--) {

            for (int j = 0; j <= 10; j++) {

                int[] fro = multiplicacion(tablas[i], j);

                System.out.println(fro[0] + " X " + fro[1] + " = " + fro[2]);

            }

            System.out.println();

        }

    }

    static public int[] multiplicacion(int X, int Y) {

        int Z = X * Y;

        int[] array = { X, Y, Z };

        return array;

    }

}
