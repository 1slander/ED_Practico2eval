package biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa una Biblioteca con sus getter y setters
 *
 * @author Hector Gonzalez Mendez - https://github.com/1slander/ED_Practico2eval
 * @version 2.0
 * @see Libro
 */

public class Biblioteca {

    /**
     * Lista de los libros disponibles en la biblioteca
     */
    // TODO: Documentar estos atributos
    private final List<Libro> libros;

    /**
     * Constructor que inicializa la biblioteca vacia.
     */
    // TODO: Documentar este método
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    // TODO: Documentar este método.
    //  Test: NO HAY QUE TESTEAR ESTE METODO

    /**
     * Constructor que inicializa la biblioteca con una lista de libros
     * @param libros lista inicial
     */
    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }

    // TODO: Testear este metodo.
    //  Test: Comprobar si se ha agregado

    /**
     * Agrega un libro a la biblioteca
     *
     * @param libro
     * @return true si el libro se agregro, false en caso contrario
     */
    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }

    // TODO: Testear este metodo.
    //  Test: comprobar si se ha eliminado

    /**
     *  Elimina un libro de la biblioteca
     *
     * @param libro
     * @return true si se elimino, false en caso contrario
     */
    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }

    /**
     * Obtiene lista de libros
     *
     * @return lista de libros
     */
    // TODO: Documentar este método
    public List<Libro> getLibros() {
        return libros;
    }

    // TODO: Documentar este método.
    //  Test 01: buscar libro existente y comprobar que lo localiza.
    //  Test 02: buscar libro NO existente y comprobar que no lo localiza.

    /**
     * Busca un libro por su titulo
     * @param titulo
     * @return el libro encontrado o null si no existe
     */
    public Libro encuentraLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    // TODO: Documentar este metodo.
    //  No testearlo
    // Este metodo está obsoleto. Hay que documentarlo como tal.
    //  Recuerda: las anotaciones @deprecated y @link a la nueva
    //  versión mejorada encuentraLibrosPorAutor(...)
    //  En esta ocasión, NO TESTEAREMOS este metodo

    /**
     * @deprecated  Este metodo esta obsoleto. Se recomienda usar {@link #encuentraLibrosPorAutor(String)}
     *
     * Busca libro por autor
     * @param autor
     * @return primer libro econtrado o null si no existe
     */
    public Libro encuentaLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }

    // TODO: Documentar este metodo
    // Este metodo sustituye al metodo anterior. Está disponible desde la
    //  versión 2.0. Hay que documentarlo teniéndolo en cuenta.
    // TODO: Testear este metodo.
    //  Test: Comprobar la lista de libros que devuelve para un autor existentes.
    //  Test: Comprobar la lista de libros que devuelve para un autor No existente

    /**
     * Busca libros por autor especifico
     * Disponible desde la version 2.0
     *
     * @param autor
     * @return Lista de libros de autor especifico o null si no hay coincidencias.
     */
    public List<Libro> encuentraLibrosPorAutor(String autor) {
        List<Libro> listaLibros = null;
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                if (listaLibros == null) {
                    listaLibros = new ArrayList<>();
                }
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }
}
