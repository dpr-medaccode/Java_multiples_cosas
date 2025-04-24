public class Paciente implements Comparable <Paciente>{

    private int habitacion;

    private int cama;

    private String nombre;

    private String apellidos;

    private String dieta;

    public Paciente(int habitacion, int cama, String nombre, String apellidos, String dieta) {

        this.habitacion = habitacion;
        this.cama = cama;

        if (this.cama != 1 && this.cama != 2) this.cama = -1;

        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dieta = dieta;

    }

    public int getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(int habitacion) {
        this.habitacion = habitacion;
    }

    public int getCama() {
        return cama;
    }

    public boolean setCama(int cama) {

        if (cama == 1 || cama == 2) {

            this.cama = cama;

            return true;

        } else

            return false;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + habitacion;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Paciente other = (Paciente) obj;
        if (habitacion != other.habitacion)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Paciente [habitacion=" + habitacion + ", cama=" + cama + ", nombre=" + nombre + ", apellidos="
                + apellidos + ", dieta=" + dieta + "]";
    }

    @Override
    public int compareTo (Paciente p) {

        if (p.getHabitacion() > this.getHabitacion()) {

            return -1;
            
        } else if (p.getHabitacion() < this.getHabitacion()) {

            return 1;
            
        }

        return 0;


    }

}
