public class Cuadrado extends Figura {

    private double lado;

    public Cuadrado() {

        super();

        this.lado = 1;

    }

    public Cuadrado(String color, double grosor, double lado) {
        super(color, grosor);
        this.lado = lado;
    }

    public Cuadrado(Cuadrado c) {

        super((Figura) c);

        this.lado = c.lado;

    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado [lado=" + lado + color + grosor + "]";
    }

    @Override
    public double calcularArea() {

        return this.lado * this.lado;

    }

}
