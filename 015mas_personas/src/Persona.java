public class Persona {

    public String nombre; 

    private int edad;

    public Persona (int e, String n){

        this.edad = e;

        this.nombre = n;

    }

    ////////////////////////////////////////

    public String getNobre(){

        return this.nombre;

    }

    public int getEdad(){

        return this.edad;

    }

    ////////////////////////////////////////

    public void setNombre(String nom){

        this.nombre = nom;

    }

    public void setEdad(int ed){

        this.edad = ed;

    }

    ////////////////////////////////////////

    public String toString() {

        return "Edad: " + this.edad;

    }
    
    
}
