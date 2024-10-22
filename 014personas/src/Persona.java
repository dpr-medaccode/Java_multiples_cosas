public class Persona {

    private int edad;

    public Persona(int edad) {

        this.edad = edad;

    }

    public String toString() {

        return "Edad: " + this.edad;

    }

    public void setedad(int e) {

        if (e>= 0 && e <= 120) {

            this.edad = e;

        }

    }

}
