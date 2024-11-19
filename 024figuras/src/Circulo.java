public class Circulo extends Figura {

    private double radio;

    public Circulo(String color, double grosor, double radio) {
        super(color, grosor);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo [radio=" + radio + color + grosor + "]";
    }

    public double calcularArea() {

        return (3.14 * (this.radio*this.radio));

    }

}
