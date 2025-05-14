package com.sqlcrud3.app;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SalaDAO {

    public static Resultado<Sala> insertSala(Sala sala, DbConn conn) {
        try {
            String sql = "INSERT INTO salas (nombre, capacidad) VALUES (?, ?)";
            PreparedStatement stmt = conn.getConn().prepareStatement(sql);

            stmt.setString(1, sala.getNombre());
            stmt.setInt(2, sala.getCapacidad());

            stmt.executeUpdate();

            return Resultado.ok("Sala insertada correctamente.", sala);

        } catch (SQLException e) {
            return Resultado.error("Error en la inserción de la sala: " + e.getMessage());
        }
    }

    public static Resultado<ArrayList<Sala>> listSalas(DbConn conn) {
        try {
            String sql = "SELECT * FROM salas";
            ArrayList<Sala> salas = new ArrayList<>();
            PreparedStatement stmt = conn.getConn().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Sala sala = new Sala(
                        rs.getInt("id_sala"),
                        rs.getString("nombre"),
                        rs.getInt("capacidad"));
                salas.add(sala);
            }

            return Resultado.ok("Salas obtenisdas correctamente", salas);

        } catch (SQLException e) {
            return Resultado.error("Error al leer las salas: " + e.getMessage());
        }
    }

    public static Resultado<Sala> listSalas(DbConn conn, int id) {
        try {
            String sql = "SELECT * FROM salas WHERE id_sala = ?";
            PreparedStatement stmt = conn.getConn().prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            Sala sala = null;
            if (rs.next()) {
                int idS = rs.getInt("id_sala");
                String nombre = rs.getString("nombre");
                int capacidad = rs.getInt("capacidad");
                sala = new Sala(idS, nombre, capacidad);
            }

            return Resultado.ok("Sala obtenida correctamente", sala);

        } catch (SQLException e) {
            return Resultado.error("Error al leer las salas: " + e.getMessage());
        }
    }

    public static Resultado<Sala> updateSala(Sala sala, DbConn conn) {
        try {
            String sql = "UPDATE salas SET nombre = ?, capacidad = ? WHERE id_sala = ?";
            PreparedStatement stmt = conn.getConn().prepareStatement(sql);

            stmt.setString(1, sala.getNombre());
            stmt.setInt(2, sala.getCapacidad());
            stmt.setInt(3, sala.getId());

            int filas = stmt.executeUpdate();

            if (filas > 0) {
                return Resultado.ok("Sala actualizada correctamente.", sala);
            }

            return Resultado.ok("No se encontró la sala con ID: " + sala.getId(), sala);

        } catch (SQLException e) {
            return Resultado.error("Error al actualizar la sala: " + e.getMessage());
        }
    }

    public static Resultado<Integer> deleteSala(int id, DbConn conn) {
        try {
            String sql = "DELETE FROM salas WHERE id_sala = ?";
            PreparedStatement stmt = conn.getConn().prepareStatement(sql);
            stmt.setInt(1, id);

            int filas = stmt.executeUpdate();

            if (filas > 0) {
                return Resultado.ok("Sala eliminada correctamente.", id);
            } else {
                return Resultado.ok("No se encontró una sala con ID: " + id, id);
            }

        } catch (SQLException e) {
            return Resultado.error("Error al eliminar la sala: " + e.getMessage());
        }
    }

}
