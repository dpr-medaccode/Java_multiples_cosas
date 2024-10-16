import java.util.Scanner;

public class Prueba3_3 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        boolean pal = true;

        do {

            System.out.println("1-Convertir euros a dolares");
            System.out.println("2-Convertir euros libras");
            System.out.println("3-Convertir euros a yenes");
            System.out.println("4-Convertir euros a todas las monedas");
            System.out.println("0-Salir");
            int acc = sc.nextInt();

            switch (acc) {
                case 1:

                    System.out.println("inserte la cantidad de euros");

                    int mon1 = sc.nextInt();

                    double Ed = dolar(mon1);

                    System.out.println(mon1 + " euro = " + Ed + " dolares");

                    break;

                case 2:

                    System.out.println("inserte la cantidad de euros");

                    int mon2 = sc.nextInt();

                    double El = libra(mon2);

                    System.out.println(mon2 + " euro = " + El + " libras");

                    break;

                case 3:

                    System.out.println("inserte la cantidad de euros");

                    int mon3 = sc.nextInt();

                    double Ey = dolar(mon3);

                    System.out.println(mon3 + " euro = " + Ey + " yenes");

                    break;

                case 4:

                    System.out.println("inserte la cantidad de euros");

                    int mon4 = sc.nextInt();

                    double[] Et = convertirErurosAMonedas(mon4);

                    System.out.println(mon4 + " euro = " + Et[0] + " dolares");
                    System.out.println(mon4 + " euro = " + Et[1] + " libras");
                    System.out.println(mon4 + " euro = " + Et[2] + " yenes");

                    break;

                case 0:

                    pal = false;

                    break;

                default:

                    System.out.println("Opcion incorecta");

                    break;
            }

        } while (pal == true);

    }

    public static double dolar(int Y) {

        double X = Y * 0.98;

        return X;

    }

    public static double libra(int Y) {

        double X = Y * 0.87;

        return X;

    }

    public static double yene(int Y) {

        double X = Y * 144.73;

        return X;

    }

    public static double[] convertirErurosAMonedas(int Y) {

        double Xd = dolar(Y);

        double Xl = libra(Y);

        double Xy = yene(Y);

        double[] array = { Xd, Xl, Xy };

        return array;

    }

}
