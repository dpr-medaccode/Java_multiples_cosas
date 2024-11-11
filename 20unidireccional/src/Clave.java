public class Clave {

    private int codigo;

    

    public Clave(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Clave [codigo=" + codigo + "]";
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
    
}
