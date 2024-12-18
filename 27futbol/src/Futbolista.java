public class Futbolista extends Persona implements Deportista {

    private int dorsal;

    private String demarcacion;

    public Futbolista(int id, String nombre, String apellidos, String fechaNac, double peso, double altura, int dorsal,
            String demarcacion) {

        super(id, nombre, apellidos, fechaNac, peso, altura);

        this.dorsal = dorsal;

        this.demarcacion = demarcacion;

    }

    public int getDorsal() {
        return dorsal; 
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    @Override
    public String toString() {
        return "Futbolista [id=" + super.id + ", dorsal=" + dorsal + ", nombre=" + super.nombre + ", demarcacion="
                + demarcacion
                + ", apellidos=" + super.apellidos + ", fechaNac=" + super.fechaNac + ", peso=" + super.peso
                + ", altura=" + super.altura + "]";
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

        return (this.peso / (this.altura * 2) >= 22);

    }

}
