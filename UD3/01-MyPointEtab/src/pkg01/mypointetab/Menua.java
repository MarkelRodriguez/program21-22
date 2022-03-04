/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01.mypointetab;

import java.util.Scanner;
import model.MyCircle;
import model.MyPoint;
import model.MyRectangle;
import model.MyTriangle;

/**
 *
 * @author rodriguez.markel
 */
public class Menua {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int aukerak;
        do {
            System.out.println();
            System.out.println("MENUA");
            System.out.println("====================================");
            System.out.println("1.- Distantzia puntuekin");
            System.out.println("2.- Zirkulu baten azalera");
            System.out.println("3.- Triangelu mota");
            System.out.println("4.- Rectangeluaren perimetroa");
            System.out.println("5.- Irten");
            System.out.println("");
            System.out.print("Aukeratu zenbaki bat: ");
            aukerak = in.nextInt();
            switch (aukerak) {
                case 1:
                    int x1 = 0;
                    int y1 = 0;
                    int x2 = 0;
                    int y2 = 0;

                    System.out.println("Sartu 1. puntuaren balioak: ");
                    x1 = in.nextInt();
                    y1 = in.nextInt();
                    MyPoint p1 = new MyPoint(x1, y1);

                    System.out.println("Sartu 2. puntuaren balioak: ");
                    x2 = in.nextInt();
                    y2 = in.nextInt();
                    MyPoint p2 = new MyPoint(x2, y2);
                    System.out.println("Puntuen arteko distantzia: " + p1.distance(p2));
                    break;

                case 2:
                    int x = 0;
                    int y = 0;
                    int radioa = 0;
                    System.out.println("Sartu zirkuluaren zentroa eta erradioa: ");
                    x = in.nextInt();
                    y = in.nextInt();
                    radioa = in.nextInt();
                    MyCircle zirkulu1 = new MyCircle(x, y, radioa);
                    System.out.println("Zirkuluaren azalera: " + zirkulu1.getArea());
                    break;
                case 3:
                    int x3 = 0;
                    int y3 = 0;
                    System.out.println("Sartu 1. bertizearen balioak: ");
                    x1 = in.nextInt();
                    y1 = in.nextInt();
                    p1 = new MyPoint(x1, y1);

                    System.out.println("Sartu 2. bertizearen balioak: ");
                    x2 = in.nextInt();
                    y2 = in.nextInt();
                    p2 = new MyPoint(x2, y2);
                    System.out.println("Sartu 3. bertizearen balioak: ");
                    x3 = in.nextInt();
                    y3 = in.nextInt();
                    MyPoint p3 = new MyPoint(x3, y3);
                    MyTriangle tri1 = new MyTriangle(p1, p2, p3);
                    System.out.println("Triangelua " + tri1.getType() + " da");

                    break;
                case 4:

                    System.out.println("Sartu diagonalaren 1. puntuaren balioak:");
                    x1 = in.nextInt();
                    y1 = in.nextInt();
                    p1 = new MyPoint(x1, y1);

                    System.out.println("Sartu diagonalaren 2. puntuaren balioak:");
                    x2 = in.nextInt();
                    y2 = in.nextInt();
                    p2 = new MyPoint(x2, y2);
                    MyRectangle rec1 = new MyRectangle(p1, p2);
                    System.out.println("Rectangeluaren perimetroa:" + rec1.getPerimetroa());
                    break;

                case 5:
                    System.out.println("Eskerrik asko programa hau erabiltzeagatik.");
                    break;
                default:
                    System.out.println("Aukera okerra. Saiatu berriz.");
            }

        } while (aukerak != 5);

    }

}
