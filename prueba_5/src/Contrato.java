public class Contrato {

    private int salario;

    private boolean jornada;

    private String clausulas;

    public Contrato(int salario, boolean jornada, String clausulas) {

        if (salario < 0) {

            this.salario = 0;

        } else {

            this.salario = salario;

        }

        this.jornada = jornada;

        if (clausulas.length() < 0 || clausulas.length() > 500 ) {

            this.clausulas = "";
            
        } else {

            this.clausulas = clausulas;

        }

    }

    public Contrato(){

        this.salario = 0;
        this.jornada = false;
        this.clausulas = "";

    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {

        if (this.salario < 0) {

        } else {

            this.salario = salario;

        }
        
    }

    public boolean isJornada() {
        return jornada;
    }

    public void setJornada(boolean jornada) {
        
        this.jornada = jornada;
    }

    public String getClausulas() {
        return clausulas;
    }

    public void setClausulas(String clausulas) {

        if (this.clausulas.length() < 0 && this.clausulas.length() > 500 ) {
            
        } else {

            this.clausulas = clausulas;

        }

    }

    @Override
    public String toString() {
        return "salario = " + salario + ", jornada Completa = " + jornada + ", Clausulas = " + clausulas;
    }

    

}
