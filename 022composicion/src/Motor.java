public class Motor {

    private int caballos;

    public Motor(int caballos) {
        this.caballos = caballos;
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    @Override
    public String toString() {
        return "Motor [caballos=" + caballos + "]";
    }

    

}