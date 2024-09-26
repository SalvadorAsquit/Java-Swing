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
 * Clase Empleado crea un objeto que representa a un Empleado
 * @author Salvador
 */
public class Empleado extends Persona implements Serializable{
    private int id;
    private int idDisponible;
    private double sueldo;
    

    /**
     * constructor de Empleados
     * @param nombre
     * @param dni
     * @param usuario
     * @param contraseña 
     */
    public Empleado(String nombre, String dni, String usuario, String contraseña) {
        super(nombre, dni, usuario, contraseña);
        sueldo = 1000;
        this.id=asignaIdDisponible();
    }

    // Setter y Getters
    public int getIdDisponible() {
        return idDisponible;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
  public void aumentosueldo(double aumentoSueldo){
        this.sueldo= sueldo + aumentoSueldo;
    }
 
  public void reduccionsueldo(double reduccionSueldo){
        this.sueldo= sueldo + reduccionSueldo;
    }
    /**
     * Asigna un id disponible
     * @return idDisponible
     */
    private int asignaIdDisponible(){
        List <Empleado> listE;

        try {
            ObjectInputStream ficherocargaEmpleado = new ObjectInputStream(new FileInputStream("Empleado.dat"));
            listE =(List <Empleado>) ficherocargaEmpleado.readObject();
            ficherocargaEmpleado.close();
        } catch (Exception ex) {
            listE = new LinkedList();
            Logger.getLogger(ProyectoProRec.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (int i = 0; i < listE.size(); i++) {
                idDisponible = listE.get(i).getIdDisponible()+1;
                }
        
    return idDisponible;
    }

    @Override
    public String toString() {
        return "Id: " + id + ", Nombre: "+ this.nombre + ", sueldo: " + sueldo ;
    }
    
    

    

    
    
    
    
    
    
}