public class Dni {

    private String numeros;

    private char letra;

    public Dni(String num, char let) {

        this.numeros = num;

        this.letra = let;

    }

    public Dni(String num) {

        this.numeros = num;

        this.letra = calcularLetra();

    }

    ///////////////////////////////////////////////////////

    public String toString() {

        return this.numeros +
                this.letra;

    }

    ///////////////////////////////////////////////////////

    public char getLetra() {

        return this.letra;

    }

    public String getNumeros() {

        return this.numeros;

    }

    ///////////////////////////////////////////////////////

    public void setDni(char ddd) {

        this.letra = ddd;

    }

    public void setNumeros(String numn) {

        this.numeros = numn;

    }

    ///////////////////////////////////////////////////////

    public char calcularLetra() {

        char[] Letras = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
                'L', 'C', 'K', 'E' };

        int numerosInt = Integer.parseInt(this.numeros);

        int resto = numerosInt % 23;

        this.letra = Letras[resto];

        return letra;

    }
}
