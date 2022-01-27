/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author rodriguez.markel
 */
public class Futbolista extends IntegranteSeleccion{
    private int dorsal;
    private Demarkazioa demarcacion;

    public Futbolista() {
    }

    public Futbolista(int dorsal, Demarkazioa demarcacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public Demarkazioa getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(Demarkazioa demarcacion) {
        this.demarcacion = demarcacion;
    }
    
    public void entrenar(){
        System.out.println("Entrenatzen nago");
        
    } 
    public void jugarPartido(){
        System.out.println("Partidua jolasten nago");
    }

    @Override
    public String toString() {
        return "Futbolista{" + "id=" + super.id + ", nombre=" + super.nombre + ", apellido=" + getApellidos() + ", edad=" + getEdad() +" dorsal=" + dorsal +", demarcacion=" + demarcacion +'}';
    }
    
}
