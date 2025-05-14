package com.sqlcrud3.app;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PeliculaDAO {

    public static Resultado<Pelicula> insertPelicula(Pelicula pelicula, DbConn conn) {

        try {

            String sql = "INSERT INTO peliculas (titulo, genero, duracion) VALUES (?, ?, ?)";

            PreparedStatement stmt = conn.getConn().prepareStatement(sql);

            stmt.setString(1, pelicula.getTitulo());
            stmt.setString(2, pelicula.getGenero());
            stmt.setInt(3, pelicula.getDuracion());

            stmt.executeUpdate();

            return Resultado.ok("Película insertada correctamente.", pelicula);

        } catch (SQLException e) {
            return Resultado.error("Error en la inserción de la película: " + e.getMessage());
        }

    }

    public static Resultado<ArrayList<Pelicula>> listPeliculas(DbConn conn) {

        try {

            String sql = "SELECT * FROM peliculas";
            ArrayList<Pelicula> peliculas = new ArrayList<>();
            PreparedStatement stmt = conn.getConn().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Pelicula pelicula = new Pelicula(
                        rs.getInt("id_pelicula"),
                        rs.getString("titulo"),
                        rs.getString("genero"),
                        rs.getInt("duracion"));

                peliculas.add(pelicula);
            }

            return Resultado.ok("Peliculas obtenisdas correctamente", peliculas);

        } catch (SQLException e) {
            return Resultado.error("Error al leer la base de datos: " + e.getMessage());
        }

    }

    public static Resultado<Pelicula> listPeliculas(int id, DbConn conn) {
    try {
        String sql = "SELECT * FROM peliculas WHERE id_pelicula = ?";
        PreparedStatement stmt = conn.getConn().prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();

        Pelicula pelicula = null;
        if (rs.next()) {
            int idP = rs.getInt("id_pelicula");
            String titulo = rs.getString("titulo");
            String genero = rs.getString("genero");
            int duracion = rs.getInt("duracion");
            pelicula = new Pelicula(idP, titulo, genero, duracion);
        }

        return Resultado.ok("Película obtenida correctamente", pelicula);

    } catch (SQLException e) {
        return Resultado.error("Error al leer la base de datos: " + e.getMessage());
    }
}

    public static Resultado<Pelicula> updatePelicula(Pelicula pelicula, DbConn conn) {

        try {

            String sql = "UPDATE peliculas SET titulo = ?, genero = ?, duracion = ? WHERE id_pelicula = ?";

            PreparedStatement stmt = conn.getConn().prepareStatement(sql);
            stmt.setString(1, pelicula.getTitulo());
            stmt.setString(2, pelicula.getGenero());
            stmt.setInt(3, pelicula.getDuracion());
            stmt.setInt(4, pelicula.getId());

            int filasActualizadas = stmt.executeUpdate();

            if (filasActualizadas > 0) {

                return Resultado.ok("Película actualizada correctamente.", pelicula);

            }

            return Resultado.ok("No se encontró la película con ID: " + pelicula.getId(), pelicula);

        } catch (SQLException e) {

            return Resultado.error("Error al actualizar la película: " + e.getMessage());

        }

    }

    public static Resultado<Integer> deletePelicula(int id, DbConn conn) {

        try {

            String sql = "DELETE FROM peliculas WHERE id_pelicula = ?";

            PreparedStatement stmt = conn.getConn().prepareStatement(sql);
            stmt.setInt(1, id);

            int filasEliminadas = stmt.executeUpdate();

            if (filasEliminadas > 0) {
                return Resultado.ok("Película eliminada correctamente.", id);
            } else {
                return Resultado.ok("No se encontró una película con ID: " + id, id);
            }

        } catch (SQLException e) {

            return Resultado.error("Error al eliminar la película: " + e.getMessage());

        }

    }

    public static Pelicula findNombrePelicula(ArrayList<Pelicula> peliculas, String nombre) {

        for (Pelicula pelicula : peliculas) {

            if (pelicula.getTitulo().equals(nombre)) {

                return pelicula;

            }
        }

        return null;

    }

}
