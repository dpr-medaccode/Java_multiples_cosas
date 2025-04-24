import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws Exception {

        /*
         * Un ejemplo de codigo de como funciona el equals , compare Too , treeset ,
         * hasset
         * 
         * un ejemplo usando una clase
         * 
         * Por ejemplo con una clase persona que tendrá unos atributos (dni,edad..)
         * 
         * Un ejemplo básico del uso de los genéricos
         * que sepas usarlo y de qué forma lo usarias
         */

        Persona p1 = new Persona(21, "juan");
        Persona p2 = new Persona(23, "juan");
        Persona p3 = new Persona(33, "Alberto");
        Persona p4 = new Persona(33, "Maria");

        HashSet<Persona> hashSet = new HashSet<>(); // equals() y hashCode()
        hashSet.add(p1);
        hashSet.add(p2);
        hashSet.add(p3);
        hashSet.add(p4);
        System.out.println(hashSet); // no grantiza el orden / pero si graritiza no repetidos por hash

        TreeSet<Persona> treeSet = new TreeSet<>(); // compareTo()
        treeSet.add(p1);
        treeSet.add(p2);
        treeSet.add(p3);
        treeSet.add(p4);
        System.out.println(treeSet); // aqui si que garantiza el orden / pero no garantiza no repetidos 

        System.out.println(p1.compareTo(p2));
        System.out.println(p2.compareTo(p1));
        System.out.println(p3.compareTo(p4));

        System.out.println(p1.equals(p2));
        System.out.println(p3.equals(p4));

        imprimirColeccion(treeSet);
        imprimirColeccion(hashSet);

    }

    public static <T> void imprimirColeccion(Collection<T> coleccion) {
        for (T item : coleccion) {
            System.out.println(item);
        }

    }
}