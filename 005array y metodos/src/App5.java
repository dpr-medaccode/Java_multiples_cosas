import java.util.Scanner;
public class App5 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        int[] array = {1,2,3,4,5};

        for(int i = array.length-1; i >= 0; i--){
            System.out.println(array[i]);
        }

    }
}