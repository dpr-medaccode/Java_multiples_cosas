package com.sqlcrud2.app;

public class Libro {

    private int id;
    private String titulo;
    private String autor;
    private int annoPublicacion;
    private String genero;
    private boolean disponible;

    public Libro(int id, String titulo, String autor, int annoPublicacion, String genero, boolean disponible) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.annoPublicacion = annoPublicacion;
        this.genero = genero;
        this.disponible = disponible;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnnoPublicacion() {
        return annoPublicacion;
    }

    public void setAnnoPublicacion(int annoPublicacion) {
        this.annoPublicacion = annoPublicacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", annoPublicacion=" + annoPublicacion
                + ", genero=" + genero + ", disponible=" + disponible;
    }

    

    
    
}