import java.util.*;

// Clase que gestiona la playlist y la cola de reproducción
class Playlist {
    private ArrayList<Cancion> playlist;               // Lista principal de canciones
    private LinkedList<Cancion> colaReproduccion;      // Cola para reproducir canciones en orden
    private HashMap<Integer, Cancion> cancionesPorId;  // Mapa para buscar canciones por ID
    // private HashSet<String> titulosCanciones = new HashSet<>();

    // Constructor que inicializa las estructuras
    public Playlist() {
        playlist = new ArrayList<>();
        colaReproduccion = new LinkedList<>();
        cancionesPorId = new HashMap<>();
    }

    // Añade una canción si su ID no está repetido
    public void agregarCancion(Cancion cancion) {
        if (cancionesPorId.containsKey(cancion.getId())) {
            System.out.println("Ya existe una canción con ese ID.");
        } else {
            playlist.add(cancion);
            cancionesPorId.put(cancion.getId(), cancion);
            System.out.println("Canción añadida a la playlist.");
        }
    }
    
    // Añade una canción si su título no está repetido 
    // public void agregarCancion(Cancion cancion) {
    //     String titulo = cancion.getTitulo().toLowerCase();
    
    //     if (titulosCanciones.contains(titulo)) {
    //         System.out.println("Ya existe una canción con ese título.");
    //     } else {
    //         playlist.add(cancion);
    //         titulosCanciones.add(titulo);
    //         System.out.println("Canción añadida a la playlist.");
    //     }
    // }

    // Muestra todas las canciones de la playlist
    public void mostrarPlaylist() {
        if (playlist.isEmpty()) {
            System.out.println("La playlist está vacía.");
            return;
        }
        System.out.println("--- Playlist ---");
        for (Cancion c : playlist) {
            System.out.println(c);
        }
    }

    // Añade a la cola una canción según su ID
    public void enviarAColaPorId(int id) {
        if (!cancionesPorId.containsKey(id)) {
            System.out.println("ID no encontrado en la playlist.");
            return;
        }
        Cancion c = cancionesPorId.get(id);
        colaReproduccion.addLast(c); // Se añade al final de la cola
        System.out.println("Canción añadida a la cola de reproducción.");
    }

    // Reproduce la primera canción de la cola
    public void reproducirSiguiente() {
        if (colaReproduccion.isEmpty()) {
            System.out.println("La cola de reproducción está vacía.");
            return;
        }
        Cancion siguiente = colaReproduccion.removeFirst();
        System.out.println("Reproduciendo: " + siguiente);
    }

    // Muestra todas las canciones en la cola de reproducción
    public void mostrarCola() {
        if (colaReproduccion.isEmpty()) {
            System.out.println("Cola vacía.");
            return;
        }
        System.out.println("--- Cola de Reproducción ---");
        for (Cancion c : colaReproduccion) {
            System.out.println(c);
        }
    }

    // Método para agregar una canción, reemplazando si ya existe
    // public void agregarCancion(Cancion cancion) {
    //     int id = cancion.getId();
    
    //     // Si ya existe una canción con ese ID
    //     if (cancionesPorId.containsKey(id)) {
    //         System.out.println("Ya existía una canción con ese ID. Se ha reemplazado.");
    
    //         // Reemplaza en el HashMap
    //         cancionesPorId.put(id, cancion);
    
    //         // También reemplaza en la lista
    //         for (int i = 0; i < playlist.size(); i++) {
    //             if (playlist.get(i).getId() == id) {
    //                 playlist.set(i, cancion); // Reemplaza en la misma posición
    //                 break;
    //             }
    //         }
    //     } else {
    //         // Si no existía, simplemente se añade
    //         playlist.add(cancion);
    //         cancionesPorId.put(id, cancion);
    //         System.out.println("Canción añadida a la playlist.");
    //     }
    // }
}
