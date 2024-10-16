public class Conversiones_tipo_casting6 {
    public static void main(String[] args) throws Exception {

        int dado1 = 6, dado2 = 6, dado3 = 6;
        int res = 0;

        if (dado1 == 6) {
            res++;
        }
        
        if (dado2 == 6) {
            res++;
        }

        if (dado3 == 6) {
            res++;
        }

        switch (res) {

            case 0:
                System.out.println("Pesimo");
                break;

            case 1:
                System.out.println("Regular");
                break;

            case 2:
                System.out.println("muy Bien");
                break;

            case 3:
                System.out.println("Exelente");
                break;

            default:
                System.out.println("Error");

        }

    }
}
