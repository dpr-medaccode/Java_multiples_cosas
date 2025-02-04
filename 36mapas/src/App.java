import java.util.ArrayList;
import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayList <Integer> numeros = new ArrayList<Integer>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        for (Integer num : numeros) {

            System.out.println(num);
            
        } 

        System.out.println();

        HashMap <Integer, String> palabras = new HashMap<Integer, String>();

        palabras.put(6, "teclado");
        palabras.put(9, "pantalla");
        palabras.put(3, "raton");

        for ( Integer clave : palabras.keySet()) {

            System.out.println(clave + " " + palabras.get(clave));
            
        }

        System.out.println();

        palabras.forEach((key, vaule) -> {

            System.out.println(key + " " + vaule);

        });

        System.out.println();

        ArrayList <ArrayList<String>> granosDeArroz = new ArrayList<ArrayList<String>>();

        ArrayList <String> cereales = new ArrayList<String>();
        cereales.add("grano");
        cereales.add("congelados");

        granosDeArroz.add(cereales);

        ArrayList <String> verduras = new ArrayList<String>();
        verduras.add("cebolla");
        verduras.add("pimiento");

        granosDeArroz.add(verduras);

        ArrayList <String> raro = new ArrayList<String>();
        raro.add("ajo");
        raro.add("aceite");

        granosDeArroz.add(raro);

        for ( ArrayList<String> array : granosDeArroz) {

            for (String string : array) {

                System.out.println(string);
                
            }

            System.out.println();
            

        }

        System.out.println();
        System.out.println();

        HashMap <String, ArrayList<String>> congelados = new HashMap<String, ArrayList<String>>();

        congelados.put("cereales", cereales);
        congelados.put("verduras", verduras);
        congelados.put("raro", raro);

        for (String clave : congelados.keySet()) {

            System.out.println("Lista: " + clave);

            for (String string : congelados.get(clave)) {

                System.out.println(string);
                
            }

            System.out.println();
            
        }


    }
}
