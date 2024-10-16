import java .util.Scanner;

public class Tarea1 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        int dado1 = 0;

        System.out.println("ingrese el numero obtenido del dado");

        dado1=sc.nextInt();

        String dadot = "";

        switch (dado1){
            case 1: dadot = "Seis";
                break;
            case 2: dadot = "Cinco";
                break;
            case 3: dadot = "Cuatro";
                break;
            case 4: dadot = "Tres";
                break;
            case 5: dadot = "Dos";
                break;
            case 6: dadot = "Uno";
                break;
            default: System.out.println("ERROR: número incorrecto.");
                        dado1 = 0;
                break;
            }
        

        if (dado1 == 0 ) {
        
        }
            
            else { System.out.println("la cara opuesta en un dado de 6 lados es "+dadot);};
    }

            


    }

 