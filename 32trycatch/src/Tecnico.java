public class Tecnico {

    private int id;

    private String nombre;

    private Coche coche;

    

    public Tecnico(int id, String nombre) throws CocheIdException {
        this.id = id;
        this.nombre = nombre;
        
        this.coche = new Coche(1, "marca", "modelo");
        coche.setId(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Tecnico [id=" + id + ", nombre=" + nombre + "]";
    }

    
    
}
