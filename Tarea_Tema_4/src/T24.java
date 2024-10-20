public class T24 {
    public static void main(String[] args) throws Exception {

        int num = 0;

        for (int i = 8; i >= 0; i--) {

            num++;

            for (int j = 0; j < 9; j++) {

                if (i > j) {

                    System.out.print(" ");

                }

                else {

                    System.out.print(num);

                }

            }

            System.out.println();

        }
    }
}
