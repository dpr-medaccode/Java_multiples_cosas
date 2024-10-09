public class App7 {
    public static void main(String[] args) throws Exception {
        
        int dado1 = 6, dado2 = 5, dado3 = 6;
        int res = 0;
        
        if (dado1 == 6) {
            res ++;
        }
        if (dado2 == 6) {
            res ++;
        }
        if (dado3 == 6) {
            res ++;
        }

        switch (res) {
            case 0:
                System.out.println("Pesimp");
                break;
            case 1: 
                System.out.println();
                break;
            case 2: 
                System.out.println();
            default:
                break;
        }


    }
}
