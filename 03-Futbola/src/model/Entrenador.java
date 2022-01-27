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
public class Entrenador extends IntegranteSeleccion{
    private String idFederacion;

    public Entrenador() {
    }

    public Entrenador(String idFederacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    public void dirigirEntrenamiento(){
        System.out.println("Entrenamendu batean nago");
    }
    public void dirigirPartido(){
        System.out.println("Partidu batean nago"); 
    }

    @Override
    public String toString() {
        return "Entrenador{" + "idFederacion=" + idFederacion + ", id=" + super.id + ", nombre=" + super.nombre + ", apellido=" + getApellidos() + ", edad=" + getEdad() +'}';
    }
    
}
