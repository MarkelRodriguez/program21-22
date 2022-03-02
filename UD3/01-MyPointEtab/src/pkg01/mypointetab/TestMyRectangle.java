/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01.mypointetab;

import model.MyRectangle;
import model.MyPoint;

/**
 *
 * @author rodriguez.markel
 */
public class TestMyRectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyRectangle rec1 = new MyRectangle(new MyPoint(1, 5), new MyPoint(7, 3));
System.out.println(rec1);
System.out.println("  Perimetroa: " + rec1.getPerimetroa());
System.out.println("  Azalera: " + rec1.getAzalera());
System.out.println("");
    }
    
}
