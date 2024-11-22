public class Autobus extends Vehiculo {

    private int precioKilometro;

    private int cantidadKilometros;

    private int kilometrosAcumulados;

    public Autobus(String matricula, int precio) {

        super(matricula);

        this.precioKilometro = precio;

    }

    public Autobus(Autobus a) {

        super((Vehiculo) a);

        this.precioKilometro = a.precioKilometro;

    }

    public int getPrecioKilometro() {
        return precioKilometro;
    }

    public void setPrecioKilometro(int precioKilometro) {
        this.precioKilometro = precioKilometro;
    }

    public int getCantidadKilometros() {
        return cantidadKilometros;
    }

    public void setCantidadKilometros(int cantidadKilometros) {
        this.cantidadKilometros = cantidadKilometros;
    }

    public int getKilometrosAcumulados() {
        return kilometrosAcumulados;
    }

    public void setKilometrosAcumulados(int kilometrosAcumulados) {
        this.kilometrosAcumulados = kilometrosAcumulados;
    }

    @Override
    public String toString() {
        return "Autobus [matricula=" + matricula + ", precioKilometro=" + precioKilometro + ", disponible=" + disponible
                + ", cantidadKilometros=" + cantidadKilometros + "]";
    }

    public boolean paseoAutobus() {

        if (!super.disponible) {

            this.cantidadKilometros += 10;

            this.kilometrosAcumulados += 10;

            return true;

        } else {

            return false;

        }

    }

    public int desAlquilar() {

        if (!super.disponible) {

            int val = 0;

            val = cantidadKilometros;

            cantidadKilometros = 0;

            return val * precioKilometro;

        } else {

            return 0;

        }

    }

}
