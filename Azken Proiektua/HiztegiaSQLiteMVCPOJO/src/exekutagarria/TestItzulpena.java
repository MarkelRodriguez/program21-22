/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarria;

import model.Model;

/**
 *
 * @author rodriguez.markel
 */
public class TestItzulpena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Model model = new Model();
        
        String hitza = "uda";
        String itzulpena = model.euskaratu(hitza);
        if(itzulpena.equals("")){
            System.out.println("Ez dago hiztegian");
        }
        else{
            System.out.println(hitza + " => " + itzulpena);
        }
        
    }
    
}
