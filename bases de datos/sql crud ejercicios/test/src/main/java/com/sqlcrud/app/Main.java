package com.sqlcrud.app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(GestorBiblioteca.main());

        Scanner scanner = new Scanner(System.in);

        boolean main = true;

        do {

            /*
             * registrarLibro(): Permite registrar un nuevo libro.
             * 
             * listarLibros(): Muestra todos los libros registrados.
             * 
             * actualizarLibro(): Permite modificar un libro existente.
             * 
             * eliminarLibro(): Permite eliminar un libro por su ID.
             */

            //

            for (String test : GestorBiblioteca.mostrarMenu()) {

                System.out.println(test);

            }

            System.out.print(">>> ");
            int accion = scanner.nextInt();
            scanner.nextLine();

            switch (accion) {

                case /* registrarLibro */ 1 -> {

                    System.out.println("Inserte el titulo");
                    System.out.print(">>> ");
                    String titulo = scanner.nextLine();

                    System.out.println("Inserte el autor");
                    System.out.print(">>> ");
                    String autor = scanner.nextLine();

                    System.out.println("Inserte el anno de publicacion");
                    System.out.print(">>> ");
                    int annoPublicacion = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Inserte el genero");
                    System.out.print(">>> ");
                    String genero = scanner.nextLine();

                    System.out.println("Inserte si esta disponible (0 = no, 1 = si)");
                    System.out.print(">>> ");
                    int disponibleint = scanner.nextInt();
                    scanner.nextLine();
                    boolean disponible = (disponibleint != 0);

                    Libro libro = new Libro(-1, titulo, autor, annoPublicacion, genero, disponible);

                    System.out.println(GestorBiblioteca.registrarLibro(libro));

                }

                case /* listarLibros */ 2 -> {

                    for (String libro : GestorBiblioteca.listarLibros()) {

                        System.out.println(libro);

                    }

                }

                case /* actualizarLibro */ 3 -> {

                    System.out.println("Inserte el id");
                    System.out.print(">>> ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Inserte el titulo");
                    System.out.print(">>> ");
                    String titulo = scanner.nextLine();

                    System.out.println("Inserte el autor");
                    System.out.print(">>> ");
                    String autor = scanner.nextLine();

                    System.out.println("Inserte el anno de publicacion");
                    System.out.print(">>> ");
                    int annoPublicacion = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Inserte el genero");
                    System.out.print(">>> ");
                    String genero = scanner.nextLine();

                    System.out.println("Inserte si esta disponible (0 = no, 1 = si)");
                    System.out.print(">>> ");
                    int disponibleint = scanner.nextInt();
                    scanner.nextLine();
                    boolean disponible = (disponibleint != 0);

                    Libro libro = new Libro(id, titulo, autor, annoPublicacion, genero, disponible);

                    System.out.println(GestorBiblioteca.actualizarLibro(libro));

                }

                case /* eliminarLibro */ 4 -> {

                    System.out.println("Inserte el id");
                    System.out.print(">>> ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println(GestorBiblioteca.eliminarLibro(id));

                }

                case /* Salir */ 5 -> {

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
