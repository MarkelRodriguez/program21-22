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


public class MyPoint {
    private int x;
    private int y;
    
    
    public MyPoint(){
        y = 0;
        x = 0;
    }
    public MyPoint(int x,int y){
        this.x = x;
        this.y = y;
    }
    
    public double distance() {

        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        return distance;

    }

    public double distance(MyPoint another) {

        double distance = Math.sqrt(Math.pow((this.y - another.y), 2) + Math.pow(this.x - another.x, 2));

        return distance;

    }

    public double distance(int x, int y) {

        double distance = Math.sqrt(Math.pow((this.y - y), 2) + Math.pow(this.x - x, 2));

        return distance;

    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    public int [] getXY(){
        int[] xy = {x, y};
        return xy;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void setXY(int x,int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ","+ y + ")";
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final MyPoint other = (MyPoint) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        return true;
    }
    
}

