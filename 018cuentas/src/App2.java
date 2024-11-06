public class App2 {
    public static void main(String[] args) throws Exception {
        
        Integer contador = 3;

        System.out.println(contador);

        contador = sumar(contador);

        System.out.println(contador);

    }

    public static Integer sumar(Integer num){

        return num + 10; 
        
    }

}