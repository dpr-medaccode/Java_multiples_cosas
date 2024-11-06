import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int[][] sala = { { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0 } };

        boolean acc = true;

        do {

            System.out.println("1. Mostrar la sala");
            System.out.println("2. Reservar asiento");
            System.out.println("3. Ocupar asiento");
            System.out.println("4. Cancelar reserva / ocupacion");
            System.out.println("5. Buscar asiento disponible aleatorio");
            System.out.println("6. Contar asientos ocupados");
            System.out.println("7. Salir");

            int tipoacc = sc.nextInt();

            switch (tipoacc) {
                case 1:

                    System.out.println();

                    int num = 0;

                    for (int i = 0; i < sala.length; i++) {

                        num++;

                        System.out.print(num + ": ");

                        for (int j = 0; j < sala[1].length; j++) {

                            if (sala[i][j] == 0) {

                                System.out.print(". ");

                            } else if (sala[i][j] == 1) {

                                System.out.print("X ");

                            } else if (sala[i][j] == 2) {

                                System.out.print("R ");

                            } else {

                                System.out.print("E ");

                            }

                        }

                        System.out.println();

                    }

                    System.out.println();

                    break;

                case 2:

                    System.out.println();

                    System.out.println("Indique la fila horinzontal");

                    boolean acc21 = true;

                    int asifilareser;

                    do {

                        asifilareser = sc.nextInt();

                        if (asifilareser < 1 && asifilareser > (sala.length + 1)) {

                            System.out.println("introduzca un numero valido");

                        } else {

                            acc21 = false;

                        }

                    } while (acc21);

                    System.out.println("Indique el numero de asiento");

                    boolean acc22 = true;

                    int asinumreser;

                    do {

                        asinumreser = sc.nextInt();

                        if (asinumreser < 1 && asinumreser > (sala[asifilareser].length + 1)) {

                            System.out.println("introduzca un numero valido");

                        } else {

                            acc22 = false;

                        }

                    } while (acc22);

                    asifilareser = asifilareser - 1;

                    asinumreser = asinumreser - 1;

                    if (sala[asifilareser][asinumreser] == 1 || sala[asifilareser][asinumreser] == 2) {

                        System.out.println("Asiento no disponible eliga otro");

                    } else {

                        sala[asifilareser][asinumreser] = 2;

                    }

                    System.out.println();

                    break;

                case 3:

                    System.out.println();

                    System.out.println("Indique la fila horinzontal");

                    boolean acc31 = true;

                    int asifilaocup;

                    do {

                        asifilaocup = sc.nextInt();

                        if (asifilaocup < 1 && asifilaocup > (sala.length + 1)) {

                            System.out.println("introduzca un numero valido");

                        } else {

                            acc31 = false;

                        }

                    } while (acc31);

                    System.out.println("Indique el numero de asiento");

                    boolean acc32 = true;

                    int asinumocup;

                    do {

                        asinumocup = sc.nextInt();

                        if (asinumocup < 1 && asinumocup > (sala[asifilaocup].length + 1)) {

                            System.out.println("introduzca un numero valido");

                        } else {

                            acc32 = false;

                        }

                    } while (acc32);

                    asifilaocup = asifilaocup - 1;

                    asinumocup = asinumocup - 1;

                    if (sala[asifilaocup][asinumocup] == 1 || sala[asifilaocup][asinumocup] == 2) {

                        System.out.println("Asiento no disponible eliga otro");

                    } else {

                        sala[asifilaocup][asinumocup] = 1;

                    }

                    System.out.println();

                    break;

                case 4:

                    System.out.println("Indique la fila horinzontal");

                    boolean acc41 = true;

                    int asifilacancel;

                    do {

                        asifilacancel = sc.nextInt();

                        if (asifilacancel < 1 && asifilacancel > (sala.length + 1)) {

                            System.out.println("introduzca un numero valido");

                        } else {

                            acc41 = false;

                        }

                    } while (acc41);

                    int asinumcancel;

                    System.out.println("Indique el numero del asiento");

                    boolean acc42 = false;

                    do {

                        asinumcancel = sc.nextInt();

                        if (asinumcancel < 1 && asinumcancel > (sala[asifilacancel].length + 1)) {

                            System.out.println("introduzca un numero valido");

                        } else {

                            acc32 = false;

                        }

                    } while (acc42);

                    System.out.println();


                    asifilacancel = asifilacancel - 1;

                    asinumcancel = asinumcancel - 1;

                    if (sala[asifilacancel][asinumcancel] == 1 || sala[asifilacancel][asinumcancel] == 2) {

                        sala[asifilacancel][asinumcancel] = 0;

                    } else {

                        System.out.println("Asiento no ocupado eliga otro");

                    }

                    System.out.println();

                    break;

                case 5:

                    System.out.println();

                    boolean acc5 = true;

                    while (acc5) {

                        int filaale = (int) Math.floor(Math.random() * sala.length);

                        int numale = (int) Math.floor(Math.random() * sala[filaale].length);

                        if (sala[filaale][numale] == 1 || sala[filaale][numale] == 2) {

                        } else {

                            filaale++;

                            numale++;

                            System.out.println("En la fila " + filaale + " el numero " + numale + " esta disponible");

                            acc5 = false;

                        }

                    }

                    System.out.println();

                    break;

                case 6:

                    System.out.println();

                    int asientosocu = 0;

                    for (int i = 0; i < sala.length; i++) {

                        for (int j = 0; j < sala[1].length; j++) {

                            if (sala[i][j] == 1 || sala[i][j] == 2) {

                                asientosocu++;

                            }

                        }

                    }

                    System.out.println("Hay " + asientosocu + " asientos ocupados");

                    System.out.println();

                    break;

                
                case 7:

                    acc = false;

                    break;

                default:

                    break;
            }

        } while (acc == true);

    }

}