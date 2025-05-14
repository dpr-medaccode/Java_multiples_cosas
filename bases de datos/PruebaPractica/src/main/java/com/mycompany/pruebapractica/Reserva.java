/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebapractica;


import java.time.LocalDateTime;

/**
 *
 * @author daniel
 */
public class Reserva {

    private String nombre;

    private int pista;

    private LocalDateTime fecha;

    private int duracion;

    public Reserva(String nombre, String pista, LocalDateTime fecha, int duracion) {
        this.nombre = nombre;
        this.pista = Reserva.conversorPista(pista);
        this.fecha = fecha;
        this.duracion = duracion;
    }
    
     public Reserva(String nombre, int pista, LocalDateTime fecha, int duracion) {
        this.nombre = nombre;
        this.pista = pista;
        this.fecha = fecha;
        this.duracion = duracion;
    }

    static public int conversorPista(String pista) {
    try {
        return (int)(pista.charAt(6)-48);
    } catch (NumberFormatException e) {
        return -1;  
    }
}


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPista() {
        return pista;
    }

    public void setPista(int pista) {
        this.pista = pista;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Reserva{" + "nombre=" + nombre + ", pista=" + pista + ", fecha=" + fecha + ", duracion=" + duracion + '}';
    }
    
    

}
