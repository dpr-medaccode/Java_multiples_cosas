import java.util.Scanner;

public class Fecha_resultado1 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("introduzca un número:");
        int num = sc.nextInt();

        int nums = 0;

        for (int i = 0; 0 != num; num--) {

            nums += num;

        }

        System.out.println("el sumatorio es " + nums);

    }
}
