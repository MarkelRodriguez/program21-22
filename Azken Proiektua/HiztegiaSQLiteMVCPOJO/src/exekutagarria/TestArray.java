/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarria;

import model.Model;
import model.Terminoa;

/**
 *
 * @author rodriguez.markel
 */
public class TestArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Model model = new Model();
        
        for(Terminoa t :model.terminoakArrayra()){
            System.out.println(t);
        }
    }
    
}
