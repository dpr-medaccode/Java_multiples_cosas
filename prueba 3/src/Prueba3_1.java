import java.util.Scanner;

public class Prueba3_1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double[] numero = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

        for (int i = 0; i < 10; i++) {

            System.out.println("inserte el " + (i + 1) + "º numero");
            numero[i] = sc.nextInt();

        }

        double X = media(numero);

        System.out.println("la media es " + X);

    }

    public static double media(double[] array) {

        double[] array2 = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

        for (int i = 0; i < 10; i++) {

            if (i % 2 == 0) {

            } else {

                array2[i] = array[i];

            }

        }

        double[] array25 = { 0, 0, 0, 0, 0 };

        int sum = 1;

        for (int j = 0; j < 10; j++) {

            if (j % 2 == 0) {

            } else {

                array25[j - sum] = array2[j];

                sum++;

            }

        }

        int sum2 = 0;

        for(int f = 0; f < array25.length; f++){

            sum2 += array[f];

        }

        System.out.println(sum2);

       int Y = sum2/array25.length;

        

        return Y;
    }

}
