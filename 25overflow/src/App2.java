public class App2 {
    public static void main(String[] args) throws Exception {

        System.out.println(oveflow( 4));

    }

        public static int oveflow (int n) {

            if (n == 1) return 1;

            return n * oveflow(n - 1);

        }

}