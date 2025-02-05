import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {

        LinkedList<Integer> lista = new LinkedList<Integer>();

        for (int i = 0; i < 10; i++) {

            lista.add(i);

        }

        lista.remove(4);

        boolean estae114 = lista.contains(4);

        System.out.println(estae114);

        for (Integer i : lista) {

            System.out.println(i);

        }

       

    }
}
