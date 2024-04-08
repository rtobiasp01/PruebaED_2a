package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CursoTest {

    private Curso curso;
    private Persona alumno1;
    private Persona alumno2;
    private Persona alumno3;

    @BeforeEach
    void setUp() {
        curso = new Curso("Curso de Prueba");
        alumno1 = new Persona("12345678A", "Juan", "Gomez");
        alumno2 = new Persona("98765432B", "Maria", "Lopez");
        alumno3 = new Persona("55555555C", "Pedro", "Martinez");
    }


    @Test
    void testConstructor() {
        assertNotNull(curso);
        assertEquals("Curso de Prueba", curso.getNombre());
        assertTrue(curso.listaAlumnos.isEmpty());
    }

    @Test
    void testAniadirAlumno() {
        curso.aniadirAlumno(alumno1);
        curso.aniadirAlumno(alumno2);
        curso.aniadirAlumno(alumno3);
        assertTrue(curso.listaAlumnos.contains(alumno1));
        assertTrue(curso.listaAlumnos.contains(alumno2));
        assertTrue(curso.listaAlumnos.contains(alumno3));
    }

    @Test
    void testToString() {
        curso.aniadirAlumno(alumno1);
        curso.aniadirAlumno(alumno2);
        curso.aniadirAlumno(alumno3);
        String s = "--------------------" + curso.nombre + "-----------------\n";
        s += "NumExp\tNIF\t\tNombre\t\tApellidos\n";
        s += "-------------------------------------------------\n";
        for (Persona listaAlumno : curso.listaAlumnos) {
            s += listaAlumno + "\n";
        }
        assertEquals(s, curso.toString());
    }
}
