/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author rodriguez.markel
 */
public class Laukizuzena implements Marrazgarria {
    private Puntua erpinBat;
    private Puntua kontrakoErpina;

    public Laukizuzena(Puntua erpirnBat, Puntua kontrakoErpina) {
        this.erpinBat = erpirnBat;
        this.kontrakoErpina = kontrakoErpina;
    }
    
    public Laukizuzena(int x1, int y1, int x2, int y2){
        this.erpinBat = new Puntua(x1,y1);
        this.kontrakoErpina = new Puntua(x2,y2);
    }

    public Puntua getErpinBat() {
        return erpinBat;
    }

    public Puntua getKontrakoErpina() {
        return kontrakoErpina;
    }
    
    public Puntua[] getLauErpinenArraya(){
        
        Puntua[] puntuak = new Puntua[4];
        puntuak[0] = new Puntua(getErpinBat().getX(),getErpinBat().getY());
        puntuak[1] = new Puntua(getErpinBat().getX(),getKontrakoErpina().getY());
        puntuak[2] = new Puntua(getKontrakoErpina().getX(),getErpinBat().getY());
        puntuak[3] = new Puntua(getKontrakoErpina().getX(),getKontrakoErpina().getY());
        
        return puntuak;
    }
    
    public ArrayList<Puntua> getLauErpinenArrayLista(){
        ArrayList<Puntua> puntuak = new ArrayList<>();
        puntuak.add(new Puntua(getErpinBat().getX(),getErpinBat().getY()));
        puntuak.add(new Puntua(getErpinBat().getX(),getKontrakoErpina().getY()));
        puntuak.add(new Puntua(getKontrakoErpina().getX(),getErpinBat().getY()));
        puntuak.add(new Puntua(getKontrakoErpina().getX(),getKontrakoErpina().getY()));
        
        return puntuak;
    }
    public boolean isInside(Puntua bestePuntua){
        if(this.erpinBat.getX() <= bestePuntua.getX() && bestePuntua.getX()<= this.kontrakoErpina.getX() && this.erpinBat.getY() <= bestePuntua.getY() && bestePuntua.getY()<= this.kontrakoErpina.getY() ){
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public String toString() {
        
        
        return  Arrays.toString(getLauErpinenArraya());
    }

    @Override
    public void marraztu() {
        System.out.println(this + " Laukizuzena GUI baten gorde da");
    }
    
    
}
