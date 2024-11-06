public class Cuenta {

    private String id;

    private String nombreTitular;

    private double saldo;

    //////////////////////////////////////////////////////////////////////////////////

    public Cuenta(String id, String nombreTitular) {

        this.id = id;

        this.nombreTitular = nombreTitular;
        

    }

    public Cuenta(String id, String nombreTitular, double saldo) {

        this.id = id;

        this.nombreTitular = nombreTitular;

        this.saldo = saldo;

    }

    public Cuenta() {

        this.id = "0000";

        this.nombreTitular = "";

        this.saldo = 0;

    }

    public Cuenta(Cuenta copia) {

        this.id = copia.id;

        this.nombreTitular = copia.nombreTitular;

        this.saldo = copia.saldo;

    }

    //////////////////////////////////////////////////////////////////////////////////

    public String getId() {

        return id;

    }

    public void setId(String id) {

        this.id = id;

    }

    public String getNombreTitular() {

        return nombreTitular;

    }

    public void setNombreTitular(String nombreTitular) {

        this.nombreTitular = nombreTitular;

    }

    public double getSaldo() {

        return saldo;

    }

    public void setSaldo(double saldo) {

        this.saldo = saldo;

    }

    //////////////////////////////////////////////////////////////////////////////////

    @Override

    public String toString() {

        return "Cuenta [id=" + id + ", nombreTitular=" + nombreTitular + ", saldo=" + saldo + "]";

    }

    //////////////////////////////////////////////////////////////////////////////////

    public void sacar(double cantidad) {

        this.saldo = this.saldo - cantidad;

    }

    public void meter(double cantidad) {

        this.saldo = this.saldo + cantidad;

    }

    public void transferir(double cantidad, Cuenta destino) {

        if (this.saldo >= cantidad) {

            this.sacar(cantidad);

            destino.meter(cantidad);

        }

    }

    //////////////////////////////////////////////////////////////////////////////////

}
