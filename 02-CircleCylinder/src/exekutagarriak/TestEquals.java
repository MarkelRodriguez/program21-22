/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import model.Circle;

/**
 *
 * @author rodriguez.markel
 */
public class TestEquals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args ) {
        // TODO code application logic here
        Circle c1 = new Circle(1,"gorria");
        Circle c2 = new Circle(1,"gorria");
        c1.equals(c2);
    }
    
}
