public class App {
    public static void main(String[] args) throws Exception {

        System.out.println(oveflow(5));

    }

    public static int oveflow(int n) {

        if (n == 0) return 1;

            int t = oveflow(n - 1);

            return 1 + t;

        

    }

}
