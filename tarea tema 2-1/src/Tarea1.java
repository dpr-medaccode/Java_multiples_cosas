import java .util.Scanner;

public class Tarea1 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        // la variable es double para que sea posible hacer divisiones con decimales
        double num1=0, num2=0, sum=0, res=0, mul=0, div=0;

        System.out.println("introduce el primer numero");
        num1=sc.nextDouble();
        System.out.println("introduce el segundo nuero");
        num2=sc.nextDouble();

        // se realizan os 3 calculos
        sum=num1+num2;
        res=num1-num2;
        mul=num1*num2;
        div=num1/num2;

        System.out.println("el resultado de la suma es "+sum);
        System.out.println("el resultado de la resta es "+res);
        System.out.println("el resultado de la multiplicacion es "+mul);
        System.out.println("el resultado de la divsion es "+div);

    }
}
