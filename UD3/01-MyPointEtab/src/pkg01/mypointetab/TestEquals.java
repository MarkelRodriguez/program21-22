/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01.mypointetab;

import model.MyPoint;

/**
 *
 * @author rodriguez.markel
 */
public class TestEquals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyPoint p1 = new MyPoint(7,8);
        MyPoint p2 = new MyPoint(7,8);

        if (p1.equals(p2)) {
            System.out.println("Espazioko puntu berdina adierazten dute.");
        }
    }
    
}
