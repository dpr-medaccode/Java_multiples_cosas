public class Formas {
    public static void main(String[] args) throws Exception {

        int[][] numeros = { { 15, 20, 25, 30 }, { 20, 30, 40, 50 }, { 60, 65, 70, 80 } };

        //15 20 25 30
        //20 30 40 50
        //60 65 70 80

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 4; j++) {

                System.out.print(numeros[i][j]+" ");

            }

            System.out.println();

        }
    }
}
