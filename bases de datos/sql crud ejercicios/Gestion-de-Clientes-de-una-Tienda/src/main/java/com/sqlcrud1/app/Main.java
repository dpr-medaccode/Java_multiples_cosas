package com.sqlcrud1.app;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean main = true;

        Scanner scanner = new Scanner(System.in);

        // DbConn conn = new DbConn("jdbc:mysql://localhost:3306/tienda", "admin",
        // "root");

        System.out.println("Gestión de Clientes");

        do {

            System.out.println("1. Registrar Clientes:");
            System.out.println("2. Listar Clientes:");
            System.out.println("3. Actualizar Clientes:");
            System.out.println("4. Eliminar Clientes:");
            System.out.println("5. Buscar clientes por nombre:");
            System.out.println("6. Salir");
            System.out.print(">>> ");
            int accion = scanner.nextInt();
            scanner.nextLine();

            switch (accion) {
                case 1 /* Registrar Clientes */ -> {

                    System.out.println("Inserte el nombre");
                    System.out.print(">>> ");
                    String nombre = scanner.nextLine();

                    System.out.println("Inserte los apellidos");
                    System.out.print(">>> ");
                    String apellidos = scanner.nextLine();

                    System.out.println("Inserte email");
                    System.out.print(">>> ");
                    String email = scanner.nextLine();

                    System.out.println("Inserte Telefono");
                    System.out.print(">>> ");
                    String telefono = scanner.nextLine();

                    try {

                        DbConn conn = new DbConn("jdbc:mysql://localhost:3306/tienda", "admin",
                                "root");

                        System.out.println(
                                ClienteDAO.insertCliente(conn.getConn(),
                                        new Cliente(-1, nombre, apellidos, email, telefono)));

                    } catch (SQLException e) {

                        System.out.println(
                                "Error al intentar establezer la coneccion con la base de datos: " + e.getMessage());

                    }

                }
                case 2 /* Listar Clientes */ -> {

                    try {

                        DbConn conn = new DbConn("jdbc:mysql://localhost:3306/tienda", "admin",
                                "root");

                        ArrayList<String> clientes = new ArrayList<String>();

                        clientes = ClienteDAO.readAllCliente(conn.getConn());

                        for (String cliente : clientes) {

                            System.out.println(cliente);

                        }

                    } catch (Exception e) {
                        System.out.println(
                                "Error al intentar establezer la coneccion con la base de datos: " + e.getMessage());
                    }

                }
                case 3 /* Actualizar Clientes */ -> {
                    System.out.println("Inserte el id de quien quiera modificar");
                    int id = scanner.nextInt();
                    System.out.print(">>> ");
                    scanner.nextLine();

                    System.out.println("Inserte el nombre");
                    System.out.print(">>> ");
                    String nombre = scanner.nextLine();

                    System.out.println("Inserte los apellidos");
                    System.out.print(">>> ");
                    String apellidos = scanner.nextLine();

                    System.out.println("Inserte email");
                    System.out.print(">>> ");
                    String email = scanner.nextLine();

                    System.out.println("Inserte Telefono");
                    System.out.print(">>> ");
                    String telefono = scanner.nextLine();

                    try {

                        DbConn conn = new DbConn("jdbc:mysql://localhost:3306/tienda", "admin",
                                "root");

                        System.out.println(ClienteDAO.UpdateCliente(conn.getConn(),
                                new Cliente(id, nombre, apellidos, email, telefono)));

                    } catch (Exception e) {

                        System.out.println(
                                "Error al intentar establezer la coneccion con la base de datos: " + e.getMessage());

                    }

                }
                case 4 /* Eliminar Clientes */ -> {

                    System.out.println("Inserte el id de quien quiera eliminar");
                    System.out.print(">>> ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    try {

                        DbConn conn = new DbConn("jdbc:mysql://localhost:3306/tienda", "admin",
                                "root");

                        System.out.println(ClienteDAO.deleteCliente(conn.getConn(), id)); // <- testear

                    } catch (Exception e) {

                        System.out.println(
                                "Error al intentar establezer la coneccion con la base de datos: " + e.getMessage());

                    }

                }
                case 5 /* Buscar clientes por nombre */ -> {

                    System.out.println("Inserte el nombre");
                    System.out.print(">>> ");
                    String nombre = scanner.nextLine();

                    try {

                        DbConn conn = new DbConn("jdbc:mysql://localhost:3306/tienda", "admin",
                                "root");

                        ArrayList<String> clientes = new ArrayList<String>();

                        clientes = ClienteDAO.readNombreCliente(conn.getConn() , nombre);  // <- testear

                        for (String cliente : clientes) {

                            System.out.println(cliente);

                        }

                    } catch (Exception e) {

                        System.out.println(
                                "Error al intentar establezer la coneccion con la base de datos: " + e.getMessage());
                    }

                }
                case 6 /* Salir */ -> {

                    main = false;

                }
                default -> {
                    System.out.println("Error, inserte una operación posible");
                }
            }

        } while (main);

        scanner.close();

       

    }
}
