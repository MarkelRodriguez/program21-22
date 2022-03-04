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
public class MyCircle {
    private MyPoint center = new MyPoint(0, 0);
    private int radius = 1;

    public MyCircle() {
    }
    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x,y);
        this.radius = radius;
        
        
    }
    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

   public double distance(MyCircle another) {
       
        

        return this.center.distance(another.center) ;

    }
    
    public boolean isInside(MyPoint puntua){
        boolean isValid = false;
        if(center.distance()>radius){
            return false;
        }
        else{
            return true;
        }
    }
    public double getArea(){
        double area = Math.PI * radius *radius;
        return area;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }
    public int getCenterX(){
        return center.getX();
        
    }
    public void setCenterX(int x) {
       this.center.setX(x);
    }
     public int getCenterY(){
        return center.getY();
        
    }
    public void setCenterY(int y) {
       this.center.setX(y);
    }
     public int [] getCenterXY(){
        return center.getXY();
        
    }
    public void setCenterXY(int x, int y) {
       this.center.setXY(x, y);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MyCircle{" + "center=" + center + ", radius=" + radius + '}';
    }
    
}

