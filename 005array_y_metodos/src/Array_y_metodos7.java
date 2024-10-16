import java.util.Scanner;

public class Array_y_metodos7 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        char[] array = { 'i', 'n', 'f', 'o', 'r', 'm', 'a', 't', 'i', 'c', 'a' };

        for (int i = 0; i < array.length; i++) {

            if (array[i] == 'm') {

                System.out.println("hay una m en " + i);

            }
        }

    }
}