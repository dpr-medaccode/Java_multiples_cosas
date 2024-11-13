public class Charmander extends Pokemon {

    private int multiplicardaño;

    public Charmander(String nombre, int multiplicardaño) {

        super(nombre, "Fuego");

        this.multiplicardaño = multiplicardaño;

    }

    @Override
    public void atacar(Pokemon otro) {

        if (otro instanceof Squirtel) {

            if (!otro.defendiendo) {

                otro.ps -= 100;

            } else {

                otro.ps -= 50;

            }

        } else {

            otro.ps -= (100 * this.multiplicardaño);

        }

    }

    @Override
    public String toString() {

        return "Charmander " + super.nombre + " " + super.ps;

    }

}
