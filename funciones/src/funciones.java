public class funciones {
    public static void main(String[] args) throws Exception {

        int num = 83;

        boolean acc = Primo(num);

        if (acc == true) {

            System.out.println("Es primo");

        } else {

            System.out.println("No es primo");

        }

    }

    public static boolean Primo(int X) {

        int var = 0;

        for (int i = X; i >= 1; i--) {

            if (X % i == 0) {

                var++;

            }

        }

        if (var == 2) {

            return true;

        } else {

            return false;

        }

    }
}
