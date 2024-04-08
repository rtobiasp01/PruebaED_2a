/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.TreeSet;

/**
 *
 * @author ProfDiurno
 */
import java.util.TreeSet;

/**
 * La clase Curso representa un curso que contiene una lista de alumnos.
 */
public class Curso {

    /** El nombre del curso. */
    public String nombre;

    /** La lista de alumnos inscritos en el curso. */
    public TreeSet<Persona> listaAlumnos;

    /**
     * Obtiene el nombre del curso.
     *
     * @return El nombre del curso.
     */
    protected String getNombre() {
        return nombre;
    }

    /**
     * Constructor de la clase Curso que recibe el nombre del curso.
     *
     * @param nombre El nombre del curso.
     */
    public Curso(String nombre) {
        this.nombre = nombre;
        listaAlumnos = new TreeSet<>();
    }

    /**
     * Devuelve una representación en forma de cadena del curso, incluyendo su nombre y la lista de alumnos.
     *
     * @return Una representación en forma de cadena del curso.
     */
    @Override
    public String toString() {
        String s = "--------------------" + nombre + "-----------------\n";
        s += "NumExp\tNIF\t\tNombre\t\tApellidos\n";
        s += "-------------------------------------------------\n";
        for (Persona listaAlumno : listaAlumnos) {
            s += listaAlumno + "\n";
        }
        return s;
    }

    /**
     * Añade un alumno a la lista de alumnos inscritos en el curso.
     *
     * @param p El objeto Persona que representa al alumno a añadir.
     */
    public void aniadirAlumno(Persona p) {
        listaAlumnos.add(p);
    }
}
