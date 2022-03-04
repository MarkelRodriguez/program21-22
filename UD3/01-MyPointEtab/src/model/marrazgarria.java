/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Graphics2D;

/**
 *
 * @author rodriguez.markel
 */
public class marrazgarria {
 
    
    public static class MyPointMarrazgarria {

        private int x;
        private int y;
        public MyPointMarrazgarria() {
             y = 0;
             x = 0;
            
        }

        public MyPointMarrazgarria(int x, int y) {
           this.x = x;
           this.y = y;
        }

        public void marraztu(Graphics2D g2d) {
             
            int radioa = 5;
            g2d.fillOval(x, y, radioa, radioa);
            g2d.getTransform();
        }
    }
    
}
