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
public class Masajista extends IntegranteSeleccion{
    private String titulacion;
    private int añosExperiencia;

    public Masajista() {
    }

    public Masajista(String titulacion, int añosExperiencia, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.añosExperiencia = añosExperiencia;
    }

   

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }
    public void darMasaje(){
        System.out.println("Masaje bat ematen nago");
    }

    @Override
    public String toString() {
        return "Masajista{" + "titulacion=" + titulacion + ", Experiencia=" + añosExperiencia + ", id=" + super.id + ", nombre=" + super.nombre + ", apellido=" + getApellidos() + ", edad=" + getEdad() +'}';
    }
    
}
