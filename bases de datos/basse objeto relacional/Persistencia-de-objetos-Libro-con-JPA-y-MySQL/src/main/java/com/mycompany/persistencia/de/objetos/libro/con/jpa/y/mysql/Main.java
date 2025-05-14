package com.mycompany.persistencia.de.objetos.libro.con.jpa.y.mysql;

import javax.persistence.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibroPU");
        EntityManager em = emf.createEntityManager();

        // Crear los libros
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);
        Libro libro2 = new Libro("1984", "George Orwell", 1949);
        Libro libro3 = new Libro("El Aleph", "Jorge Luis Borges", 1945);

        // Iniciar la transacción
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();

            // Verificar si los libros ya existen antes de persistirlos
            persistirSiNoExiste(libro1, em);
            persistirSiNoExiste(libro2, em);
            persistirSiNoExiste(libro3, em);

            tx.commit();

            // Mostrar los libros almacenados
            List<Libro> libros = em.createQuery("SELECT l FROM Libro l", Libro.class).getResultList();
            libros.forEach(libro -> System.out.println(libro.getTitulo() + " - " + libro.getAutor()));
        } catch (Exception e) {
            if (tx.isActive()) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
    }

    // Método para verificar si el libro ya existe
    private static void persistirSiNoExiste(Libro libro, EntityManager em) {
        String jpql = "SELECT l FROM Libro l WHERE l.titulo = :titulo AND l.autor = :autor";
        TypedQuery<Libro> query = em.createQuery(jpql, Libro.class);
        query.setParameter("titulo", libro.getTitulo());
        query.setParameter("autor", libro.getAutor());

        // Si el libro no existe en la base de datos, persistirlo
        if (query.getResultList().isEmpty()) {
            em.persist(libro);
            System.out.println("Libro agregado: " + libro.getTitulo());
        } else {
            System.out.println("El libro ya existe: " + libro.getTitulo());
        }
    }
}