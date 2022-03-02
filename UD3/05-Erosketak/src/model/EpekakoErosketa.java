/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import model.bezerointerfazea.Bezeroa;

/**
 *
 * @author rodriguez.markel
 */
public class EpekakoErosketa extends Erosketa {
    private int epeak = 12;
    private boolean ordainketaBukatua = false;
    private double kuota;

    public EpekakoErosketa(double kuota, String kodea, String data, Bezeroa bezeroa, ArrayList<Produktua> produktuak, ArrayList<Integer> unitatateak, double guztira) {
        super(kodea, data, bezeroa, produktuak, unitatateak, guztira);
        this.kuota = kuota;
    }

    public EpekakoErosketa(double kuota, String kodea, String data, Bezeroa bezeroa, double guztira) {
        super(kodea, data, bezeroa, guztira);
        this.kuota = kuota;
    }
    

    
    
    public double gainetikOrdainduBeharrekoa(){
        return kuota * epeak - guztira;
    }

    @Override
    public String toString() {
        return "EpekakoErosketa{ Kodea= " + getStrKodea() + "Data= " + super.data + "epeak= " + epeak + ", ordainketaBukatua= " + ordainketaBukatua + ", kuota= " + kuota + '}';
    }
    
}
