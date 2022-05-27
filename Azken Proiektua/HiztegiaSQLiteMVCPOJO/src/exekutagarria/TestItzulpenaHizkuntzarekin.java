/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarria;

import model.Hizkuntza;
import static model.Hizkuntza.ES;
import static model.Hizkuntza.EU;
import model.Model;

/**
 *
 * @author rodriguez.markel
 */
public class TestItzulpenaHizkuntzarekin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Model model = new Model();
        Hizkuntza h = ES;
        String hitza = "lapiz";
        String itzulpena = model.itzuli(h, hitza);
        if(itzulpena.equals("")){
            System.out.println("Ez dago hiztegian");
        }
        else{
            System.out.println(hitza + " => " + itzulpena);
        }
        
    }
    
}

