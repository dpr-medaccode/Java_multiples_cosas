import java.util.Scanner;

public class Prueba2_2 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("indica el tiempo en segundos: ");
        int seg = sc.nextInt();

        int min = seg / 60;

        int hor = seg / 3600;

        int segog = seg;

        int minog = min;

        int horog = hor;

        System.out.println(seg);
        System.out.println(min);
        System.out.println(hor);

        min = min - (hor * 60);

        System.out.println(seg);
        System.out.println(min);
        System.out.println(hor);

        seg = ((min * 60) + (horog * 3600)) - seg;
        int segv = seg * -1;

        System.out.println(segv);
        System.out.println(min);
        System.out.println(hor);

        for (int i = segv; i > 0; i--) {
            System.out.println(hor + "/" + min + "/" + i);
        }

        System.out.println(hor + "/" + min + "/0");

        segv = 0;

        min--;

        segv = 59;

        for (int i = 60; i > 0; i--) {
            System.out.println(hor + "/" + min + "/" + i);
        }
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