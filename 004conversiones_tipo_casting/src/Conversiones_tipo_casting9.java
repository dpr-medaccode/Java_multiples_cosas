import java.util.Scanner;

public class Conversiones_tipo_casting9 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        int mul = 0;

        System.out.println("Introduzca el numero para calcular su tabla de multiplcar ");

        int numero = input.nextInt();

        System.out.println("Tabla del " + numero);

        for (int i = 0; i < 11; i++) {

            mul = i * numero;

            System.out.println(i + " X " + numero + " = " + mul);

        }

    }
}
