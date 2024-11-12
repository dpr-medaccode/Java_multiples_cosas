public class Bulbasur extends Pokemon {

    public Bulbasur(String nombre, String tipo) {

        super(nombre, tipo);

    }

    public String toString() {

        return "Bulbasur " + super.ps;

    }

    public void curar() {

        super.ps += 50;

    }

}
