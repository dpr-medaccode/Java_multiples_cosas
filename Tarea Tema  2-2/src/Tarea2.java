import java.util.Scanner;

public class Tarea2 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        String fecha = "";

        System.out.println("introduzca la fecha en el formato XX/XX/XXXX");
        System.out.println("Ejm: 01/10/2010");

        fecha = input.nextLine();
        ;

        String sdia = fecha.charAt(0) + "" + fecha.charAt(1);

        String smes = fecha.charAt(3) + "" + fecha.charAt(4);

        String sayo = fecha.charAt(6) + "" + fecha.charAt(7) + fecha.charAt(8) + fecha.charAt(9);

        int dia = Integer.parseInt(sdia);

        int mes = Integer.parseInt(smes);

        int ayo = Integer.parseInt(sayo);

        dia += 2;

        switch (mes) { // lo primer que se detecta es el mes la parte mas importante de la fecha, es la
                       // que define la cantidad de dias, dependiendo de que mes sea
            case 2:    // existen tres bifuraciones y media, la primera febrero, por que si es bisiento
                       // son 29 dias y si no 28

                if (ayo % 4 == 0) {

                    switch (dia) {

                        case 30:
                            mes += 1;
                            dia = 1;
                            System.out.println("0" + dia + "/" + mes + "/" + ayo);

                            break;

                        case 31:
                            mes += 1;
                            dia = 2;
                            System.out.println("0" + dia + "/" + mes + "/" + ayo);

                            break;

                        default:
                            System.out.println(dia + "/" + mes + "/" + ayo);
                            break;
                    }

                }

                else {

                    switch (dia) {

                        case 29:
                            mes += 1;
                            dia = 1;
                            System.out.println("0" + dia + "/" + mes + "/" + ayo);

                            break;

                        case 30:
                            mes += 1;
                            dia = 2;
                            System.out.println("0" + dia + "/" + mes + "/" + ayo);

                            break;

                        default:
                            System.out.println(dia + "/" + mes + "/" + ayo);
                            break;
                    }

                }

                break;

            case 4: // la segunda bifurcacion son los meses que terminan en 30
            case 6:
            case 9:
            case 11:

                switch (dia) {

                    case 31:
                        mes += 1;
                        dia = 1;
                        System.out.println("0" + dia + "/" + mes + "/" + ayo);

                        break;

                    case 32:
                        mes += 1;
                        dia = 2;
                        System.out.println("0" + dia + "/" + mes + "/" + ayo);

                        break;

                    default:
                        System.out.println(dia + "/" + mes + "/" + ayo);
                        break;
                }

                break;

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: // y las ultima y media, son los mese que terminan en 31, es media debido que
                     // sitermina en diciembre se sumaria un anno

                switch (dia) {

                    case 32:

                        if (mes == 12) {
                            mes = 1;
                            dia = 1;
                            ayo += 1;

                        }

                        else {
                            mes += 1;
                            dia = 1;
                            System.out.println("0" + dia + "/" + mes + "/" + ayo);

                        }

                        break;

                    case 33:
                        if (mes == 12) {
                            mes = 1;
                            dia = 2;
                            ayo += 1;

                        }

                        else {
                            mes += 1;
                            dia = 2;
                            System.out.println("0" + dia + "/" + mes + "/" + ayo);

                        }

                        break;

                    default:
                        System.out.println(dia + "/" + mes + "/" + ayo);
                        break;
                }

                break;

            default:
                System.out.println(dia + "/" + mes + "/" + ayo);
                break;
        }

    }

}
