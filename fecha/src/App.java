import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

                Scanner input = new Scanner(System.in);

        String fecha = "";

        System.out.println("introduzca la fecha en el formato XX/XX/XXXX");
        System.out.println("Ejm: 01/10/2010");

        fecha = input.nextLine();
        ;

        String sdia = fecha.charAt(0) + "" + fecha.charAt(1);

        String smes = fecha.charAt(3) + "" + fecha.charAt(4);

        String sayo = fecha.charAt(6) + "" + fecha.charAt(7) + fecha.charAt(8) + fecha.charAt(9);

        int dia = Integer.parseInt(sdia);

        int mes = Integer.parseInt(smes);

        int ayo = Integer.parseInt(sayo);

        dia += 2;

        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia < 30){
                mes = mes +1;
                dia = dia -30;

            }
        }

        
        if (mes == 1 || mes ==3) {
            if (dia < 31){
                mes = mes +1
                dia = dia -31

            }
        }

    }
}
