package biblioteca;

/**
 * Representa un libro con sus getter y setters
 *
 * @author Hector Gonzalez Mendez - https://github.com/1slander/ED_Practico2eval
 * @version 1.0
 */

public class Libro {
    /**
     * String titulo - titulo del libro
     *
     * String auto - autor del libro
     *
     * int anioPublicacion - año de publicacion
     */
    // TODO: Documentar estos atributos
    private String titulo;
    private String autor;
    private int anioPublicacion;


    // TODO: Documentar este método
    // TODO: Testear este método

    /**
     * Crea una instancia de un libro con unos datos especificos
     *
     * @param titulo
     * @param autor
     * @param anioPublicacion
     */
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // TODO: Documentar este método

    /**
     * Obtiene el auto del libro
     *
     * @return autor
     */
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // TODO: Documentar este método

    /**
     * Obtiene el año de publicacion
     *
     * @return anipPublicacion
     */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
