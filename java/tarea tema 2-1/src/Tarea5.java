import java .util.Scanner;

public class Tarea5 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        //aqui se especifica que seran variavles los dias, horas, minutos y segundos
        // pero tambien se especifican sus contrapartes en segundos, ejemplo = segmin
        int segini=0, min=0,segmin=0, hor=0, seghor=0, dia=0,segdia=0, segfin=0;

        System.out.println("introduce la cantidad de dias");
        dia=sc.nextInt();
        System.out.println("introduce la cantidad de horas");
        hor=sc.nextInt();
        System.out.println("introduce la cantidad de minutos");
        min=sc.nextInt();
        System.out.println("introduce la cantidad de segundos");
        segini=sc.nextInt();

        //se calculan los segundos multiplicando el correspondiente numero a su formato,
        //ejm = hay 60 segungudos en un minuto y por eso se multiplica por 60
        segdia=dia*864000;
        seghor=hor*3600;
        segmin=min*60;

        //se suman los segundos obtenidos
        
        segfin=segini+segdia+seghor+segmin;
        
        System.out.println("La cantidad de segundos en total es "+segfin);
        
    }
}
