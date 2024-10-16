public class Formas3 {
    public static void main(String[] args) throws Exception {

        int[][] numeros = { { 15, 20, 25, 30 }, { 20, 30, 40, 50, 40 }, { 60, 65, 70, 80 } };

        //15 20 25 30            numeros.length = 3
        //20 30 40 50 40    <-   numeros[i].length = 5 (4)
        //60 65 70 80

        for (int i = 0; i < numeros.length; i++) {

            for (int j = 0; j < numeros[i].length; j++) {

                System.out.print(numeros[i][j]+" ");

            }

            System.out.println();

        }
    }
}
