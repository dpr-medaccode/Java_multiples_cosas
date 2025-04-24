import java.util.ArrayList;
import java.util.LinkedList;

public class Tamaño {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            arrayList.add(i);
        }
        System.out.println("ArrayList size: " + arrayList.size()); // Salida: ArrayList size: 100

        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            linkedList.add(i);
        }
        System.out.println("LinkedList size: " + linkedList.size()); // Salida: LinkedList size: 100

    }
}
