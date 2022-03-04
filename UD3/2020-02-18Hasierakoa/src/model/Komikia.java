/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;

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
    public void argitaratu() {
        System.out.println("Komiki hau Eibarren argitaratua " + LocalDate.now() + "egunean");
        argitaratutakoLiburuak++;
    }
    @Override
    public void argitaratuHizk() {
        if (this.hizkuntza == Hizkuntza.EU ){
          System.out.println("Eibarren argitaratua " + LocalDate.now() + "egunean");
          argitaratutakoLiburuak++; 
        
        }
        else if (this.hizkuntza == Hizkuntza.EN){
          System.out.println("This book was published in Eibar in " + LocalDate.now() );
          argitaratutakoLiburuak++;      
        }
        else if (this.hizkuntza == Hizkuntza.ES){
          System.out.println("Este libro ha sido publicado en Eibar el dia " + LocalDate.now());
          argitaratutakoLiburuak++;      
        }
    }
    @Override
    public String toString() {
        return"[Komikia]"+ getName() + ", " + getAuthor().getName() + ", " + getNolakoa() + ", " + getPrice() + ", " + getPages();  
    }
}

