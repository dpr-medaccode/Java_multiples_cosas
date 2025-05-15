package com.sqlcrud3.app;

import java.sql.*;
import java.util.ArrayList;

public class ReservaDAO {

    public static Resultado<Reserva> insertReserva(Reserva reserva, DbConn conn) {
        try {

            String sqlPeli = "SELECT * FROM peliculas WHERE id_pelicula = ?";
            PreparedStatement stmtPeli = conn.getConn().prepareStatement(sqlPeli);
            stmtPeli.setInt(1, reserva.getPelicula().getId());
            ResultSet rsPeli = stmtPeli.executeQuery();

            if (!rsPeli.next()) {
                return Resultado.error("No se encontró la película con ID: " + reserva.getPelicula().getId());
            }

            String sqlSala = "SELECT * FROM salas WHERE id_sala = ?";
            PreparedStatement stmtSala = conn.getConn().prepareStatement(sqlSala);
            stmtSala.setInt(1, reserva.getSala().getId());
            ResultSet rsSala = stmtSala.executeQuery();

            if (!rsSala.next()) {
                return Resultado.error("No se encontró la sala con ID: " + reserva.getSala().getId());
            }

            String sql = "INSERT INTO reservas (id_pelicula, id_sala, fecha, hora, nombre_cliente, asientos_reservados) "
                    +
                    "VALUES (?, ?, ?, ?, ?, ?)";

            PreparedStatement stmt = conn.getConn().prepareStatement(sql);

            stmt.setInt(1, reserva.getPelicula().getId());
            stmt.setInt(2, reserva.getSala().getId());
            stmt.setDate(3, reserva.getFecha());
            stmt.setTime(4, reserva.getHora());
            stmt.setString(5, reserva.getNombreCliente());
            stmt.setInt(6, reserva.getAsientosReservados());

            stmt.executeUpdate();

            return Resultado.ok("Reserva insertada correctamente.", reserva);

        } catch (SQLException e) {
            return Resultado.error("Error en la inserción de la reserva: " + e.getMessage());
        }
    }

    public static Resultado<ArrayList<Reserva>> listReservas(DbConn conn) {
        ArrayList<Reserva> reservas = new ArrayList<>();
        try {
            String sql = "SELECT * FROM reservas";
            PreparedStatement stmt = conn.getConn().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                // Crear objetos Reserva desde los resultados de la consulta
                int id = rs.getInt("id_reserva");
                int idPelicula = rs.getInt("id_pelicula");
                int idSala = rs.getInt("id_sala");
                java.sql.Date fecha = rs.getDate("fecha");
                java.sql.Time hora = rs.getTime("hora");
                String nombreCliente = rs.getString("nombre_cliente");
                int asientosReservados = rs.getInt("asientos_reservados");

                Pelicula pelicula = PeliculaDAO.listPeliculas(idPelicula, conn).getDatos();

                Sala sala = SalaDAO.listSalas(conn, idSala).getDatos();

                // Agregar la reserva al ArrayList
                Reserva reserva = new Reserva(id, pelicula, sala, fecha, hora, nombreCliente, asientosReservados);
                reservas.add(reserva);
            }

            return Resultado.ok("Reservas obtenidas correctamente.", reservas);

        } catch (SQLException e) {
            return Resultado.error("Error al obtener las reservas: " + e.getMessage());
        }
    }

    public static Resultado<Reserva> updateReserva(Reserva reserva, DbConn conn) {
        try {
            String sql = "UPDATE reservas SET id_pelicula = ?, id_sala = ?, fecha = ?, hora = ?, nombre_cliente = ?, asientos_reservados = ? WHERE id_reserva = ?";
            PreparedStatement stmt = conn.getConn().prepareStatement(sql);

            stmt.setInt(1, reserva.getPelicula().getId());
            stmt.setInt(2, reserva.getSala().getId());
            stmt.setDate(3, reserva.getFecha());
            stmt.setTime(4, reserva.getHora());
            stmt.setString(5, reserva.getNombreCliente());
            stmt.setInt(6, reserva.getAsientosReservados());
            stmt.setInt(7, reserva.getId());

            int rows = stmt.executeUpdate();

            if (rows == 0) {
                return Resultado.error("No se encontró ninguna reserva con ID: " + reserva.getId());
            }

            return Resultado.ok("Reserva actualizada correctamente.", reserva);

        } catch (SQLException e) {
            return Resultado.error("Error al actualizar la reserva: " + e.getMessage());
        }
    }

    public static Resultado<Reserva> deleteReserva(int id, DbConn conn) {
        try {
            String sql = "DELETE FROM reservas WHERE id_reserva = ?";
            PreparedStatement stmt = conn.getConn().prepareStatement(sql);
            stmt.setInt(1, id);

            int rows = stmt.executeUpdate();

            if (rows == 0) {
                return Resultado.error("No se encontró ninguna reserva con ID: " + id);
            }

            return Resultado.ok("Reserva eliminada correctamente.", null);

        } catch (SQLException e) {
            return Resultado.error("Error al eliminar la reserva: " + e.getMessage());
        }

    }

    public static Resultado<ArrayList<Reserva>> buscarReservasPorTitulo(String titulo, DbConn conn) {
        ArrayList<Reserva> reservas = new ArrayList<>();

        try {
            String sql = """
                        SELECT r.* FROM reservas r
                        INNER JOIN peliculas p ON r.id_pelicula = p.id_pelicula
                        WHERE p.titulo = ?
                    """;

            PreparedStatement stmt = conn.getConn().prepareStatement(sql);
            stmt.setString(1, titulo);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id_reserva");
                int idPelicula = rs.getInt("id_pelicula");
                int idSala = rs.getInt("id_sala");
                Date fecha = rs.getDate("fecha");
                Time hora = rs.getTime("hora");
                String nombreCliente = rs.getString("nombre_cliente");
                int asientos = rs.getInt("asientos_reservados");

                Pelicula pelicula = PeliculaDAO.listPeliculas(idPelicula, conn).getDatos();
                Sala sala = SalaDAO.listSalas(conn, idSala).getDatos();

                reservas.add(new Reserva(id, pelicula, sala, fecha, hora, nombreCliente, asientos));
            }

            return Resultado.ok("Reservas encontradas.", reservas);

        } catch (SQLException e) {
            return Resultado.error("Error al buscar reservas por título: " + e.getMessage());
        }
    }
}
