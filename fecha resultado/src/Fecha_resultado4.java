import java.util.Scanner;

public class Fecha_resultado4 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("inserte numero");
        int num = sc.nextInt();

        if (num < 0) {

            System.out.println("es negativo");
            
        }else{

            System.out.println("es positivo");

        }

    }

}
