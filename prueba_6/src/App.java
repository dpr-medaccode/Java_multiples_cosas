import java.time.LocalDateTime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        boolean var = true;

        Scanner sc = new Scanner(System.in);

        Tractor t1 = new Tractor("Tractor", 10);

        Autobus a1 = new Autobus("Autobus", 5);

        do {

            System.out.println();

            System.out.println("1. Alquilar Autobus");
            System.out.println("2. Desalquilar Autobus");
            System.out.println("3. Dar paseo en Autobus (10 km)");
            System.out.println("4. Alquilar Tractor");
            System.out.println("5. Desalquilar Tractor");
            System.out.println("6. Dar paseo en Tractor (3 dias)");
            System.out.println("7. Salir");

            int acc = sc.nextInt();

            System.out.println();

            switch (acc) {

                case 1:

                    if (a1.disponible) {

                        a1.Alquilar();

                        System.out.println("has alquilado el autobus");

                    } else {

                        System.out.println("El autobus ya esta ocupado");

                    }

                    break;

                case 2:

                    if (!a1.disponible) {

                        System.out.println(a1.desAlquilar() + " es el precio del alquiler ");

                        a1.disponible = true;
                        
                    } else {

                        System.out.println("el autobus esta disponible, no esta alquilado a su nombre");

                    }


                    break;

                    case 3:

                    if (!a1.disponible) {

                        a1.paseoAutobus();

                        System.out.println("has dado un paseo en autobus");
                        
                    } else {

                        System.out.println("alquila uno para dar un paseo");

                    }

                    break;

                case 4:

                    if (t1.disponible) {

                        t1.Alquilar();

                        System.out.println("has alquilado el Tractor");

                    } else {

                        System.out.println("El Tractor ya esta ocupado");

                    }

                    break;

                    case 5:

                    if (!t1.disponible) {

                        System.out.println(t1.desAlquilar() + " es el precio del alquiler ");

                        a1.disponible = true;
                        
                    } else {

                        System.out.println("el Tractor esta disponible, no esta alquilado a su nombre");

                    }

                    break;

                    case 6:

                    if (!t1.disponible) {

                        t1.paseoTractor();

                        System.out.println("has dado un paseo en tractor");
                        
                    } else {

                        System.out.println("alquila uno para dar un paseo");

                    }



                    break;

                    case 7:

                    var = false;

                    break;


                    

                default:

                System.out.println("introduze un valor posible");

                    break;
            }

        } while (var);

    }

}
