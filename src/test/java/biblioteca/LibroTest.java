package biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibroTest {



    @Test
    void testConstructor(){
        Libro libro = new Libro("El silmarillion","JRR Tolkien",1967);
        assertEquals("El silmarillion",libro.getTitulo());

    }

}