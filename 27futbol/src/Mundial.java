import java.util.ArrayList;

public class Mundial {

    private int id;

    private int anno;

    private ArrayList<SeleccionFutbol> selecciones;

    public Mundial(int id, int anno) {
        this.id = id;
        this.anno = anno;
        this.selecciones = new ArrayList<SeleccionFutbol>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    @Override
    public String toString() {
        return "Mundial [id=" + id + ", anno=" + anno + ", selecciones=" + selecciones + "]";
    }

    public boolean addSeleccion(int id, String nombre) {

        this.selecciones.add(new SeleccionFutbol(id, nombre));

        return true;

    }

    public boolean removeSeleccion(int id) {

        for (int i = 0; i < this.selecciones.size(); i++) {

            if (id == this.selecciones.get(i).getId()) {

                this.selecciones.remove(i);

                return true;

            }

        }

        return false;

    }

    public SeleccionFutbol getSeleccion(int id) {

        for (int i = 0; i < this.selecciones.size(); i++) {

            if (id == this.selecciones.get(i).getId()) {

                return this.selecciones.get(i);

            }

        }

        return null;

    }

    public void listSeleccion() {

        for (int i = 0; i < this.selecciones.size(); i++) {

            System.out.println(this.selecciones.get(i));

        }

    }

}
