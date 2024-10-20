public class Tarea_2_2 {
    public static void main(String[] args) throws Exception {

        int num = 10;

        for (int i = 0; i < 9; i++) {

            num--;

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
