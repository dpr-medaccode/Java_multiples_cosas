public class Charmander extends Pokemon {

    private int multiplicardaño;

    public Charmander(String nombre, String tipo, int ps, int multiplicardaño){

        super(nombre, tipo);

        this.multiplicardaño=multiplicardaño;

    }

    public void atacar(Pokemon otro){

        otro.ps = otro.ps-(100*this.multiplicardaño);

    }

}
