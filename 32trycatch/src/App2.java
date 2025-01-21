
public class App2 {
    public static void main(String[] args) {

        Coche c1 = new Coche(1, "marca", "modelo");

        try {

            c1.setId(6);

        } catch (CocheIdException e) {

            e.printStackTrace();

        }

        try {

            Tecnico t1 = new Tecnico(0, "Manolo");

        } catch (CocheIdException e) {

            e.printStackTrace();

        }
       
    }

}
