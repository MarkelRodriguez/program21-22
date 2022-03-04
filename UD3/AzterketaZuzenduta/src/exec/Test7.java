/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exec;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import model.Kutxa;
import model.Laukizuzena;

import model.Puntua;
@SuppressWarnings("serial")
/**
 *
 * @author rodriguez.markel
 */
public class Test7 extends JPanel{
    public Test7() {
          System.out.println("JFramea sortua, baina momentuz ez dago ikusgai.");       
    }
   public void paint (Graphics g) {
    
       Graphics2D g2 = (Graphics2D) g.create();
       g2.setColor(Color.RED);
       
       Puntua p2 = new Puntua(7, 5);
       p2.marraztu(g2);
       
        g2.setColor(Color.BLUE);
        Laukizuzena lauki1 = new Laukizuzena(new Puntua(100,300),new Puntua(200,400));
        lauki1.marraztu(g2);
        
         
        g2.setColor(Color.PINK);
        Kutxa k1 = new Kutxa(new Puntua(400,450),new Puntua(500,400),100);
         k1.marraztu(g2);
    }
    
    
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("JFramearen Izenburua");
        frame.add(new Test7());
        frame.setSize(600, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
