package com.sqlcrud2.app;

import java.sql.SQLException;
import java.util.ArrayList;

public class GestorBiblioteca {

    private static final String error = "Error al concetar la base de datos: ";

    /*
     * main(): Punto de entrada de la aplicación.
     * 
     * mostrarMenu(): Muestra las opciones del menú al usuario.
     * 
     * registrarLibro(): Permite registrar un nuevo libro.
     * 
     * listarLibros(): Muestra todos los libros registrados.
     * 
     * actualizarLibro(): Permite modificar un libro existente.
     * 
     * eliminarLibro(): Permite eliminar un libro por su ID.
     */

    public static String main() {

        return "Gestión de Libros en una Biblioteca";

    }

    public static ArrayList<String> mostrarMenu() {

        ArrayList<String> menu = new ArrayList<String>();

        menu.add("1. Registrar Libro:");
        menu.add("2. Listar Libros:");
        menu.add("3. Actualizar Libro:");
        menu.add("4. Eliminar Libro:");
        menu.add("5. Salir");

        return menu;

    }

    public static String registrarLibro(Libro libro) {

        try {

            return LibroDAO.insertarLibro(libro, new DbConn("jdbc:mysql://localhost:3306/biblioteca", "admin", "root"));

        } catch (SQLException e) {

            return error + "" + e.getMessage();

        }

    }

    public static ArrayList<String> listarLibros() {

        try {

            return LibroDAO.listarLibros(new DbConn("jdbc:mysql://localhost:3306/biblioteca", "admin", "root"));

        } catch (SQLException e) {

            ArrayList<String> errorAL = new ArrayList<String>();

            errorAL.add(error + "" + e.getMessage());

            return errorAL;

        }

    }

    public static String actualizarLibro(Libro libro) {

        try {

            return LibroDAO.actualizarLibro(libro,
                    new DbConn("jdbc:mysql://localhost:3306/biblioteca", "admin", "root"));

        } catch (SQLException e) {

            return error + "" + e.getMessage();

        }

    }

    public static String eliminarLibro(int id) {

        try {

            return LibroDAO.eliminarLibro(id, new DbConn("jdbc:mysql://localhost:3306/biblioteca", "admin", "root"));

        } catch (SQLException e) {
            return error + "" + e.getMessage();
        }

    }

}
