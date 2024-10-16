public class Estructuras_de_control6 {
    public static void main(String[] args) throws Exception {
        
       int num = 6;

       System.out.println(num);

       boolean acc = false;

       for (int i = 1; i < 6 ;i++) {

        if (acc == false) {

            num = num * 3;

            acc = true;

            }

        else{

            num = num + 2;

            acc = false;

            }

        System.out.println(num);

    }
}

}
