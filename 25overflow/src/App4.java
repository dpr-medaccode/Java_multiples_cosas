public class App4 {
    public static void main(String[] args) throws Exception {

        int[] array = { 1, 2, 3, 4, 5, 6 };

        System.out.println(sumatorio(array));

    }

    public static int sumatorio(int[] arr) {

        if (arr.length == 1) {

            return arr[0];

        }

        int newarr[] = new int[arr.length - 1];

        for (int i = 1; i <= newarr.length; i++) {

            newarr[i - 1] = arr[i];

        }

        return arr[0] + sumatorio(newarr);

    }

}
