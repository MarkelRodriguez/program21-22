/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import model.Kutxa;
import model.Puntua;

/**
 *
 * @author rodriguez.markel
 */
public class Test6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Kutxa[] kutxak = new Kutxa[10];
        
        for(int i = 0; i < kutxak.length; i++){
            System.out.println("sartu kutxaren erpin baten x balioa:");
            int x1  = in.nextInt();
            System.out.println("sartu kutxaren erpin baten y balioa:");
            int y1  = in.nextInt();
            System.out.println("sartu kutxaren beste erpinaren x balioa:");
            int x2  = in.nextInt();
            System.out.println("sartu kutxaren beste erpinaren y balioa:");
            int y2  = in.nextInt();
            System.out.println("sartu kutxaren altuera:");
            int altuera  = in.nextInt();
            kutxak[i] = new Kutxa(new Puntua(x1,y1),new Puntua(x2,y2), altuera);
            
            
        }
        System.out.printf("%-3s %40s %20s %10s \n","Erpinak", "Altuera","Ertzen Luzeera", "Bolumena");
        for (int i = 0; i < 100; i++) {
            System.out.print("=");
        }
        System.out.println("");
        for (int i = 0; i < kutxak.length; i++) {

            if (kutxak[i] != null) {
                System.out.printf("%-3s %3s %20s %10s \n", Arrays.toString(kutxak[i].getLauErpinenArraya()), kutxak[i].getAltuera(),kutxak[i].getErtzenLuzeera(),kutxak[i].getBolumena());
            }
        }
        
    }
    
}
