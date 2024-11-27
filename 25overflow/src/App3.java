public class App3 {
    public static void main(String[] args) throws Exception {

        for (int i = 0; i < 10; i++) {

            System.out.println(oveflow(i));

        }

    }

    public static int oveflow(int n) {

        if (n == 0) {

            return 0;

        } else if (n == 1) {

            return 1;

        }

        return oveflow(n - 1) + oveflow(n - 2);

    }

}
