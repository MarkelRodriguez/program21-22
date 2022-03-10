/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import model.SQLiteaKudeatu;

/**
 *
 * @author rodriguez.markel
 */
public class ProgramaNagusia {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        // TODO code application logic here
        SQLiteaKudeatu app = new SQLiteaKudeatu();

        // update the warehouse with id 3
        app.update(2, "laranja", "naranja");
        
        app.delete(5);
        
        app.insert("sagarra", "manzana");
        
        app.selectAll();
       }
       
        
}