/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inplementazioa;



/**
 *
 * @author rodriguez.markel
 */
public class TestMonster {
   public static void main(String[] args) {
      // Program at the specification defined in the superclass/interface.
      // Declare instances of the superclass, substituted by subclasses.
      Monstruosoa m1 = new FireMonster("r2u2");   
      Monstruosoa m2 = new WaterMonster("u2r2");  
      Monstruosoa m3 = new StoneMonster("r2r2");  

      // Invoke the actual implementation
      System.out.println(m1.attack());  // Run FireMonster's attack()
      //Attack with fire!
      System.out.println(m2.attack());  // Run WaterMonster's attack()
      //Attack with water!
      System.out.println(m3.attack());  // Run StoneMonster's attack()
      //Attack with stones!

      // m1 dies, generate a new instance and re-assign to m1.
      m1 = new StoneMonster("a2b2");  // upcast
      System.out.println(m1.attack());  // Run StoneMonster's attack()
      //Attack with stones!

      
      //Monstruosoa m4 = new Monstruosoa("u2u2");//ezin da egin
   

      Monstruosoa m5 = new FilthyWaterMonster("b2b2");
       System.out.println(m5.attack());
   }
}
