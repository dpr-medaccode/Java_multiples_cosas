import java.util.Scanner;

public class Prueba2_3 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("introduzca un número:");
        int num = sc.nextInt();

        int nums = 0;

        for (int i = 0; i < num; i++) {

            nums += num - i;

        }

        System.out.println("el sumatorio de " + num + " es " + nums);

    }
}
