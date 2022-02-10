/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.bezerointerfazea.Bezeroak;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author rodriguez.markel
 */
public class Erosketak {
    protected char[] kodea;
    protected LocalDate data;
    protected Bezeroak bezeroa;
    protected ArrayList<Produktua> produktuak;
    protected ArrayList<Integer> unitateak;
    protected double guztira;

    public Erosketak(String kodea, Bezeroak bezeroa, double guztira) {
        this.kodea = kodea.toCharArray();
        this.bezeroa = bezeroa;
        this.guztira = guztira;
    }

    public Erosketak(String kodea,String data,Bezeroak eroslea,ArrayList<Produktua>produktuak,ArrayList<Integer>unitateak,double guztira){
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

    public Bezeroak getBezeroa() {
        return bezeroa;
    }

    public void setBezeroa(Bezeroak bezeroa) {
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
    
   
    
    
    
    
}
