import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("indica el tiempo en segundos: ");
        int seg = sc.nextInt();

          int min = seg / 60;

          if (min >= 60){

           int hor = min / 60;

           min = (hor * 60) - min;

           int mint = min * -1;

           seg = (min * 60) - seg;

           seg = (hor * 3600) - seg;

           int segt = seg * -1;



           System.out.println(hor);
           System.out.println(mint);
           System.out.println(segt);

          }else{seg = (min * 60) - seg;

            System.out.println();
            int segt = seg * -1;
    
            System.out.println(min);
            System.out.println(segt);}

        
        

         

    }
}





/*
 * 500 / 60= 8,3
 * 
 * 8 * 60 = 480
 * 
 * 480 - 500 = 20
 * 
 * 
 * 
 * 
 */