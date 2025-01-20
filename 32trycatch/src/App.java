import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("introduzca el dividendo");
            int dividendo = sc.nextInt();
            
            System.out.println("introduzca el divisor");
            int divisor = sc.nextInt();

            double Resultado = dividendo / divisor;
            System.out.println("Resultado: " + Resultado);

        } catch (InputMismatchException e) {

            System.out.println("caracter no valido");

        } catch (ArithmeticException e) {

            System.out.println("el divisor o el dividendo puede ser 0");

        } catch (Exception e) {

            System.out.println("Error desconcido");

            System.out.println(e.getMessage());

        }

        throw new ArithmeticException("el divisor es 0");

    }

}
