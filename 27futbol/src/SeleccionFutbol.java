import java.util.ArrayList;

public class SeleccionFutbol {

    private int id;

    private String nombre;

    private ArrayList<Persona> equipo;

    public SeleccionFutbol(int id, String nombre) {

        this.id = id;

        this.nombre = nombre;

        this.equipo = new ArrayList<Persona>();

    }

    

    protected int getId() {
        return id;
    }


    @Override
    public String toString() {
        return "SeleccionFutbol [id=" + id + ", nombre=" + nombre + "]";
    }

    public boolean addPersona(Persona persona) {

        // hs code y equal

        for (int i = 0; i < this.equipo.size(); i++) {

            if (persona.getId() == equipo.get(i).getId()) {

                return false;

            }

        }

        this.equipo.add(persona);

        return true;

    }

    public boolean removePersona(int id) {

        for (int i = 0; i < this.equipo.size(); i++) {

            if (id == this.equipo.get(i).getId()) {

                this.equipo.remove(i);

                return true;

            }

        }

        return false;

    }

    public void listIntegrantes() {

        for (int i = 0; i < this.equipo.size(); i++) {

            System.out.println(this.equipo.get(i));

        }

    }

    public void listFutbolistasSobrepeso() {

        for (int i = 0; i < this.equipo.size(); i++) {

            if (equipo.get(i) instanceof Futbolista && ((Futbolista) equipo.get(i)).tieneSobrepeso()) {

                System.out.println(this.equipo.get(i));

            }

        }

    }

}
