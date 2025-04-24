import java.util.LinkedList;

public class FuncionesLinkedList {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("B");
        System.out.println(linkedList);

        System.out.println("/////////////////////////////////////");

        linkedList.addFirst("A");
        linkedList.addLast("C");
        System.out.println(linkedList);

        System.out.println("/////////////////////////////////////");

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

        System.out.println("/////////////////////////////////////");

        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList );

    }

}
