import java .util.Scanner;

public class Tarea4 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int num1=0, num2=0;
        double res=0;

        System.out.println("introduce el primer cateto");
        num1=sc.nextInt();
        System.out.println("introduce el segundo cateto");
        num2=sc.nextInt();

        // Math.sqrt se utiliza para hacer una raiz cuadrada
        res= Math.sqrt((num1*num1)+(num2*num2));
        
        System.out.println("el resultado es "+res);
        
    }
}
