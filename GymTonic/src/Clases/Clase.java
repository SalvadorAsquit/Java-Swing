/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
import java.util.Objects;

/**
 *Clase Clase representa un objeto de tipo Clase
 * @author Salvador
 */
public class Clase implements Serializable {
    private String nombre;
    private String hora;
    private String precio;
    
    /**
     * Constructor de Clases
     * @param nombre de la clase
     * @param hora de la clase
     * @param Precio  de la clase
     */
   public Clase(String nombre, String hora, String Precio){
   this.hora = hora;
    this.precio = Precio;
   this.nombre = nombre;
   }
/**
 * devuelve el nombre de la clase
 * @return nombre
 */
    public String getNombre() {
        return nombre;
    }
/**
 * Asigna nombre a la clase
 * @param nombre que se le asigna
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * Devuelve la hora
 * @return la hora
 */
    public String getHora() {
        return hora;
    }
/**
 * Hora que se le asigna ala clase
 * @param hora que se le asigna
 */
    public void setHora(String hora) {
        this.hora = hora;
    }
/**
 * Devuelve el precio de la clase
 * @return precio
 */
    public String getPrecio() {
        return precio;
    }
/**
 * Asigna un precio a la clase
 * @param precio que e le asigna
 */
    public void setPrecio(String precio) {
        this.precio = precio;
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
        final Clase other = (Clase) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.hora, other.hora)) {
            return false;
        }
        if (!Objects.equals(this.precio, other.precio)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Nombre=" + nombre + ", Hora=" + hora + ", Precio=" + precio;
    }
   
}
