public class App5 {
    public static void main(String[] args) throws Exception {
        
       int num = 6;

       System.out.println(num);

       boolean acc = false;

       for (int i = 1; i < 4 ;i++) {

        if (acc == false) {

            num = num * 3;

            acc = true;

            System.out.println(num);

            }

        if ( acc == true) {

            num = num + 2;

            acc = false;

            System.out.println(num);

        }

        

    }
}

}
