import java.util.Scanner;

public class App6 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        boolean acc = true;

        char[] array = { 'i', 'n', 'f', 'o', 'r', 'm', 'a', 't', 'i', 'c', 'a' };

        for (int i = 0; i < array.length; i++) {

            if (array[i] == 'm' && acc == true ) {

                System.out.println("hay una m en " + i);

                acc = false;

            }
        }

    }
}