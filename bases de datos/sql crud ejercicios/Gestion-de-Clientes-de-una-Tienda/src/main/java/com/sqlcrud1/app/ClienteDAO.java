package com.sqlcrud1.app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClienteDAO {

    public static String insertCliente(Connection conn, Cliente cliente) {

        String sql = "INSERT INTO clientes (nombre, apellidos, email, telefono) VALUES (?, ?, ?, ?)";

        try {

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, cliente.getNombre());
            stmt.setString(2, cliente.getApellidos());
            stmt.setString(3, cliente.getEmail());
            stmt.setString(4, cliente.getTelefono());

            stmt.executeUpdate();

            return "Se ha insertado correctamente";

        } catch (SQLException e) {

            return "Error en la insercion: " + e.getMessage();

        }

    }

    public static ArrayList<String> readNombreCliente(Connection conn, String nombre) {

        String sql = "SELECT * FROM clientes WHERE nombre = ?";

        try {

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nombre);
            ResultSet rs = stmt.executeQuery();

            ArrayList<String> clientes = new ArrayList<String>();

            while (rs.next()) {

                Cliente cliente = new Cliente(rs.getInt("id"), rs.getString("nombre"), rs.getString("apellidos"),
                        rs.getString("email"), rs.getString("telefono"));

                clientes.add(cliente.toString());

            }

            return clientes;

        } catch (SQLException e) {

            ArrayList<String> error = new ArrayList<String>();

            error.add("Error al buscar el cliente por nombre: " + e.getMessage());

            return error;

        }

    }

    public static ArrayList<String> readAllCliente(Connection conn) {

        String sql = "SELECT * FROM clientes";

        try {

            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            ArrayList<String> clientes = new ArrayList<String>();

            while (rs.next()) {

                Cliente cliente = new Cliente(rs.getInt("id"), rs.getString("nombre"), rs.getString("apellidos"),
                        rs.getString("email"), rs.getString("telefono"));

                clientes.add(cliente.toString());

            }

            return clientes;

        } catch (SQLException e) {

            ArrayList<String> error = new ArrayList<String>();
            error.add("Error al leer la base de datos: " + e.getMessage());

            return error;

        }

    }

    public static String UpdateCliente(Connection conn, Cliente cliente) {

        String sql = "UPDATE clientes SET nombre = ?, apellidos = ?, email = ?, telefono = ? WHERE id = ?";

        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, cliente.getNombre());
            stmt.setString(2, cliente.getApellidos());
            stmt.setString(3, cliente.getEmail());
            stmt.setString(4, cliente.getTelefono());
            stmt.setInt(5, cliente.getId());

            int filasActualizadas = stmt.executeUpdate();

            if (filasActualizadas > 0) {
                return "Cliente actualizado correctamente.";
            } else {
                return "No se encontró el cliente con ID: " + cliente.getId();
            }

        } catch (SQLException e) {

            return "Error al actualizar el cliente: " + e.getMessage();

        }

    }

    /*
     * public static void UpdateCliente(Connection conn, int id, String nombre,
     * String apellidos, String email,
     * String telefono) {
     * 
     * }
     */

    public static String deleteCliente(Connection conn, int id) {

        String sql = "DELETE FROM clientes WHERE id = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            int filasEliminadas = stmt.executeUpdate();

            if (filasEliminadas > 0) {
                return "Cliente eliminado correctamente.";
            } else {
                return "No se encontró un cliente con ID: " + id;
            }

        } catch (SQLException e) {
            return "Error al eliminar el cliente: " + e.getMessage();
        }

    }

}