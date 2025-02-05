import java.util.LinkedList;

public class App3 {
    public static void main(String[] args) throws Exception {

        LinkedList<Character> abcdario = new LinkedList<Character>();

        for (int i = 65; i <= 90; i++) {

            abcdario.add((char) i);

        }

        System.out.println(abcdario);

        System.out.println(abcdario.indexOf('E') + " " + abcdario.indexOf('H') + " " + abcdario.indexOf('O'));

        System.out.println(abcdario.remove(1) + " " + abcdario.remove((Character)'U'));

        System.out.println(abcdario);

    }

}