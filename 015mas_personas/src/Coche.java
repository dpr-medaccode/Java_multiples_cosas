public class Coche {

    private String matricula;

    private String marca;

    private String modelo;

    private String color;

    private int velocidadActual;

    private boolean arancado;

    private final static int velmax = 120;

    public Coche(String mat, String mar, String mod, String col) {

        this.matricula = mat;

        this.marca = mar;

        this.modelo = mod;

        this.color = col;

        this.velocidadActual = 0;

        this.arancado = false;

    }

    //////////////////////////////////////////////

    public String toString() {

        return "matricula: " + this.matricula +

                " marca: " + this.marca +

                " modelo: " + this.modelo +

                " color: " + this.color +

                " velocidad actual: " + this.velocidadActual +

                " arancado: " + this.arancado;
    }

    //////////////////////////////////////////////////////

    public boolean arrancar() {

        if (this.velocidadActual == 0 && !this.arancado) {

            this.arancado = true;

            return true;

        }

        return false;

    }

    public boolean parar() {

        if (this.velocidadActual == 0 && this.arancado) {

            this.arancado = false;

            return true;

        }

        return true;

    }

    //////////////////////////////////////////////////////

    public void acelerar(int vel) {

        if (this.arancado) {

            if (this.velocidadActual + vel >= velmax) {

                this.velocidadActual = velmax;

            } else {

                this.velocidadActual += vel;

            }

        }

    }

    public void frenar(int vel) {

        if (this.arancado) {

            if (this.velocidadActual - vel <= 0) {

                this.velocidadActual = 0;

            } else {

                this.velocidadActual -= vel;

            }

        }

    }

    ///////////////////////////////////////////////////

   

}
