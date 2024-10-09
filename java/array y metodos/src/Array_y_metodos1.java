import java.util.Scanner;
public class Array_y_metodos1 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        
        int num1 = 1, num2 = 2,num3 = 3, num4 = 1, num5 = 2;

        System.out.println("inserte el primer numero");
        num1 = input.nextInt();
           
        System.out.println("inserte el segundo numero");
        num2 = input.nextInt();

        System.out.println("inserte el tercer numero");
        num3 = input.nextInt();

        System.out.println("inserte el cuarto numero");
        num4 = input.nextInt();
              
        System.out.println("inserte el quinto numero");
        num5 = input.nextInt();

        System.out.println(num1+", "+num2+", "+num3+", "+num4+", "+num5);


    }
}
