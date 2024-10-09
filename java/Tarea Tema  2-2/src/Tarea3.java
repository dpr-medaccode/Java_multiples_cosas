public class Tarea3 {
    public static void main(String[] args) throws Exception {
        // en el casting esta el implicito y explicito

        // en el implicito seno se tiene que señalar aque se va a convertir

        int num = 10;

        double numdouble = num;

        System.out.println(numdouble);

        // y el explicito se tiene que marcar a que se tiene que convertir

        double numdouble2 = 10.5;

        int num2 = (int) numdouble2;

        System.out.println(num2);

        // y el parse es cambiar una variable como en este caso un string, a una
        // numerica

        String numerostr = "123";

        int num3 = Integer.parseInt(numerostr);

        System.out.println(num3);

    }

}