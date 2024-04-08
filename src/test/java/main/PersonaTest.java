package main;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {

    private Persona persona1;
    private Persona persona2;
    private Persona persona3;

    @BeforeEach
    void setUp() {
        persona1 = new Persona(12345678, "John Doe", 'M', 1, 1, 1990);
        persona2 = new Persona(87654321, "Jane Smith", 'F', 1, 1, 1985);
        persona3 = new Persona(12345678, "John Doe", 'M', 1, 1, 1990);
    }

    @Test
    void testToString() {
        assertEquals("12345678-Z\tJohn\tDoe\t\t" + persona1.getEdad(), persona1.toString());
    }

    @Test
    void testEquals() {
        assertTrue(persona1.equals(persona3));
        assertFalse(persona1.equals(persona2));
    }

    @Test
    void testEquals1() {
        assertFalse(persona1.equals(null));
    }

    @Test
    void testCompareTo() {
        assertTrue(persona2.compareTo(persona1) > 0);
        assertTrue(persona1.compareTo(persona3) == 0);
    }
}
