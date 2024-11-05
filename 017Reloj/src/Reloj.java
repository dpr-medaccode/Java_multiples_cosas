public class Reloj {

    private Contador segundos;

    private Contador minutos;

    private Contador horas;

    public Reloj(Contador segundos, Contador minutos, Contador horas) {
        this.segundos = segundos;
        this.minutos = minutos;
        this.horas = horas;
    }

    public Reloj() {

        this.segundos = new Contador(0);
        this.minutos = new Contador(0);
        this.horas = new Contador(0);

    }

    public Contador getSegundos() {
        return segundos;
    }

    public void setSegundos(Contador segundos) {
        this.segundos = segundos;
    }

    public Contador getMinutos() {
        return minutos;
    }

    public void setMinutos(Contador minutos) {
        this.minutos = minutos;
    }

    public Contador getHoras() {
        return horas;
    }

    public void setHoras(Contador horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {

        // return this.horas + " / " + this.minutos + " / " + this.segundos;

        return String.format("%02d", this.horas.getNumero()) + ":" + String.format("%02d", this.minutos.getNumero())
                + ":" + String.format("%02d", this.segundos.getNumero());
    }

    public void incrementar() {

        this.segundos.incrementar();

        if (this.segundos.getNumero() >= 60) {

            this.segundos.setNumero(0);

            this.minutos.incrementar();

        }

        if (this.minutos.getNumero() >= 60) {

            this.minutos.setNumero(0);

            this.horas.incrementar();

        }

        if (this.horas.getNumero() >= 24) {

            this.segundos.setNumero(0);

            this.minutos.setNumero(0);

            this.horas.setNumero(0);

        }

    }

}