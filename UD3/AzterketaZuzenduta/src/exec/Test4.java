/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exec;

import java.util.ArrayList;
import model.Kutxa;
import model.Laukizuzena;
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
        ArrayList<Kutxa> Kutxak = new ArrayList<>();
         Kutxak.add(new Kutxa(new Puntua(2,17),new Puntua(6,25),4));
         Kutxak.add(new Kutxa(new Puntua(5,20),new Puntua(3,27),6));
         Kutxak.add(new Kutxa(new Puntua(7,13),new Puntua(4,15),9));
         
        for(int i = 0; i < Kutxak.size(); i++){
            
        }
    }
    
}
