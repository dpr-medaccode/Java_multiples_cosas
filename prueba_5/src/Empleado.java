public class Empleado {

    private String nombre;

    private String apellido;

    private String telefono;

    private Contrato contratoEmpleado;

    

    /* 

    public Empleado(String nombre, String apellido, String telefono, Contrato contrato) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.contratoEmpleado = new Contrato(0, false, telefono);
    }

    public Empleado(String nombre, String apellido, String telefono, Contrato contrato) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.contratoEmpleado = new Contrato();
    }

    */

    public Empleado(String nombre, String apellido, String telefono, Contrato contratoEmpleado) {

        if (nombre.length() < 3 || nombre.length() > 20 ) {

            this.nombre = "";

        } else {

            this.nombre = nombre;

        }

        if (apellido.length() < 3 || apellido.length() > 60 ) {

            this.apellido = "";

        } else {

            this.apellido = apellido;

        }

        if (telefono.charAt(0) == '+' && telefono.charAt(1) == '3' && telefono.charAt(1) == '4' || telefono.length() != 12 ) {

            this.telefono = "";
            
        } else { this.telefono = telefono; }

        this.contratoEmpleado = contratoEmpleado;

    }

    public Empleado() {
        this.nombre = "";
        this.apellido = "";
        this.telefono = "";
        this.contratoEmpleado = new Contrato();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        if (this.nombre.length() < 3 || this.nombre.length() > 20 ) {

        } else {

            this.nombre = nombre;

        }

    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {

        if (this.apellido.length() < 3 || this.apellido.length() > 60 ) {

        } else {

            this.apellido = apellido;

        }
        
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {


        if (this.telefono.charAt(0) == '+' || this.telefono.charAt(1) == '3' || this.telefono.charAt(1) == '4' && this.telefono.length() != 12 ) {
            
        } else { this.telefono = telefono; }

    }

    public Contrato getContrato() {
        return contratoEmpleado;
    }

    public void setContrato(Contrato contrato) {
        contratoEmpleado = contrato;
    }

    @Override
    public String toString() {
        return "Empleado [nombre = " + nombre + ", apellido = " + apellido + ", telefono = " + telefono + ", Contrato = "
                + contratoEmpleado + "]";
    }

}
