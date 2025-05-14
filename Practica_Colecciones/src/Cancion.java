// Clase que representa una canción individual
class Cancion {
    private int id;              
    private String titulo;       
    private String artista;     
    private int duracion;      

    // Constructor que inicializa todos los atributos
    public Cancion(int id, String titulo, String artista, int duracion) {
        this.id = id;
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
    }

    // Métodos getter para acceder a los atributos (no hay setters porque no se modifican)
    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public int getDuracion() {
        return duracion;
    }

    // Devuelve una representación en texto de la canción
    @Override
    public String toString() {
        return "[" + id + "] " + titulo + " - " + artista + " (" + duracion + "s)";
    }
}
