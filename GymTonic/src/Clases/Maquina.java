/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;

/**
 *Clase que hereda de Articulos
 * @author Salvador
 */
public class Maquina extends Articulos implements Serializable{
    private int numeroSerie;
    /**
     * Constructor de Maquinas
     * @param nombre
     * @param descripcion
     * @param precio 
     * @param cantidad 
     */
    public Maquina(String nombre, String descripcion, double precio ,int cantidad) {
        super(nombre, descripcion, precio, cantidad);
    }
    /**
     * Constructor opcional para registrar las maquinar individualmente
     * @param numeroSerie
     * @param nombre
     * @param descripcion
     * @param precio 
     * @param cantidad 
     */
    public Maquina(int numeroSerie, String nombre, String descripcion, double precio, int cantidad) {
        super(nombre, descripcion, precio, cantidad);
        this.numeroSerie = numeroSerie;
    }
    /**
     * funcion que devuelve el numero de serie
     * @return numeroSerie
     */
    public int getNumeroSerie() {
        return numeroSerie;
    }
    /**
     * Funcion que cambia el numero de seria
     * @param numeroSerie 
     */
    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
    
    
}
