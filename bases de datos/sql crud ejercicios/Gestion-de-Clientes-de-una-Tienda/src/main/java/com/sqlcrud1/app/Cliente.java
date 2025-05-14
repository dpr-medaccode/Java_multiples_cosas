package com.sqlcrud1.app;

public class Cliente {

    private int id;
    private String nombre;
    private String apellidos;
    private String email;
    private String telefono;

    public Cliente(int id, String nombre, String apellidos, String email, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.telefono = telefono;
    }

    public Cliente(int id, String nombre, String apellidos, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = nombre + "@gmail.com";
        this.telefono = telefono;
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email
                + ", telefono=" + telefono;
    }

    
    
}
