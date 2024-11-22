public class Vehiculo {

    protected String matricula;

    protected boolean disponible;

    public Vehiculo(String matricula) {

        this.matricula = matricula;

        this.disponible = true;

    }

    public Vehiculo(Vehiculo v) {

        this.matricula = v.matricula;

        this.disponible = v.disponible;

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Vehiculo [matricula=" + matricula + ", disponible=" + disponible + "]";
    }

    public boolean Alquilar() {

        if (this.disponible) {

            this.disponible = false;

            return true;

        } else {

            return false;

        }

    }

}
