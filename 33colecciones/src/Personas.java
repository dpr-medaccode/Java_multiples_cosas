import java.util.Comparator;

public class Personas implements Comparable<Personas>, Comparator<Personas> {

    private int id;

    private String nombre;

    private String apelidos;

    private int edad;

    public Personas(int id, String nombre, String apelidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apelidos = apelidos;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelidos() {
        return apelidos;
    }

    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((apelidos == null) ? 0 : apelidos.hashCode());
        result = prime * result + edad;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        Personas other = (Personas) obj;

        if (id != other.id)
            return false;

        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;

        if (apelidos == null) {
            if (other.apelidos != null)
                return false;
        } else if (!apelidos.equals(other.apelidos))
            return false;

        if (edad != other.edad)
            return false;
        return true;
    }

   

    @Override
    public String toString() {
        return "Personas [id=" + id + ", nombre=" + nombre + ", apelidos=" + apelidos + ", edad=" + edad + "] \n";
    }

    @Override
    public int compareTo(Personas p) {

        if (p.getId() > this.getId()) {

            return -1;
            
        } else if (p.getId() < this.getId()) {

            return 1;
            
        }

        return 0;
        
    }

    @Override
    public int compare(Personas p1, Personas p2) {

        if (p1.getId() > p2.getId()) {

            return -1;
            
        } else if (p1.getId() < p2.getId()) {

            return 1;
            
        }

        return 0;
       
    }

    

   
}
