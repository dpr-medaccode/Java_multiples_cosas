package com.sqlcrud3.app;

import java.sql.Time; // <- para el uso de JDBC
import java.sql.Date;

public class Reserva {

    private int id;
    private Pelicula pelicula;
    private Sala sala;
    private Date fecha;
    private Time hora;
    private String nombreCliente;
    private int asientosReservados;

    public Reserva(int id, Pelicula pelicula, Sala sala, Date fecha, Time hora, String nombreCliente,
            int asientosReservados) {
        this.id = id;
        this.pelicula = pelicula;
        this.sala = sala;
        this.fecha = fecha;
        this.hora = hora;
        this.nombreCliente = nombreCliente;
        this.asientosReservados = asientosReservados;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getAsientosReservados() {
        return asientosReservados;
    }

    public void setAsientosReservados(int asientosReservados) {
        this.asientosReservados = asientosReservados;
    }

    @Override
    public String toString() {
        return "Reserva [id=" + id + ", pelicula=" + pelicula + ", sala=" + sala + ", fecha=" + fecha + ", hora=" + hora
                + ", nombreCliente=" + nombreCliente + ", asientosReservados=" + asientosReservados + "]";
    }

    

}
