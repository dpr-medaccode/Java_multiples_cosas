import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Tractor extends Vehiculo {

    private int precioDia;

    private LocalDateTime fechaCreacion;

    private LocalDateTime cantidadDias;

    public Tractor(String matricula, int precio) {

        super(matricula);

        this.precioDia = precio;

        this.cantidadDias = LocalDateTime.now();

        this.fechaCreacion = LocalDateTime.now();

    }

    public Tractor(Tractor a) {

        super((Vehiculo) a);

        this.precioDia = a.precioDia;

        this.cantidadDias = a.cantidadDias;

        this.fechaCreacion = a.fechaCreacion;

    }

    public int getPrecioDia() {
        return precioDia;
    }

    public void setPrecioDia(int precioDia) {
        this.precioDia = precioDia;
    }

    public LocalDateTime getCantidadDias() {
        return cantidadDias;
    }

    public void setCantidadDias(LocalDateTime cantidadDias) {
        this.cantidadDias = cantidadDias;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCantidad(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public String toString() {
        return "Tractor [matricula=" + matricula + ", precioDia=" + precioDia + ", disponible=" + disponible
                + ", cantidadDias=" + cantidadDias + "]";
    }

    public boolean paseoTractor() {

        if (!super.disponible) {

            this.cantidadDias = this.cantidadDias.plusDays(3);

            return true;

        } else {

            return false;

        }

    }

    public int desAlquilar() {

        if (!super.disponible) {

            LocalDateTime val = cantidadDias;

            cantidadDias = fechaCreacion;

            int apallo = (int) ChronoUnit.DAYS.between(fechaCreacion, val);

            return apallo * precioDia;

        } else {

            return 0;

        }

    }

}
