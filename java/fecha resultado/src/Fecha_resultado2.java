import java.util.Scanner;

public class Fecha_resultado2 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("inserte la cantidad de segundos");
        int seg = sc.nextInt();

        for (int i = seg; i != 0; i--) {

            int array[] = Conversor(i);

            System.out.println(array[0] + "/" + array[1] + "/" + array[2]);

            Thread.sleep(1000);

        }

    }

    public static int[] Conversor(int seg) {

        int h, m, s = 0;
        int hr, mr, sr = 0;

        h = seg / 3600;
        hr = seg % 3600;

        m = hr / 60;
        mr = hr % 60;

        int[] array = { h, m, mr };

        return array;

    }

}
