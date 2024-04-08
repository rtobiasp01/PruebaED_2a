/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

/**
 * La clase Persona representa a una persona con sus atributos como NIF, nombre, género y fecha de nacimiento.
 * Implementa la interfaz Comparable para permitir la comparación entre objetos Persona.
 */

public class Persona implements Comparable<Persona> {

    /** El NIF (Número de Identificación Fiscal) de la persona. */
    public Nif nif;

    /** El nombre de la persona. */
    public String nombre;

    /** El género de la persona ('M' para masculino, 'F' para femenino). */
    public char genero;

    /** La fecha de nacimiento de la persona. */
    public LocalDate nacimiento;

    /**
     * Constructor vacío de la clase Persona. Inicializa los atributos con valores por defecto.
     * @param s
     * @param juan
     * @param gomez
     */
    public Persona(String s, String juan, String gomez) {
        nif = new Nif();
        nombre = "";
        genero = ' ';
        nacimiento = LocalDate.of(1990, 1, 1);
    }

    /**
     * Constructor de la clase Persona que recibe un NIF como entero.
     *
     * @param nif El NIF de la persona.
     */
    public Persona(int nif) {
        this("55555555C", "Pedro", "Martinez"); // Llama al otro constructor
        this.nif = new Nif(nif);
    }

    /**
     * Constructor de la clase Persona que recibe todos los atributos.
     *
     * @param nif El NIF de la persona.
     * @param nombre El nombre de la persona.
     * @param genero El género de la persona ('M' o 'F').
     * @param dia El día de nacimiento.
     * @param mes El mes de nacimiento.
     * @param ano El año de nacimiento.
     */
    public Persona(int nif, String nombre, char genero, int dia, int mes, int ano) {
        this.nif = new Nif(nif);
        this.nombre = nombre;
        this.genero = genero;
        this.nacimiento = LocalDate.of(ano, mes, dia);
    }

    /**
     * Obtiene el NIF de la persona.
     *
     * @return El NIF de la persona.
     */
    public Nif getNif() {
        return nif;
    }

    /**
     * Establece el NIF de la persona.
     *
     * @param nif El NIF a establecer.
     */
    public void setNif(Nif nif) {
        this.nif = nif;
    }

    /**
     * Obtiene el nombre de la persona.
     *
     * @return El nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la persona.
     *
     * @param nombre El nombre a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el género de la persona.
     *
     * @return El género de la persona ('M' o 'F').
     */
    public char getGenero() {
        return genero;
    }

    /**
     * Establece el género de la persona.
     *
     * @param genero El género a establecer ('M' o 'F').
     */
    public void setGenero(char genero) {
        this.genero = genero;
    }

    /**
     * Obtiene la fecha de nacimiento de la persona.
     *
     * @return La fecha de nacimiento de la persona.
     */
    public LocalDate getNacimiento() {
        return nacimiento;
    }

    /**
     * Establece la fecha de nacimiento de la persona.
     *
     * @param nacimiento La fecha de nacimiento a establecer.
     */
    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    /**
     * Calcula la edad de la persona en años.
     *
     * @return La edad de la persona en años.
     */
    public int getEdad() {
        return Period.between(nacimiento, LocalDate.now()).getYears();
    }

    /**
     * Devuelve una representación en forma de cadena de la persona.
     *
     * @return La representación en forma de cadena de la persona.
     */
    @Override
    public String toString() {
        if (nombre.split(" ").length > 1) {
            return nif + "\t" + nombre.split(" ")[0] + '\t' + nombre.split(" ")[1] + "\t\t" + getEdad();
        } else {
            return nif + "\t" + nombre + "\t\t\t" + getEdad();
        }
    }

    /**
     * Compara si dos personas son iguales basadas en su NIF.
     *
     * @param a La persona con la que comparar.
     * @return true si las personas tienen el mismo NIF, false en caso contrario.
     */
    public boolean equals(Persona a) {
        if (a == null) {
            return false;
        }
        return a.nif.toString().equals(this.nif.toString());
    }

    /**
     * Compara si dos personas son iguales.
     *
     * @param obj El objeto con el que comparar.
     * @return true si las personas son iguales, false en caso contrario.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        return Objects.equals(this.nif, other.nif);
    }

    /**
     * Compara dos personas basado en su NIF.
     *
     * @param o La persona con la que comparar.
     * @return Un valor negativo si esta persona es menor que la otra,
     *         cero si son iguales, o un valor positivo si es mayor.
     */
    @Override
    public int compareTo(Persona o) {
        return this.nif.toString().compareTo(o.nif.toString());
    }
}
