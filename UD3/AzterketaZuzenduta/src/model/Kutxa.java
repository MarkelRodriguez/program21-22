/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author rodriguez.markel
 */
public class Kutxa extends Laukizuzena {
    private int altuera;

    public Kutxa( Puntua erpirnBat, Puntua kontrakoErpina, int altuera) {
        super(erpirnBat, kontrakoErpina);
        this.altuera = altuera;
    }

    public int getAltuera() {
        return altuera;
    }
    public int getBolumena(){
        return Math.abs(super.getErpinBat().getX() - super.getKontrakoErpina().getX()) * Math.abs(super.getErpinBat().getY() - super.getKontrakoErpina().getY()) * this.altuera;
    }
    public double getErtzenLuzeera(){
       double kat1 = getErpinBat().getX() - getKontrakoErpina().getX();
       double kat2 = getErpinBat().getY() - getKontrakoErpina().getY();
        return  Math.sqrt(Math.pow( kat1,2 ) + Math.pow( kat2,2));
    }
    
    public static Kutxa handiena(ArrayList<Kutxa> kutxak){
        
        Kutxa handiena = null;
        for (int i = 0; i < kutxak.size(); i++) {
            handiena = kutxak.get(0);
            if (kutxak.get(i).getBolumena() > handiena.getBolumena() ){
            handiena = kutxak.get(i);
            }
            
        }
        return handiena;
    }
    
    public boolean isHandiagoa(Kutxa besteKutxaBat){
       
        
        if ((this.getErpinBat().getX() - this.getKontrakoErpina().getX()) * (this.getErpinBat().getY() - this.getKontrakoErpina().getY()) * this.altuera > (besteKutxaBat.getErpinBat().getX() - besteKutxaBat.getKontrakoErpina().getX()) * (besteKutxaBat.getErpinBat().getY() - besteKutxaBat.getKontrakoErpina().getY()) * besteKutxaBat.altuera){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Oinarria :" + super.toString() + "eta altuera :" + altuera;
    }
    
     
    
    @Override
    public void marraztu(){
        System.out.println("Oinarria : [(" + getErpinBat().getX()+ ", " + getErpinBat().getY() + "), (" + getErpinBat().getX()+ ", " + getKontrakoErpina().getY() + "), (" + getKontrakoErpina().getX()+ ", " + getErpinBat().getY() + "), (" + getKontrakoErpina().getX()+ ", " + getKontrakoErpina().getY() + ")] eta altuera :" + altuera + "dituen kutxa GUI baten marraztu da");
    
    }
}
