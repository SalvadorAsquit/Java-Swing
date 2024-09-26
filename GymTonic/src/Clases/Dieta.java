/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
import java.util.Objects;

/**
 * Dietas representa aun objeto de tipo Dieta
 * @author Salvador
 */
public class Dieta implements Serializable{
     private String nombre;
     private String descripcion;
    /**
     * Constructor de Dietas
     * @param nombre de la dieta
     * @param descripcion de la dieta
     */ 
     public Dieta (String nombre, String descripcion){
     this.nombre= nombre;
     this.descripcion = descripcion;
     }
/**
 * Devuelve el nombre de la dieta   
 * @return el nombre
 */
    public String getNombre() {
        return nombre;
    }
/**
 * asigna un nombre ala dieta
 * @param nombre que se le asigna
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * Devvuelve la descripcion de la dieta
 * @return la descripcion
 */
    public String getDescripcion() {
        return descripcion;
    }
/**
 * Asigna una decripcion a la dieta
 * @param descripcion de la dieta
 */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Descripcion=" + descripcion;
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
        final Dieta other = (Dieta) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        return true;
    }
     
}
