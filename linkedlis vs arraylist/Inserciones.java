import java.util.ArrayList;
import java.util.LinkedList;

public class Inserciones {
    
    public static void main(String[] args) {
        
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A"); 
        arrayList.add("B");
        arrayList.add("C");
        arrayList.remove(2); // Eliminando elemento el el index 1 (C)
        System.out.println(arrayList.get(1)); // Salida: B <- [A, B]
        

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("B");
        linkedList.addFirst("A"); // Añadiendo al Principio
        linkedList.addLast("C"); // Añadiendo al final
        linkedList.removeLast(); // Eliminando last elemento (C)
        System.out.println(linkedList.getLast());

    }
}
