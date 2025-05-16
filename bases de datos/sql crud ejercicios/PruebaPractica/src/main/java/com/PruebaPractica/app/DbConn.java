package com.PruebaPractica.app;    

import java.sql.*;

public class DbConn {

    private Connection conn;

    private String url;
    private String user;
    private String contra;

    private boolean concetado;

    public DbConn(String url, String user, String contra) throws SQLException {

        this.url = url;
        this.user = user;
        this.contra = contra;

        this.conn = DriverManager.getConnection(url, user, contra);

        this.concetado = true;
    }

    public DbConn() {

        this.concetado = false;

    }

    public boolean conectar(String url, String user, String contra) throws SQLException {

        if (concetado) {

            return false;

        }

        this.url = url;
        this.user = user;
        this.contra = contra;

        this.conn = DriverManager.getConnection(url, user, contra);

        this.concetado = true;

        return true;

    }

    public boolean desconectar(){

         if (!concetado) {

            return false;

        }

        this.url = null;
        this.user = null;
        this.contra = null;

        this.conn = null;

        this.concetado = false;

        return true;


    }

    public Connection getConn() {
        return conn;
    }

    public boolean isConcetado() {
        return concetado;
    }

}
