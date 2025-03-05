import biblioteca.Biblioteca;
import biblioteca.Libro;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {

    private Biblioteca biblioteca;
    private Libro libro1;
    private Libro libro2;
    private Libro libro3;

    @BeforeEach
    void setUp() {
        biblioteca = new biblioteca.Biblioteca();
        libro1=new biblioteca.Libro("Harry Potter 1", "JK ROWLING",1999);
        libro2=new biblioteca.Libro("Metamorfosis", "Kafka",1899);
        libro3=new biblioteca.Libro("Tintin", "Herge",1929);
    }

    @Test
    void agregarLibro() {
        assertTrue(biblioteca.agregarLibro(libro1));
        assertEquals(1,biblioteca.getLibros().size());
    }

    @Test
    void eliminarLibro() {
        biblioteca.agregarLibro(libro2);
        assertTrue(biblioteca.eliminarLibro(libro2));
        assertEquals(0,biblioteca.getLibros().size());
    }

    /**
     * Test 01: buscar libro existente y comprobar que lo localiza.
     * Test 02: buscar libro NO existente y comprobar que no lo localiza.
     */

    @Test
    void encuentraLibroPorTitulo() {
       biblioteca.agregarLibro(libro3);
       assertEquals(libro3,biblioteca.encuentraLibroPorTitulo("Tintin"));
       assertNull(biblioteca.encuentraLibrosPorAutor("Tolkien"));


    }

    /**
     * Test 01: Comprobar la lista de libros que devuelve para un autor existente.
     * Test 02: Comprobar la lista de libros que devuelve para un autor NO existente.
     */
    @Test
    void encuentraLibrosPorAutor() {
        biblioteca.agregarLibro(libro1);

        List<Libro> librosEncontrados = biblioteca.encuentraLibrosPorAutor("JK ROWLING");
        List<Libro> librosNoEncontrados = biblioteca.encuentraLibrosPorAutor("Tolkien");

        assertTrue(librosEncontrados.contains(libro1));

        assertNull(librosNoEncontrados);



    }
}