/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jframe;
// TODO code application logic here
        import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import model.MyPoint;
import model.marrazgarria.MyPointMarrazgarria;

@SuppressWarnings("serial")

public class GUIBatenMarraztu extends JPanel {

    @Override
    public void paint(Graphics g) {
          int yc = getHeight()/2;
        int xc = getWidth()/2;
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.translate(xc, yc);
        
        g2d.setColor(Color.DARK_GRAY);
        g2d.drawString("Testu bat idazi dut", TOP_ALIGNMENT, TOP_ALIGNMENT);

        g2d.setColor(Color.RED);
         MyPointMarrazgarria p1 = new MyPointMarrazgarria((int) (Math.random() * 50), (int) (Math.random() * 50));
         
         p1.marraztu(g2d);
         
         p1.marraztu(g2d);   
             
         g2d.setColor(Color.BLUE);
         MyPointMarrazgarria p2 = new MyPointMarrazgarria((int) (Math.random() * 50), (int) (Math.random() * 50));
         p2.marraztu(g2d);    
         g2d.setColor(Color.GREEN);
         MyPointMarrazgarria p3 = new MyPointMarrazgarria((int) (Math.random() * 50), (int) (Math.random() * 50));
         p3.marraztu(g2d);   
        g2d.setColor(Color.BLACK);
        g2d.drawLine(xc,yc , xc/2, 0);
        g2d.drawLine(xc, yc, xc, yc);
    }

    public GUIBatenMarraztu() {
          System.out.println("JFramea sortua, baina momentuz ez dago ikusgai.");       
    }

    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("JFramearen Izenburua");
        frame.add(new GUIBatenMarraztu());
        frame.setSize(600, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    

    }
}
    
