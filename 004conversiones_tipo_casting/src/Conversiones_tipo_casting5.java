public class Conversiones_tipo_casting5 {
    public static void main(String[] args) throws Exception {

        int dado1 = 6, dado2 = 5, dado3 = 6;
        int res1 = 0, res2 = 0, res3 = 0, rest = 0;

        if (dado1 == 6) {
            res1 = 1;
        }

        if (dado2 == 6) {
            res2 = 1;
        }

        if (dado3 == 6) {
            res3 = 1;
        }

        rest = res1 + res2 + res3;

        if (rest == 3) {
            System.out.println("Exelente");

        } else if (rest == 2) {
            System.out.println("Muy bien");

        } else if (rest == 1) {
            System.out.println("Regular");

        } else {
            System.out.println("Pesimo");

        }

    }
    
}
