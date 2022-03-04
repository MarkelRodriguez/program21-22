/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import java.util.Scanner;
import model.Circle;
import model.Cylinder;

/**
 *
 * @author rodriguez.markel
 */
public class ZirkuluaSortu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char aukera;
        Scanner sc = new Scanner(System.in);
        System.out.println("Zirkulu arrunta edo zilindroa sortu nahi duzu(a/z)?");
        aukera = sc.next().charAt(0);
        if (aukera == 'a'){
            double radius;
            String color;
            
            System.out.println("Sartu zirkuluaren erradioa:");
            radius = sc.nextInt();
            System.out.println("Sartu zirkuluaren kolorea:");
            color = sc.next();
            Circle c1 = new Circle(radius, color);
            System.out.println("Hauek dira sortutako ZIRKULUAren ezaugarriak:");
            
            System.out.println("Erradioa: " + c1.getRadius());
            System.out.println("Kolorea: " + c1.getColor());
            System.out.println("Azalera: " + c1.getArea());
            
        }
        else if(aukera == 'z'){
              double radius;
            String color;
            double altuera;
            System.out.println("Sartu zirkuluaren erradioa:");
            radius = sc.nextInt();
            System.out.println("Sartu zirkuluaren kolorea:");
            color = sc.next();
            System.out.println("Sartu zirkuluaren erradioa:");
            altuera = sc.nextInt();
            Cylinder d1 = new Cylinder(altuera, radius, color);
            System.out.println("Hauek dira sortutako ZILINDROAren ezaugarriak:");
            
            System.out.println("Erradioa: " + d1.getRadius());
            System.out.println("Kolorea: " + d1.getColor());
            System.out.println("Altuera: " + d1.getHeight());
            System.out.println("Azalera: " + d1.getArea());
            System.out.println("Bolumena: " + d1.getVolume());
            
        }
        
    }
    
}
