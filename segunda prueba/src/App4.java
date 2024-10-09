import java.util.Scanner;

public class App4 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("introduzca cantidad de numeros:");
        int num = sc.nextInt();

        num++;

        int cero = 0, ceromas = 0, ceromenos = 0;

        for (int i = 1; i < num; i++ ){

            System.out.println("introduze el numero "+i+":");
            int selc = sc.nextInt();

            if (selc == 0) {

                cero++;
                
            }

           else if (selc < 0){

           ceromenos++;

           }

           else if (selc > 0){

            ceromas++;
 
            }

        }

        System.out.println("Se han introducido "+ceromas+" numeros mayores a 0, "+cero+" numeros igual a 0 y "+ceromenos+" numeros menores a 0");
       
    }
}
