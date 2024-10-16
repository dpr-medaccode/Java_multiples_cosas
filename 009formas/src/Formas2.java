public class Formas2 {
    public static void main(String[] args) throws Exception {

        int[][] numeros = { { 15, 20, 25, 30 }, { 20, 30, 40, 50 }, { 60, 65, 70, 80 } };

        //15 20 25 30
        //20 30 40 50
        //60 65 70 80

        for (int i = 0; i < numeros.length; i++) {

            for (int j = 0; j < numeros[i].length; j++) {

                System.out.print(numeros[i][j]+" ");

            }

            System.out.println();

        }
    }
}
