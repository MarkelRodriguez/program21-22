/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg01.mypointetab;

import model.MyPoint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
/**
 *
 * @author rodriguez.markel
 */
public class TestMyPoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("a) Hiru puntu sortu:");
        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(2, 1);
        MyPoint p3 = new MyPoint(4, 0);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println();
        System.out.println("b) Distantziak koordenatu-jatorriarekiko:");
        System.out.println(p1.distance());
        System.out.println(p2.distance());
        System.out.println(p3.distance());
        System.out.println();
        System.out.println("c) Distantziak euren artean:");
        System.out.println("p1-p2: " + p1.distance(p2));
        System.out.println("p1-p3: " + p3.distance(p1));
        System.out.println("p2-p3: " + p2.distance(p3));
        System.out.println();
        System.out.println("d) Sortu 10 puntuko array bat. Eta automatikoki bete:");
        MyPoint[] puntuenArraya = new MyPoint[10];
        int x = 1;
        int y = 1 ;
        for(int i = 0; i< puntuenArraya.length;i++){
            puntuenArraya[i] = new MyPoint(x, y);
            x++;
            y++;
            
        }
        System.out.println(Arrays.toString(puntuenArraya));
        System.out.println();
        
        System.out.println("e) Sortu 100 puntuko arrayLista:");
        ArrayList <MyPoint> points = new ArrayList();
        x = 0;
        y = 0 ;
        for(int i = 0; i< 100;i++){
             points.add(new MyPoint(x,y));
            x++;
            y++;
        }
        System.out.println(points);
        System.out.println();
        System.out.println("f) Sortu ausazko 5 puntuko sorta (0-9 tartean).");
        ArrayList <MyPoint> random = new ArrayList();
        Random xy = new Random();
        
        for(int i = 0; i< 5;i++){
           random.add(new MyPoint(x,y));
           x = xy.nextInt(9);
           y = xy.nextInt(9);
            
            
        }
        System.out.println(random);
    }

}
