
public class Persona implements Comparable<Persona> {

    private int edad;

    private String dni;
    
    public Persona(int edad, String dni) {
        this.edad = edad;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona [edad=" + edad + ", dni=" + dni + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dni == null) ? 0 : dni.hashCode());
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
        Persona other = (Persona) obj;
        if (dni == null) {
            if (other.dni != null)
                return false;
        } else if (!dni.equals(other.dni))
            return false;
        return true;
    }

    @Override
    public int compareTo(Persona otro) {
        return Integer.compare(this.edad, otro.edad);
    }

}
