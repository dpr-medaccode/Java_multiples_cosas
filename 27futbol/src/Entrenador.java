public class Entrenador extends Persona implements Deportista {

    private int idFederacion;

    public Entrenador(int id, String nombre, String apellidos, String fechaNac, double peso, double altura,
            int idFederacion) {
        super(id, nombre, apellidos, fechaNac, peso, altura);
        this.idFederacion = idFederacion;
    }

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public String toString() {
        return "Entrenador [id=" + super.id + ", idFederacion=" + idFederacion + ", nombre=" + super.nombre
                + ", apellidos="
                + super.apellidos + ", fechaNac=" + super.fechaNac + ", peso=" + super.peso + ", altura=" + super.altura
                + "]";
    }

    @Override
    public void viajar() {

        System.out.println(this.nombre + " esta viajando");

    }

    public void Entrenar() {
    }

    public void jugarPartido() {
    }

    public boolean tieneSobrepeso() {

        return (this.peso / (this.altura * 2) >= 25);

    }

}
