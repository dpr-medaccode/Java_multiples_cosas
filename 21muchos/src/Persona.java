import java.util.ArrayList;

public class Persona {

    private String nombre;

    private ArrayList<Perro> mascota = new ArrayList();

    public Persona(String n) {

        this.nombre = n;

    }

    public void agregarMascota(Perro p){

        mascota.add(p);

    }

}
