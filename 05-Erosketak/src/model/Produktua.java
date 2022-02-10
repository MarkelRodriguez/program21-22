/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Arrays;



/**
 *
 * @author rodriguez.markel
 */
public class Produktua {

    private char[] kodea;
    private String izena;
    private double prezioa;

   public Produktua(char[] kodea, String izena, double prezioa) {
        this.kodea = kodea;
        this.izena = izena;
        this.prezioa = prezioa;
    }
    public Produktua(String kodea, String izena, double prezioa) {
        this.kodea = kodea.toCharArray();
        this.izena = izena;
        this.prezioa = prezioa;
    }

    public char[] getKodea() {
        return kodea;
    }
  
    public String getIzena() {
        return izena;
    }

    public void setIzena(String izena) {
        this.izena = izena;
    }

    public double getPrezioa() {
        return prezioa;
    }

    public void setPrezioa(double prezioa) {
        this.prezioa = prezioa;
    }
    public String getStrKodea() {
        String strKodea = String.valueOf(kodea);
      return strKodea; 
    }
    

    @Override
    public String toString() {
        return "Produktua{" + "kodea=" + getStrKodea() + ", izena=" + izena + ", prezioa=" + prezioa + '}';
    }
    
}
