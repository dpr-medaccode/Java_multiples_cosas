public class Usuario {
    
    private String nombre;

    private Clave clave;

    public Usuario(String nombre, Clave clave) {
        this.nombre = nombre;
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Clave getClave() {
        return clave;
    }

    public void setClave(Clave clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "Usuario [nombre=" + nombre + ", clave=" + clave + "]";
    }

}
