import java .util.Scanner;

public class Tarea3 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int num1=0, num2=0, num3=0, res=0;

        System.out.println("introduce el primer numero");
        num1=sc.nextInt();
        System.out.println("introduce el segundo numero");
        num2=sc.nextInt();
        System.out.println("introduce el tercer numero");
        num3=sc.nextInt();

        // al ser una media aritmetica exclusivamente de 3 numeros no es necesarios nada mas
        res=(num1+num2+num3)/3;
        
        System.out.println("el resultado es "+res);
        
    }
}
