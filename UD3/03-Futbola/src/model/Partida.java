/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author rodriguez.markel
 */
public class Partida {
    private LocalDate data;
    private String aurkaria;
    private  ArrayList <Futbolista> txartelak = new ArrayList();;

    public Partida(LocalDate data, String aurkaria) {
        
        this.data = data;
        this.aurkaria = aurkaria;
    }

    public String getAurkaria() {
        return aurkaria;
    }

    public void setAurkaria(String aurkaria) {
        this.aurkaria = aurkaria;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
    public void txartelaJarri(Futbolista f){
        txartelak.add(f);
    }
    
    
}
