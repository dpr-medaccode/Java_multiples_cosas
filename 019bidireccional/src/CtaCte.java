public class CtaCte {

    private double saldo;

    private Cliente duenno;

    public CtaCte(double saldo, Cliente duenno) {
        this.saldo = saldo;
        this.duenno = duenno;
        duenno.setCuenta(this);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getDuenno() {
        return duenno;
    }

    public void setDuenno(Cliente duenno) {
        this.duenno = duenno;
    }

    @Override
    public String toString() {
        return "CtaCte [saldo=" + saldo + ", duenno=" + "]";
    }

    
    
}
