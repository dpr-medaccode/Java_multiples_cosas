public class Cliente {

    private String nombre;

    private CtaCte cuenta;

    public Cliente(String n){

        this.nombre = n;

    }

    public void agregarCuenta (CtaCte c){

        cuenta = c;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CtaCte getCuenta() {
        return cuenta;
    }

    public void setCuenta(CtaCte cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", cuenta=" + cuenta + "]";
    }

    
    
}
