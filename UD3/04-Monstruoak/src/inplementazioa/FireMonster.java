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
public class FireMonster implements Monstruosoa {
   /** Constructs a FireMonster with the given name */
    String name;
   public FireMonster(String name) {
      this.name = name;
   }
   /** Subclass provides actual implementation for attack() */
   @Override
   public String attack() {
      return "Attack with fire!"; 
   }
}