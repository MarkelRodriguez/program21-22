/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import model.Erosketak;

/**
 *
 * @author rodriguez.markel
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Erosketak e1 = new Erosketak("E18-02",null,6750);
        System.out.println(e1);
        Erosketak e2 = new Erosketak("E18-01","2018-09-25",null,null,null,3630);
        System.out.println(e2);
        
    }
    
}
