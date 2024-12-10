public class App5 {
    public static void main(String[] args) throws Exception {

        int[] array = { 1, 2, 3, 4, 5, 6 };

        System.out.println(sumatorio(array, 0));

    }

    public static int sumatorio(int[] arr, int n) {

        if (n == arr.length ) {

            return 0;
            
        }

        int x = arr[n];

        n++;

        return x + sumatorio(arr, n);

    }

}
