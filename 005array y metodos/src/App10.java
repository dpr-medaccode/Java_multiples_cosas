public class App10 {
    public static void main(String[] args) throws Exception {

        int[] num = {1, 2, 3, 4, 5};

        int num2 = calcularSuma(num);

        System.out.println(num2);
 
    }
        
    public static int calcularSuma (int[]array){
        
        int SumaTotal = 0;

        for(int i = 0; i < array.length; i++){
            SumaTotal = SumaTotal + array[i];
        }

        return SumaTotal;
    }

}