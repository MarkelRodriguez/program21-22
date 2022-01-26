/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author rodriguez.markel
 */
public class Cylinder extends Circle {
   // private instance variable
   private double height;

   // Constructors
   public Cylinder() {
      super();  // invoke superclass' constructor Circle()
      this.height = 1.0;
      System.out.println("Constructed a Cylinder with Cylinder()");  // for debugging
   }
   public Cylinder(double height) {
      super();  // invoke superclass' constructor Circle()
      this.height = height;
      System.out.println("Constructed a Cylinder with Cylinder(height)");  // for debugging
   }
   public Cylinder(double height, double radius) {
      super(radius);  // invoke superclass' constructor Circle(radius)
      this.height = height;
      System.out.println("Constructed a Cylinder with Cylinder(height, radius)");  // for debugging
   }
   public Cylinder(double height, double radius, String color) {
      super(radius, color);  // invoke superclass' constructor Circle(radius, color)
      this.height = height;
      System.out.println("Constructed a Cylinder with Cylinder(height, radius, color)");  // for debugging
   }

   // Getter and Setter
   public double getHeight() {
      return this.height;
   }
   public void setHeight(double height) {
      this.height = height;
   }

   /** Returns the volume of this Cylinder */
   public double getVolume() {
      return super.getArea()*height;   // use superclass' getArea()
   }
  public double getArea() {
      return 2*Math.PI*getRadius()*height + 2*super.getArea();
   }

   /** Returns a self-descriptive String */
   public String toString() {
      return "Cylinder[" + super.toString() + ",height=" + height + "]";   
   }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.height) ^ (Double.doubleToLongBits(this.height) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cylinder other = (Cylinder) obj;
        if (Double.doubleToLongBits(this.height) != Double.doubleToLongBits(other.height)) {
            return false;
        }
        return true;
    }
   
}
