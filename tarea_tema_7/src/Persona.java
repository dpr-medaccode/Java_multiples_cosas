import java.util.regex.Pattern;

public class Persona {

    private String telefono;

    private String email;

    private String fechanac;

    private String dni;

    public Persona(String telefono, String email, String fechanac, String dni) {
        this.telefono = telefono;
        this.email = email;
        this.fechanac = fechanac;
        if (validarDni(dni)) {
            this.dni = dni;
        } else {
            this.dni = "";
        }
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechanac() {
        return fechanac;
    }

    public void setFechanac(String fechanac) {
        this.fechanac = fechanac;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        if (validarDni(dni)) {
            this.dni = dni;
        } else {
            this.dni = "";
        }
    }

    private boolean validarDni(String dni) {
        if (dni == null || !Pattern.matches("\\d{8}[A-Z]", dni)) {

            return false;

        } else {

            return true;

        }

    }

    @Override
    public String toString() {
        return "Persona [telefono=" + telefono + ", email=" + email + ", fechanac=" + fechanac + ", dni=" + dni + "]";
    }

    

}