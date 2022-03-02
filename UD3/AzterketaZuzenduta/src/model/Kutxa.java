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
        return (getErpinBat().getX() - getKontrakoErpina().getX()) * (getErpinBat().getY() - getKontrakoErpina().getY()) * altuera;
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
