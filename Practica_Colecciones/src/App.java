import java.util.*;

// Clase principal con el método main
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   // Para leer datos del usuario
        Playlist gestor = new Playlist();      // Crea el gestor de playlist
        boolean salir = false;                 // Controla la salida del programa

        // Bucle principal del menú
        while (!salir) {
            // Menú de opciones
            System.out.println("\n--- Menú ---");
            System.out.println("1. Agregar canción");
            System.out.println("2. Mostrar playlist");
            System.out.println("3. Enviar canción a la cola de reproducción (por ID)");
            System.out.println("4. Mostrar cola de reproducción");
            System.out.println("5. Reproducir siguiente canción");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");

            int opcion = sc.nextInt();  // Lee la opción del usuario
            sc.nextLine();              // Limpia el buffer

            // Selección de opción mediante switch
            switch (opcion) {
                case 1:
                    // Solicita los datos de la canción
                    System.out.print("ID de la canción: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Artista: ");
                    String artista = sc.nextLine();
                    System.out.print("Duración (segundos): ");
                    int duracion = sc.nextInt();
                    sc.nextLine();

                    // Crea y agrega la canción
                    gestor.agregarCancion(new Cancion(id, titulo, artista, duracion));
                    break;

                case 2:
                    // Muestra la playlist completa
                    gestor.mostrarPlaylist();
                    break;

                case 3:
                    // Pide el ID y envía la canción a la cola
                    System.out.print("Introduce el ID de la canción: ");
                    int idCola = sc.nextInt();
                    sc.nextLine();
                    gestor.enviarAColaPorId(idCola);
                    break;

                case 4:
                    // Muestra la cola de reproducción
                    gestor.mostrarCola();
                    break;

                case 5:
                    // Reproduce la siguiente canción en la cola
                    gestor.reproducirSiguiente();
                    break;

                case 6:
                    // Sale del programa
                    salir = true;
                    break;

                default:
                    // Opción no válida
                    System.out.println("Opción no válida.");
            }
        }

        sc.close(); // Cierra el scanner
        System.out.println("Programa terminado.");
    }
}
