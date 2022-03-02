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
public class Test5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
         Laukizuzena lauki1 = new Laukizuzena(new Puntua(7,2),new Puntua(10,4));
         Puntua p2 = new Puntua(7, 5);
         Puntua p3 = new Puntua(8, 3);
         if(lauki1.isInside(p2)){
             System.out.println("Barruan dago");
         }
         else{
             System.out.println("Ez dago barruan");
         }
         if(lauki1.isInside(p3)){
             System.out.println("Barruan dago");
         }
         else{
             System.out.println("Ez dago barruan");
         }
         
         ArrayList<Kutxa> Kutxak = new ArrayList<>();
         Kutxak.add(new Laukizuzena(new Puntua(7,2),new Puntua(10,4)));
    }
    
}
