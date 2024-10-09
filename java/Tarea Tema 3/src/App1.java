import java.util.Scanner;

public class App1 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        boolean acc = true;

        do {
            System.out.println();
            System.out.println(
                    "Bienvenido al menu de al Tarea 3, inroduzca el correspondiente numero para realizar la dicha funcion");
            System.out.println(" 1. SUMA/RESTA/MULTIPLICACIÓN/DIVISIÓN");
            System.out.println(" 2. CAMBIO DE SIGNO");
            System.out.println(" 3. MEDIA ARITMÉTICA");
            System.out.println(" 4. HIPOTENUSA");
            System.out.println(" 5. SEGUNDOS");
            System.out.println(" 6. ORDEN NÚMEROS CRECIENTE");
            System.out.println(" 7. ¿PAR O IMPAR?");
            System.out.println(" 8. SEMANAS, DÍAS Y HORAS");
            System.out.println(" 9. ¿AÑO BISIESTO O NO?");
            System.out.println("10. ÍNDICE MASA MUSCULAR");
            System.out.println("11. FACTORIAL");
            System.out.println(" 0. SALIR");

            int opc = sc.nextInt();

            switch (opc) {
                case 1:

                    System.out.println("inserte el primer numero");
                    double num1 = sc.nextDouble();

                    System.out.println("inserte el segundo numero");
                    double num2 = sc.nextDouble();

                    System.out.println();

                    double arraysrmd[] = SumaRestaMultiplicacionDivicion(num1, num2);

                    System.out.println("la suma es " + arraysrmd[0]);
                    System.out.println("la resta es " + arraysrmd[1]);
                    System.out.println("la multiplicacion es " + arraysrmd[2]);
                    System.out.println("la division es " + arraysrmd[3]);

                    break;

                case 2:

                    System.out.println("inserte numero");
                    int numsigent = sc.nextInt();

                    System.out.println();

                    int numsigsal = Signo(numsigent);

                    System.out.println("el numero con el signo combiado es " + numsigsal);

                    break;

                case 3:

                    System.out.println("indica el primer numero");
                    int MediaNum1 = sc.nextInt();

                    System.out.println("indica el segundo numero");
                    int MediaNum2 = sc.nextInt();

                    System.out.println("indica el tercer numero");
                    int MediaNum3 = sc.nextInt();

                    System.out.println();

                    double Media = MediaAritmetica(MediaNum1, MediaNum2, MediaNum3);

                    System.out.println("El resultadode la media es" + Media);

                    break;

                case 4:

                    System.out.println("introduce el primer cateto");
                    int cat1 = sc.nextInt();
                    System.out.println("introduce el segundo cateto");
                    int cat2 = sc.nextInt();

                    System.out.println();

                    double hip = Hipotenusa(cat1, cat2);

                    System.out.println("la hipotenusa es " + hip);

                    break;

                case 5:

                    System.out.println("introduce la cantidad de dias");
                    int diae = sc.nextInt();

                    System.out.println("introduce la cantidad de horas");
                    int hore = sc.nextInt();

                    System.out.println("introduce la cantidad de minutos");
                    int mine = sc.nextInt();

                    System.out.println("introduce la cantidad de segundos");
                    int segeini = sc.nextInt();

                    int segefin = DiaToSeg(diae, hore, mine, segeini);

                    System.out.println("la cantidad total de segundos es " + segefin);

                    break;

                case 6:

                    System.out.println("inserte el primer numero");
                    int ascnum1 = sc.nextInt();

                    System.out.println("inserte el segundo numero");
                    int ascnum2 = sc.nextInt();

                    System.out.println("inserte el tercer numero");
                    int ascnum3 = sc.nextInt();

                    boolean ascacc = AscendenteConSout(ascnum1, ascnum2, ascnum3);

                    break;

                case 7:

                    System.out.println("inserte el numero");
                    int numparim = sc.nextInt();

                    boolean parimbool = ParImpar(numparim);

                    if (parimbool == true) {

                        System.out.println("es par");

                    } else {
                        System.out.println("es impar");
                    }

                    break;

                case 8:

                    System.out.println("inserte la cantidad de horas");
                    int horaini = sc.nextInt();

                    int[] resultadode = HorasToSem(horaini);

                    System.out.println("hay " + resultadode[0] + " semanas, " + resultadode[1] + " dias y "
                            + resultadode[2] + " horas");

                    break;

                case 9:

                    System.out.println("inserte el año");
                    int ayo = sc.nextInt();

                    boolean res = Bisiesto(ayo);

                    if (res == true) {
                        System.out.println(" es bisiesto");
                    } else {
                        System.out.println(" no es bisiesto");
                    }

                    break;

                case 10:

                    System.out.println("introduzca el peso");
                    int peso = sc.nextInt();

                    System.out.println("introduzca la altura");
                    int alt = sc.nextInt();

                    String resmasa = MasaMuscular(peso, alt);

                    System.out.println(resmasa);

                    break;

                case 11:

                    System.out.println("indique el numero de la factorial");
                    int numero = sc.nextInt();

                    int numero2 = Factorial(numero);

                    System.out.println("la factorial es " + numero2);

                    break;

                case 0:
                    acc = false;

                    break;

                default:
                    System.out.println("Error: inserte otro numero");

                    break;

            }

        } while (acc == true);

    }

    public static double[] SumaRestaMultiplicacionDivicion(double num1, double num2) {

        double sum = num1 + num2;
        double res = num1 - num2;
        double mul = num1 * num2;
        double div = num1 / num2;

        double[] array = { sum, res, mul, div };

        return array;

    }

    public static int Signo(int X) {

        int Y = X * -1;

        return Y;

    }

    public static double MediaAritmetica(int X, int Y, int Z) {

        double A = (X + Y + Z) / 3;

        return A;

    }

    public static double Hipotenusa(int X, int Y) {

        double Z = Math.sqrt((X * X) + (Y * Y));

        return Z;

    }

    public static int DiaToSeg(int dia, int hor, int min, int segini) {

        int segdia = dia * 864000;
        int seghor = hor * 3600;
        int segmin = min * 60;

        int segfin = segini + segdia + seghor + segmin;

        System.out.println("test");

        return segfin;
    }

    public static boolean AscendenteConSout(int Xa1, int Ya2, int Za3) {

        // hhe descubierto que se pueden añadir sout a las funciones, lo hare solo en
        // esta porque no se si es correcto

        if ((Xa1 < Ya2) && (Ya2 < Za3)) {

            System.out.println();

            System.out.println("es acendente");

            boolean acc = true;

            return acc;
        }

        else {

            System.out.println();

            System.out.println("no es acendente");

            boolean acc = false;

            return acc;
        }

    }

    public static boolean ParImpar(int Xi) {

        if (Xi % 2 == 0) {

            // Es par

            boolean bool = true;

            return bool;

        } else {

            // Es impar

            boolean bool = false;

            return bool;

        }
    }

    public static int[] HorasToSem(int horas) {

        int dias = horas / 24;

        int sema = dias / 7;

        dias = dias - (sema * 7);

        horas = horas - ((dias * 24) + (sema * 168));

        int[] array = { sema, dias, horas };

        return array;
    }

    public static boolean Bisiesto(int X) {

        if (X % 4 == 0) {

            boolean bool = true;

            return bool;

        } else {

            boolean bool = false;

            return bool;
        }

    }

    public static String MasaMuscular(int peso, int alt) {

        double mm = peso / (alt * alt);

        if (mm < 18.5) {

            String res = "Bajo peso";

            return res;

        }

        else if (mm >= 18.5 && mm < 25) {

            String res = "Normopeso";

            return res;

        }

        else if (mm >= 25 && mm < 27) {

            String res = "Sobrepeso grado I";

            return res;

        }

        else if (mm >= 27 && mm < 30) {

            String res = "Sobrepeso grado II";

            return res;

        }

        else if (mm >= 30 && mm < 35) {

            String res = "Obesidad de tipo I";

            return res;

        }

        else if (mm >= 35 && mm <= 40) {

            String res = "Obesidad de tipo II";

            return res;

        }

        else if (mm >= 40 && mm <= 50) {

            String res = "Obesidad de tipo III (mórbida)";

            return res;
        }

        else {

            String res = "Obesidad de tipo IV (extrema)";

            return res;

        }

    }

    public static int Factorial(int X) {

        int nums = 1;

        for (int i = 0; i < X; i++) {

            nums *= X - i;

        }

        System.out.println("el factorial de " + X + " es " + nums);

        return nums;

    }

}
