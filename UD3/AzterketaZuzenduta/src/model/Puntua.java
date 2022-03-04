/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Scanner;

/**
 *
 * @author rodriguez.markel
 */
public class Puntua implements Marrazgarria{
    private int x;
    private int y;
    private static int sortutakoPuntuak = 0;

    public Puntua() {
        x = 0;
        y = 0;
        sortutakoPuntuak++;
    }
    public Puntua(int x, int y) {
        this.x = x;
        this.y = y;
        sortutakoPuntuak++;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static int getSortutakoPuntuak() {
        return sortutakoPuntuak;
    }
    public boolean isEzkerreragoThan(Puntua bestePuntuBat){
        
        if(this.x < bestePuntuBat.x){
            
            return true;
        }
        else{
            return false;
        }
    }
    public void mugitu(){
        Scanner in = new Scanner(System.in);
        System.out.println("Zenbat posizio mugitu nahi duzu puntua:");
        int zenbat = in.nextInt();
        
        System.out.println("norantz mugitu nahi duzu");
        String norantz = in.next();
        
         switch (norantz) {
            case "eskumarantz":
                this.x = this.x + zenbat;
                break;
            case "ezkerrerantz":
                this.x = this.x - zenbat;
                break;
            case "goruntz":
                this.y = this.y + zenbat;
                break;
            case "beheruntz":
                this.y = this.y - zenbat;
                break;
            default:
                System.out.println("ezin da horrela mugitu");
                break;
        }
         System.out.println(this);
    }
    @Override
    public int hashCode() {
        int hash = 5;
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
        final Puntua other = (Puntua) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }


    @Override
    public void marraztu(Graphics2D g2d) {
        int radioa = 5;
            g2d.fillOval(x, y, radioa, radioa);
            g2d.getTransform();
    }

    
}
