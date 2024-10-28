public class Persona {

    private String nombre;

    private String apellidos;

    private String fechaNac;

    private int edad;

    private Dni dni;

    public Persona(String nom, String ape, String fec, int eda) {

        this.nombre = nom;

        this.apellidos = ape;

        this.fechaNac = fec;

        this.edad = eda;

    }

    /////////////////////////////////////////////////////////

    public String toString() {

        return this.nombre + " " +
                this.apellidos + " " +
                this.fechaNac;

    }

    /////////////////////////////////////////////////////////

    public String getNombre() {

        return this.nombre;

    }

    public String getApellidos() {

        return this.apellidos;

    }

    public int getEdad() {

        return this.edad;

    }

    public String getFechaNac() {

        return this.fechaNac;

    }

    public Dni getDni() {

        return this.dni;

    }

    /////////////////////////////////////////////////////////

    public void setEdad(int eedd) {

        this.edad = eedd;

    }

    public void setNombre(String nomm) {

        this.nombre = nomm;

    }

    public void setApellidos(String appe) {

        this.apellidos = appe;

    }

    public void setFechaNac(String fnac) {

        this.fechaNac = fnac;

    }

    public void setDni ( Dni d) {

        this.dni = d;

    }

    /////////////////////////////////////////////////////////

    
}
