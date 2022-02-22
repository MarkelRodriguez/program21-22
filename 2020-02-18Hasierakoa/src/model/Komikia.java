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
public class Komikia extends Book{
    private boolean kolorea;

    public Komikia(String name, Author author, double price, int pages, boolean kolorea) {
        super(name, author, price, pages);
        this.kolorea = kolorea;
    }

    public void setKolorea(boolean kolorea) {
        this.kolorea = kolorea;
    }
    public boolean isKolorea(){
        return kolorea;
    }
     public String getNolakoa(){
        if (isKolorea()){
            return "kolorea";
        }
        else{
            return "zuri-beltza";
        }
        
    }

    @Override
    public String toString() {
        return"[Komikia]"+ getName() + ", " + getAuthor().getName() + ", " + getNolakoa() + ", " + getPrice() + ", " + getPages();  
    }
}

