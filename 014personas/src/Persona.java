public class Persona {

    private int edad;

    public Persona(int edad) {

        if (validaredad(edad) == true) {

            this.edad = edad;

        }

    }

    public String toString() {

        return "Edad: " + this.edad;

    }

    public void setedad(int e) {

        if (validaredad(e) == true) {

            this.edad = e;

        }

    }

    private boolean validaredad(int ed) {

        if (ed >= 0 && ed <= 120) {

            return true;

        }

        return false;

    }

}
