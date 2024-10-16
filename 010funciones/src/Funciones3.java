public class Funciones3 {
    public static void main(String[] args) throws Exception {

        int num1 = 9;

        int num2 = 9;

        for (int i = num1; i > 0; i--) {

            for (int j = num2; j > 0; j--) {

                int var = i % j;

                System.out.println(i + " % " + j + " = " + var);

            }

        }

    }

}
