package com.sqlcrud3.app;

public class Resultado<T> /* invento interesante */ {

    private boolean exito;
    private String mensaje;
    private T datos;

    public Resultado(boolean exito, String mensaje, T datos) {
        this.exito = exito;
        this.mensaje = mensaje;
        this.datos = datos;
    }

    public boolean isExito() {
        return exito;
    }

    public String getMensaje() {
        return mensaje;
    }

    public T getDatos() {
        return datos;
    }

    public static <T> Resultado<T> ok(String mensaje, T datos) {
        return new Resultado<>(true, mensaje, datos);
    }

    public static <T> Resultado<T> error(String mensaje) {
        return new Resultado<>(false, mensaje, null);
    }

}
