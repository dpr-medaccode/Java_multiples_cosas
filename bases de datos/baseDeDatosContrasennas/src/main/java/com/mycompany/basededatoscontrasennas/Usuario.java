/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basededatoscontrasennas;

/**
 *
 * @author daniel
 */
public class Usuario {
    
    private String servicio;
    
    private String nombre;
    
    private String contrasenna;

    public Usuario(String servicio, String nombre, String contrasenna) {
        this.servicio = servicio;
        this.nombre = nombre;
        this.contrasenna = contrasenna;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }
    
    
    
}
