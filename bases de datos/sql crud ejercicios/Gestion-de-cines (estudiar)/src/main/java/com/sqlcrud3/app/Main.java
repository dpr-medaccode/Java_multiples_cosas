package com.sqlcrud3.app;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean main = true;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Gestión de cines");

        do {

            System.out.println("1. Registrar una nueva pelicula.");
            System.out.println("2. Listar todas las películas.");
            System.out.println("3. Registrar una nueva sala.");
            System.out.println("4. Listar todas las salas.");
            System.out.println("5. Registrar una nueva reserva.");
            System.out.println("6. Listar todas las reservas.");
            System.out.println("7. Buscar reservas por título de pelicula.");
            System.out.println("8. Salir de la aplicacion.");

            System.out.print(">>> ");
            int accion = scanner.nextInt();
            scanner.nextLine();

            switch (accion) {

                case /* Registrar una nueva pelicula */ 1 -> {

                    System.out.println("Inserte el titulo");
                    System.out.print(">>> ");
                    String titulo = scanner.nextLine();

                    System.out.println("Inserte el genero");
                    System.out.print(">>> ");
                    String genero = scanner.nextLine();

                    System.out.println("Inserte duracion");
                    System.out.print(">>> ");
                    int duracion = scanner.nextInt();
                    scanner.nextLine();

                    try {

                        System.out.println(PeliculaDAO.insertPelicula(new Pelicula(-1, titulo, genero, duracion),
                                new DbConn("jdbc:mysql://localhost:3306/cine", "admin", "root")).getMensaje());

                    } catch (SQLException e) {

                        System.out.println("Error al conectar la base de datos:" + e.getMessage());

                    }

                }

                case /* Listar todas las películas */ 2 -> {

                    try {

                        for (Pelicula pelicula : PeliculaDAO
                                .listPeliculas(new DbConn("jdbc:mysql://localhost:3306/cine", "admin", "root"))
                                .getDatos()) {

                            System.out.println(pelicula.toString());

                        }

                    } catch (SQLException e) {
                        System.out.println("Error al conectar la base de datos:" + e.getMessage());
                    }

                }

                case /* Registrar una nueva sala */ 3 -> {

                    System.out.println("Inserte el nombre");
                    System.out.print(">>> ");
                    String nombre = scanner.nextLine();

                    System.out.println("Inserte capacidad");
                    System.out.print(">>> ");
                    int capacidad = scanner.nextInt();
                    scanner.nextLine();

                    try {

                        System.out
                                .println(SalaDAO
                                        .insertSala(new Sala(-1, nombre, capacidad),
                                                new DbConn("jdbc:mysql://localhost:3306/cine", "admin", "root"))
                                        .getMensaje());

                    } catch (SQLException e) {

                        System.out.println("Error al conectar la base de datos:" + e.getMessage());

                    }

                }

                case /* Listar todas las salas */ 4 -> {

                    try {

                        for (Sala sala : SalaDAO
                                .listSalas(new DbConn("jdbc:mysql://localhost:3306/cine", "admin", "root"))
                                .getDatos()) {

                            System.out.println(sala.toString());

                        }

                    } catch (SQLException e) {
                        System.out.println("Error al conectar la base de datos:" + e.getMessage());
                    }

                }

                case /* Registrar una nueva reserva */ 5 -> {

                    System.out.println("Inserte id pelicula");
                    System.out.print(">>> ");
                    int idp = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Inserte id sala");
                    System.out.print(">>> ");
                    int ids = scanner.nextInt();
                    scanner.nextLine();

                    Pelicula pelicula = new Pelicula(idp, null, null, -1);

                    Sala sala = new Sala(ids, null, -1);

                    System.out.println("Inserte la fecha (formato YYYY-MM-DD)");
                    System.out.print(">>> ");
                    String fechaStr = scanner.nextLine();
                    Date fecha = Date.valueOf(fechaStr);

                    System.out.println("Inserte la hora (formato HH:MM:SS)");
                    System.out.print(">>> ");
                    String horaStr = scanner.nextLine();
                    Time hora = Time.valueOf(horaStr);

                    System.out.println("Inserte el nombre del cliente");
                    System.out.print(">>> ");
                    String nombreCliente = scanner.nextLine();

                    // Asientos
                    System.out.println("Inserte la cantidad de asientos");
                    System.out.print(">>> ");
                    int asientos = scanner.nextInt();
                    scanner.nextLine();

                    Reserva reserva = new Reserva(-1, pelicula, sala, fecha, hora, nombreCliente, asientos);

                    try {

                        System.out.println(ReservaDAO
                                .insertReserva(reserva, new DbConn("jdbc:mysql://localhost:3306/cine", "admin", "root"))
                                .getMensaje());

                    } catch (SQLException e) {
                        System.out.println("Error al conectar la base de datos:" + e.getMessage());
                    }

                }

                case /* Listar todas las reservas */ 6 -> {

                    try {

                        for (Reserva reserva : ReservaDAO
                                .listReservas(new DbConn("jdbc:mysql://localhost:3306/cine", "admin", "root"))
                                .getDatos()) {

                            System.out.println(reserva.toString());
                        }

                    } catch (SQLException e) {
                        System.out.println("Error al conectar la base de datos:" + e.getMessage());
                    }

                }

                case /* Buscar reservas por título de pelicula */ 7 -> {

                    System.out.println("Ingrese el título de la película para buscar reservas:");
                    System.out.print(">>> ");
                    String titulo = scanner.nextLine();

                    try {
                        Resultado<ArrayList<Reserva>> resultado = ReservaDAO
                                .buscarReservasPorTitulo(titulo,
                                        new DbConn("jdbc:mysql://localhost:3306/cine", "admin", "root"));

                        if (!resultado.getDatos().isEmpty()) {
                            for (Reserva r : resultado.getDatos()) {
                                System.out.println(r.toString());
                            }
                        } else {
                            System.out.println("No se encontraron reservas para ese título.");
                        }

                    } catch (SQLException e) {
                        System.out.println("Error al buscar reservas: " + e.getMessage());
                    }

                    
                }

                case 8 /* Salir de la aplicacion */ -> {

                    main = false;

                }

                default -> {

                }
            }

        } while (main);

        scanner.close();

    }
}
