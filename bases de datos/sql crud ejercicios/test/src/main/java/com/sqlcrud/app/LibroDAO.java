package com.sqlcrud.app;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class LibroDAO {

    /*
     * insertarLibro(Libro libro): Añadir un nuevo libro.
     * 
     * listarLibros(): Mostrar todos los libros.
     * 
     * actualizarLibro(Libro libro): Modificar la información de un libro.
     * 
     * eliminarLibro(int id): Eliminar un libro por su ID.
     */

    public static String insertarLibro(Libro libro, DbConn conn) {

        try {

            String sql = "INSERT INTO libros (titulo, autor, annoPublicacion, genero, disponible) VALUES (?, ?, ?, ?, ?)";

            PreparedStatement stmt = conn.getConn().prepareStatement(sql);

            stmt.setString(1, libro.getTitulo());
            stmt.setString(2, libro.getAutor());
            stmt.setInt(3, libro.getAnnoPublicacion());
            stmt.setString(4, libro.getGenero());
            stmt.setBoolean(5, libro.isDisponible());

            stmt.executeUpdate();

            return "Se ha insertado correctamente";

        } catch (SQLException e) {

            return "Error en la insercion: " + e.getMessage();

        }

    }

    public static ArrayList<String> listarLibros(DbConn conn) {

        try {

            String sql = "SELECT * FROM libros";
            ArrayList<String> libros = new ArrayList<String>();
            PreparedStatement stmt = conn.getConn().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                Libro libro = new Libro(rs.getInt("id"), rs.getString("titulo"), rs.getString("autor"),
                        rs.getInt("annoPublicacion"), rs.getString("genero"), rs.getBoolean("disponible"));

                libros.add(libro.toString());

            }

            return libros;

        } catch (SQLException e) {

            ArrayList<String> error = new ArrayList<String>();

            error.add("Error al leer la base de datos: " + e.getMessage());

            return error;

        }

    }

    public static String actualizarLibro(Libro libro, DbConn conn) {

        try {

            String sql = "UPDATE libros SET titulo = ?, autor = ?, annoPublicacion = ?, genero = ?, disponible = ? WHERE id = ?";

            PreparedStatement stmt = conn.getConn().prepareStatement(sql);
            stmt.setString(1, libro.getTitulo());
            stmt.setString(2, libro.getAutor());
            stmt.setInt(3, libro.getAnnoPublicacion());
            stmt.setString(4, libro.getGenero());
            stmt.setBoolean(5, libro.isDisponible());
            stmt.setInt(6, libro.getId());

            int filasActualizadas = stmt.executeUpdate();

            if (filasActualizadas > 0) {
                return "Libro actualizado correctamente.";
            } else {
                return "No se encontró el Libro con ID: " + libro.getId();
            }

        } catch (SQLException e) {

            return "Error al actualizar el Libro: " + e.getMessage();

        }
    }

    public static String eliminarLibro(int id, DbConn conn) {

        try {

            String sql = "DELETE FROM libros WHERE id = ?";

            PreparedStatement stmt = conn.getConn().prepareStatement(sql);

            stmt.setInt(1, id);
            int filasEliminadas = stmt.executeUpdate();

            if (filasEliminadas > 0) {
                return "Libro eliminado correctamente.";
            } else {
                return "No se encontró un Libro con ID: " + id;
            }

        } catch (SQLException e) {

            return "Error al eliminar el Libro: " + e.getMessage();

        }

    }
}
