/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
import java.util.Objects;

/**
 * 
 * @author salvador
 */
public class Persona implements Serializable {
// Variables que compartiran todas las clases ya sean clientes u empleados
    String Dni;
    String nombre;
    String usuario;
    String contraseña;

    /**
     * constructro de las personas
     * @param nombre de las personas
     * @param dni de las personas
     * @param usuario de las personas
     * @param contraseña de las personas
     */
    public Persona(String nombre, String dni, String usuario, String contraseña) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.Dni = dni;
    }
    /**
     * Funcion que devuelve el nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Funcion que cambia el nombre
     * @param nombre que cambia
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Funcion que cambia el usuario
     * @return el usuario
     */
    public String getUsuario() {
        return usuario;
    }
    /**
     * Funcion que cambia el usuario
     * @param usuario que cambia
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    /**
     * Funcion que cambia la contraseña
     * @return la contraseña
     */
    public String getContraseña() {
        return contraseña;
    }
    /**
     * Funcion que cambia la contraseña
     * @param contraseña 
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    /**
     * Funcion que devuelve el dni 
     * @return 
     */
    public String getDni() {
        return Dni;
    }
    /**
     * Funcion que cambia el dni
     * @param Dni 
     */
    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    /* toString para mostrar a las personas
    las contraseñas y los usuarios no se mostraran a no ser que sea necesario
    */
    /**
     * toString que muestra a las personas
     * @return  el dni y el nombre
     */
    @Override
    public String toString() {
        return "Dni: " + Dni + ", nombre: " + nombre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

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
        if (!Objects.equals(this.Dni, other.Dni)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        if (!Objects.equals(this.contraseña, other.contraseña)) {
            return false;
        }
        return true;
    }

    
    
    
}

