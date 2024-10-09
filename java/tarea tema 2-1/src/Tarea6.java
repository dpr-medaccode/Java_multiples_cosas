import java .util.Scanner;

public class Tarea6 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        // las variavle se especifican en double debido que multiples de las conversiones de centigrados a fahrenheit son numeros con decimales
        double cen=0, fah=0;

        System.out.println("introduzca su temperatura en grados centigrados");
        cen=sc.nextDouble();
        
        fah=32+(9*cen/5);
        
        System.out.println("su temperatura en grados fahrenheit es "+fah+"°F");
        
    }
}
