import java .util.Scanner;

public class Tarea2 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int num1=0, res =0;

        System.out.println("introduce el numero");
        num1=sc.nextInt();

        // al multiplicarse un numero por -1 se obtiene el el mismo pero con el signo cambiado
        res=num1*-1;
        
        System.out.println("el resultado es "+res
        );
        
    }
}
