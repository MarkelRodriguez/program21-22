/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.MyPoint;

/**
 *
 * @author rodriguez.markel
 */
public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;
    
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    public MyPoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }
    public double getAzalera(){
        double altuera = topLeft.getY() - bottomRight.getY();
        double zabalera =  bottomRight.getX() -topLeft.getX() ;
        double azalera = zabalera * altuera;
        return azalera;
    }
    public double getPerimetroa(){
        double altuera = topLeft.getY() - bottomRight.getY();
        double zabalera =  bottomRight.getX() - topLeft.getX() ;
        double perimetroa = 2 * zabalera + 2 * altuera;
        return perimetroa;
    }

    @Override
    public String toString() {
        return "MyRectangle{" + "topLeft=" + topLeft + ", bottomRight=" + bottomRight + '}';
    }
    
}
