import java .util.Scanner;

public class Operadores_airtmeticos4 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int num1 = 0;

        System.out.println("introduzca el numero");

        num1=sc.nextInt();

        if(num1%2==0){
            System.out.println("Es par"); 
        }
            else{
                System.out.println("es impar");
            }



        
    }
}
