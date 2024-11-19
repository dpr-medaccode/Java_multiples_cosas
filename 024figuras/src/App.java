import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        Triangulo t1 = new Triangulo("negro", 2, 2, 4);

        Cuadrado c1 = new Cuadrado("negro", 4, 7);

        ArrayList<Figura> figuras = new ArrayList<Figura>();

        figuras.add(t1);

        figuras.add(c1);

        for (int i = 0; i < figuras.size(); i++){

            System.out.println(figuras.get(i).calcularArea());

        }

    }
    
}
