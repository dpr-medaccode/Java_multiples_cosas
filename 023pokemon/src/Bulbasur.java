public class Bulbasur extends Pokemon {

    public Bulbasur(String nombre) {

        super(nombre, "Planta");

    }

    public String toString() {

        return "Bulbasur " + super.nombre + " " + super.ps;

    }

    public void curar() {

        super.ps += 50;

    }

}
