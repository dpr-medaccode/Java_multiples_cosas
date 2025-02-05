import java.util.ArrayList;
import java.util.HashMap;

public class App5 {
    public static void main(String[] args) throws Exception {

        ArrayList<Personas> personas = new ArrayList<Personas>();

        HashMap<String, String> mundo = new HashMap<String, String>();

        mundo.put("España", "Madrid");
        mundo.put("francia", "paris");
        mundo.put("portugal", "lisboa");


        for (String i : mundo.keySet()) {

            System.out.println(i);

            mundo.get(i);
            
        }

        System.out.println(mundo.get("España"));
    }

}
