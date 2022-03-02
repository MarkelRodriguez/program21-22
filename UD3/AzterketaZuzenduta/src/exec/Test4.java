/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exec;

import model.Kutxa;
import model.Puntua;

/**
 *
 * @author rodriguez.markel
 */
public class Test4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Kutxa k1 = new Kutxa(new Puntua(2,17),new Puntua(6,25),4);
       
        System.out.println(k1.getBolumena());
        
        System.out.println(k1.getErtzenLuzeera());
    }
    
}
