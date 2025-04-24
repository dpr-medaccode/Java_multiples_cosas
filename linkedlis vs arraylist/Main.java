import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws Exception {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        System.out.println(arrayList); // Salida: [A, B, C]

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        System.out.println(linkedList); // Salida: [A, B, C] 

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        System.out.println(arrayList.get(0)); // Output: A

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.addLast("B"); // Adding as a list
        linkedList.addFirst("C"); // Queue operation, adding at the front
        System.out.println(linkedList.getFirst()); // Salida: C

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add(1, "C");
        System.out.println(arrayList.get(1)); // Salida: Y

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add(1, "C"); // Inserting in the middle
        System.out.println(linkedList); // Salida: [X, Y, Z]

    }

}
