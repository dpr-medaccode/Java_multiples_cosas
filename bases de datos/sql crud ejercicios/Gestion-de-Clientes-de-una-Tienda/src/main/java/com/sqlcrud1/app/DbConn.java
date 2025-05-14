package com.sqlcrud1.app;

import java.sql.*;

public class DbConn {

    private Connection conn;

    private String url;
    private String user;
    private String contra;

    private ConnState actualState;

    public DbConn(String url, String user, String contra) throws SQLException {

        this.url = url;
        this.user = user;
        this.contra = contra;

        this.conn = DriverManager.getConnection(url, user, contra);

        this.actualState = ConnState.ON;

    }

    public DbConn() {

        this.actualState = ConnState.hardOFF;

    }

    public boolean hardOff() throws SQLException {

        if (conn == null) {

            return false;

        }

        conn.close();

        conn = null;

        this.url = null;
        this.user = null;
        this.contra = null;

        this.actualState = ConnState.hardOFF;
        ;

        return true;

    }

    public boolean softOff() throws SQLException {

        if (conn == null) {

            return false;

        }

        conn.close();

        conn = null;

        this.actualState = ConnState.softOFF;

        return true;
    }

    public boolean hardOn(String url, String user, String contra) throws SQLException {

        if (conn != null) {

            return false;

        }

        this.url = url;
        this.user = user;
        this.contra = contra;

        this.conn = DriverManager.getConnection(url, user, contra);

        this.actualState = ConnState.ON;

        return true;

    }

    public boolean softOn() throws SQLException {

        if (conn != null || url == null || user == null || contra == null) {

            return false;

        }

        this.conn = DriverManager.getConnection(this.url, this.user, this.contra);

        this.actualState = ConnState.ON;

        return true;

    }

    public ConnState getActualState() {
        return actualState;
    }

    public Connection getConn() {
        return conn;
    }

}
