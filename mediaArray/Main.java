public class Main {

    public static void main(String[] args) {

        final String SPLIT = ", ";

        String linea1 = "1, paco, paco@email.com";
        String linea2 = "3.3, 3.3, 3.3, 3.3, 3.3, 3.3, 3.3";

        String array1[] = linea1.split(SPLIT);
        String array2[] = linea2.split(SPLIT);

        float notas = 0;
        for (String numero : array2) {

            notas += Float.parseFloat(numero);

        }

        float media = notas / array2.length;

        System.out.println(array1[1] + " tiene de media un " + (float) (Math.round(media * 10)) / 10);

    }

}