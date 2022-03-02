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
        return (super.getErpinBat().getX() - super.getKontrakoErpina().getX()) * (super.getErpinBat().getY() - super.getKontrakoErpina().getY()) * this.altuera;
    }
    public double getErtzenLuzeera(){
       double kat1 = getErpinBat().getX() - getKontrakoErpina().getX();
       double kat2 = getErpinBat().getY() - getKontrakoErpina().getY();
        return  Math.sqrt(Math.pow( kat1,2 ) + Math.pow( kat2,2));
    }
    
    public static Kutxa handiena(ArrayList<Kutxa> kutxak){
        
        int handiena = 0;
        for (int i = 0; i < kutxak.size(); i++) {
            handiena = kutxak.get(i).getBolumena();
            if (kutxak.get(i).getBolumena() > handiena ){
            return kutxak.get(i);
        }
            
        }
        
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
    public void marraztu(){
        System.out.println("Oinarria : [(" + getErpinBat().getX()+ ", " + getErpinBat().getY() + "), (" + getErpinBat().getX()+ ", " + getKontrakoErpina().getY() + "), (" + getKontrakoErpina().getX()+ ", " + getErpinBat().getY() + "), (" + getKontrakoErpina().getX()+ ", " + getKontrakoErpina().getY() + ")] eta altuera :" + altuera + "dituen kutxa GUI baten marraztu da");
    
    }
}
