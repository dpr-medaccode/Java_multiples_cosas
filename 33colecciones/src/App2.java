import java.util.LinkedList;

public class App2 {
    public static void main(String[] args) throws Exception {

        LinkedList<Double> lista = new LinkedList<Double>();

        lista.add(1.5);

        lista.add(5.5);

        lista.add(-1.5);



        System.out.println(lista);

        System.out.println(lista.size());



        lista.add(1, -5.5);

        System.out.println(lista);



        System.out.println(lista.get(0));

        System.out.println(lista.remove(0));


        

        System.out.println(lista);

        lista.remove(5.5);



        LinkedList<Integer> lista2 = new LinkedList<Integer>();

        lista2.add(2);

        lista2.add(4);

        lista2.add(3);

        Integer v = 2;

        lista2.remove(v);

        System.out.println(lista2);



        lista2.clear();

        System.out.println(lista2);



        lista.set(0, 8.8);

        System.out.println(lista);

        System.out.println(lista.contains(8.8));

        System.out.println(lista.indexOf(-1.5));



        System.out.println(lista2.isEmpty());

        lista.add(2.3);

        lista.add(8.8);

        System.out.println(lista.lastIndexOf(8.8));

    }

}
