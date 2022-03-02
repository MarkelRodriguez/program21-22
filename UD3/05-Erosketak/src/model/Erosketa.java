/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import model.bezerointerfazea.Bezeroa;

/**
 *
 * @author rodriguez.markel
 */
public class Erosketa {
    protected char[] kodea;
    protected LocalDate data;
    protected Bezeroa bezeroa;
    protected ArrayList<Produktua> produktuak;
    protected ArrayList<Integer> unitateak;
    protected double guztira;

    public Erosketa(String kodea, String data, Bezeroa bezeroa, double guztira) {
        this.kodea = kodea.toCharArray();
        this.bezeroa = bezeroa;
        this.guztira = guztira;
        if (data == " "){
            this.data = LocalDate.now();
        }
        else{
            this.data = LocalDate.parse(data);
        }
        
    }

    public Erosketa(String kodea,String data,Bezeroa eroslea,ArrayList<Produktua>produktuak,ArrayList<Integer>unitateak,double guztira){
        this.kodea = kodea.toCharArray();
        this.data = LocalDate.parse(data);
        this.produktuak = produktuak;
        this.unitateak = unitateak;
        this.bezeroa = eroslea;
        this.guztira = guztira;
    
    }

    public char[] getKodea() {
        return kodea;
    }

    public String getStrKodea() {
        String strKodea = String.valueOf(kodea);
        return strKodea;
    }

    public void setKodea(String kodea) {
        
        this.kodea = kodea.toCharArray();
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Bezeroa getBezeroa() {
        return bezeroa;
    }

    public void setBezeroa(Bezeroa bezeroa) {
        this.bezeroa = bezeroa;
    }

    public ArrayList<Produktua> getProduktuak() {

        return produktuak;
        
    }

    public void setProduktuak(ArrayList<Produktua> produktuak) {
        this.produktuak = produktuak;
    }

    public ArrayList<Integer> getUnitatateak() {
        return unitateak;
    }

    public void setUnitatateak(ArrayList<Integer> unitateak) {
        this.unitateak = unitateak;
    }

    public double getGuztira() {
        return guztira;
    }

    public void setGuztira(double guztira) {
        this.guztira = guztira;
    }

    @Override
    public String toString() {
        return "Erosketak{" + "kodea=" + getStrKodea() + ", data=" + data + ", bezeroa=" + bezeroa + ", produktuak=" + produktuak + ", unitateak=" + unitateak + ", guztira=" + guztira + '}';
    }
    
   public String toStringLuzea(){
      
      String strLuzea = "";
       
             for ( Produktua produktua:produktuak){
                strLuzea  = "EROSKETA"
                         + "\n kodea: " + getStrKodea() + " Data: " + data
                         + "\n Izena: " + getBezeroa().getIzena()
                         + "\n Helbidea: " + getBezeroa().getHelbidea()
                         + "\n E-maila : " + getBezeroa().getEmaila()
                         +"\n 1.Produktua: " + produktua;
          
                  
                
            } 
        return strLuzea;
       
   }
   
   public boolean guztiraEgiaztatu(){
        int zenbatekoa = 0;
        for (int i = 0; i < produktuak.size(); i++) {
            zenbatekoa += produktuak.get(i).getPrezioa() * unitateak.get(i);
        }
        
        if(zenbatekoa == guztira){
            return true;
        }else{
            return false;
        }
    }
    
    
    
}
