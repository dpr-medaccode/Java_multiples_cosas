import java.util.Scanner;

public class Prueba1_2 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        float peso = 0;

        float alt = 0;

        System.out.println("ingrese el peso en Kilos");
        peso = sc.nextFloat();

        System.out.println("ingrese la altura en Metro");
        alt = sc.nextFloat();

        double mm = 0;

        mm = peso / (alt * alt);

        if (mm < 18.5) {
            System.out.println("Bajo peso");
        }

        else if (mm >= 18.5 && mm < 25) {

            System.out.println("Normopeso");

        }

        else if (mm >= 25 && mm < 27) {

            System.out.println("Sobrepeso grado I");

        }

        else if (mm >= 27 && mm < 30) {

            System.out.println("Sobrepeso grado II");

        }

        else if (mm >= 30 && mm < 35) {

            System.out.println("Obesidad de tipo I");

        }

        else if (mm >= 35 && mm <= 40) {

            System.out.println("Obesidad de tipo II");

        }

        else if (mm >= 40 && mm <= 50) {

            System.out.println("Obesidad de tipo III (mórbida)");

        }

        else {

            System.out.println("Obesidad de tipo IV (extrema)");

        }
    }
}
