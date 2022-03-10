package exekutagarriak;

import java.util.Scanner;
import model.SQLiteaKudeatu;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rodriguez.markel
 */
public class MenuNagusia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //SQLiteaKudeatu.connect();
        SQLiteaKudeatu app = new SQLiteaKudeatu();
         Scanner sc = new Scanner(System.in);
       int aukera = 0;
        do {
            System.out.println();
            System.out.println("LIBURUTEGIA");
            System.out.println("====================================");
            System.out.println("1.- Liburuen zerrenda sinplea ikusi");
            System.out.println("2.- Liburuen datu guztiak ikusi");
            System.out.println("3.- Liburuen zerrenda prezioaren grafikoarekin");
            System.out.println("4.- Liburu zaharrena bilatu");
            System.out.println("5.- Irten");
            System.out.println("");
            System.out.print("Aukeratu zenbaki bat: ");
            aukera = sc.nextInt();
            System.out.println("");
            switch (aukera) {
                case 1:
                    app.selectAll();
                    break;
                case 2:
                    app.insert(euskaraz, gazteleraz);
                    break;
                case 3:
                    app.delete(aukera);
                    break;
                case 4:
                    app.update(aukera, euskaraz, gazteleraz);
                    break;
                case 5:
                    System.out.println("Eskerrik asko programa hau erabiltzearren.");
                    break;
                default:
                    System.out.println("Aukera okerra. Saiatu berriz.");
            }
        } while (aukera != 5);
    }
    
    
}
