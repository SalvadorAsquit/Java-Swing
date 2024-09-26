/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyecto.pro.rec.ProyectoProRec;

/**
 * Clientes que Hereda de Persona
 * @author Salvador
 */
public class Cliente extends Persona implements Serializable {
    private double cuota;
    private int numeroSocio;
    private int numeroSocioDisponible;
    

    /**
     * Construcor de Cliente
     * @param dni del Cliente
     * @param nombre del Cliente
     * @param usuario del Cliente
     * @param contraseña  del Cliente
     */
    public Cliente(String nombre, String dni, String usuario, String contraseña) {
        super(nombre, dni, usuario, contraseña);
        this.cuota = 30;
        this.numeroSocio=asignaNumeroSocio();
    }

    /**
     * Devuelve la Cuota que paga
     * @return cuota
     */
    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(int numeroSocio) {
        this.numeroSocio = numeroSocio;
    }
   
    
    /**
     * Aumenta o disminuye el precio de la suscripción del gymnasio
     * @param aumentoPrecio 
     */
    public void aumentoCuota(double aumentoPrecio){
        this.cuota= cuota + aumentoPrecio;
    }

    public void reduccionCuota(double reduccionPrecio){
        this.cuota= cuota - reduccionPrecio;
    }
    /**
     * La funcion recorera la lista de los clientes cojendo el numero de socio y asignara el siguiente
     * @return numeroSocioDisponible
     */
    private int asignaNumeroSocio(){
         List<Cliente> listC;

        try {
            ObjectInputStream ficherocarga = new ObjectInputStream(new FileInputStream("Cliente.dat"));
            listC = (List<Cliente>) ficherocarga.readObject();
            ficherocarga.close();
        } catch (Exception ex) {
            listC = new LinkedList();
            Logger.getLogger(ProyectoProRec.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (int i = 0; i < listC.size(); i++) {
                ;
                numeroSocioDisponible =listC.get(i).getNumeroSocio() +1 ;
                }
        
    return numeroSocioDisponible;
    }

    @Override
    public String toString() {
        return "NumeroSocio: " + numeroSocio + " Nombre: "+ this.nombre +" Cuota: " + cuota;
    }
   
    
    
}
