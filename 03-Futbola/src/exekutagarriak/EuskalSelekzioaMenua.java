/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import static exekutagarriak.EuskalSelekzioa.azkenId;
import model.Entrenador;
import model.Futbolista;
import model.IntegranteSeleccion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import java.util.Scanner;
import static model.Demarkazioa.DEF;
import static model.Demarkazioa.DEL;
import static model.Demarkazioa.MED;
import static model.Demarkazioa.POR;
import model.Masajista;

/**
 *
 * @author rodriguez.markel
 */
public class EuskalSelekzioaMenua {

    public static int azkenId = 0;
    public static ArrayList<IntegranteSeleccion> selekzioa = new ArrayList<>();
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        selekzioaSortu();
        Scanner in = new Scanner(System.in);
        int aukera = 0;
        do {
            System.out.println();
            System.out.println("MENUA");
            System.out.println("====================================");
            System.out.println("1. Partaideen datuak ikusi");
            System.out.println("2. Partaideen datuak ikusi taldekatuta");
            System.out.println("3. Futbolariak alfabetikoki inprimatu");
            System.out.println("4. Aldaketa");
            System.out.println("5. Bilatu abizenetik");
            System.out.println("5. Bilatu abizenetik");
            System.out.println("z. Irten");
            System.out.print("Aukeratu zenbaki bat: ");
            aukera = in.nextInt();
            switch (aukera) {
                case 1:
                    datuGuztiak();
                    break;
                case 2:
                    datuakTaldekatuta();
                    break;
                case 3:
                    partaideakOrdenatu();
                    break;
                case 4:
                    posizioaAldatu();
                    break;
                case 5:
                    System.out.println("Eskerrik asko programa hau erabiltzeagatik.");
                    break;
                default:
                    System.out.println("Aukera okerra. Saiatu berriz.");
            }

        } while (aukera != 5);
    }

    public static void selekzioaSortu() {
        selekzioa.add(new Futbolista(1, POR, azkenId++, "Aitor", "Fernandez", 30));
        selekzioa.add(new Futbolista(2, DEF, azkenId++, "Unai", "Bustinza", 29));
        selekzioa.add(new Futbolista(3, DEF, azkenId++, "Mikel", "Balenziaga", 33));
        selekzioa.add(new Futbolista(4, MED, azkenId++, "Asier", "Illaramendi", 31));
        selekzioa.add(new Futbolista(5, DEF, azkenId++, "Iñigo", "Martinez", 30));
        selekzioa.add(new Futbolista(6, MED, azkenId++, "Mikel", "San Jose", 32));
        selekzioa.add(new Futbolista(7, DEF, azkenId++, "Gaizka", "Larrazabal", 24));
        selekzioa.add(new Futbolista(8, MED, azkenId++, "Manu", "Garcia", 35));
        selekzioa.add(new Futbolista(9, DEL, azkenId++, "Aritz", "Aduriz", 40));
        selekzioa.add(new Futbolista(10, MED, azkenId++, "Javier", "Eraso", 31));
        selekzioa.add(new Futbolista(11, DEL, azkenId++, "Asier", "Villalibre", 24));
        selekzioa.add(new Futbolista(12, DEF, azkenId++, "Aihen", "Muñoz", 24));
        selekzioa.add(new Futbolista(13, POR, azkenId++, "Iago", "Herrerin", 34));
        selekzioa.add(new Futbolista(14, DEF, azkenId++, "Aritz", "Elustondo", 27));
        selekzioa.add(new Futbolista(15, DEF, azkenId++, "Jesus", "Areso", 22));
        selekzioa.add(new Futbolista(16, DEL, azkenId++, "Iñigo", "Vicente", 24));
        selekzioa.add(new Futbolista(17, DEF, azkenId++, "Daniel", "Vivian", 30));
        selekzioa.add(new Masajista("Fisioterapeuta", 12, azkenId++, "Iñaki", "Sertxiberrieta", 42));
        selekzioa.add(new Masajista("Medikua", 14, azkenId++, "Ander", "Etxeburu", 34));
        selekzioa.add(new Entrenador("10FH", azkenId++, "Javier", "Clemente", 71));
    }

    public static void datuGuztiak() {
        int futbolistak = 0;
        int entrenatzaileak = 0;
        int masajistak = 0;
        Object partaideak;
        System.out.println("EUSKAL SELEKZIOKO PARTAIDEAK:");
        System.out.println("----------------------------");
        for (int i = 0; i < selekzioa.size(); i++) {
            System.out.println(selekzioa.get(i));

            partaideak = selekzioa.get(i);
            if (partaideak instanceof Futbolista) {
                futbolistak++;

            }
            else if (partaideak instanceof Entrenador) {
                entrenatzaileak++;

            }
            else{
                masajistak++;

            }

        }
        System.out.println("--------------------------------------------------------------------");
        System.out.println("GUZTIRA: " + futbolistak + " futbolari, " + entrenatzaileak + " entrenatzaile, " + masajistak + "  masajista");
    }

    public static void datuakTaldekatuta() {
        int futbolistak = 0;
        int entrenatzaileak = 0;
        int masajistak = 0;
        System.out.println("EUSKAL SELEKZIOKO PARTAIDEAK TALDEKA:");
        System.out.println("----------------------------");
        System.out.println("FUTBOLARIAK");
                System.out.println("------------");
        for (int i = 0; i < selekzioa.size(); i++) {
            
            if(selekzioa.get(i) instanceof Futbolista) {
                
                System.out.println(selekzioa.get(i));
                futbolistak++;
            }
        }
        System.out.println("GUZTIRA: " + futbolistak + " futbolari");
        System.out.println("");
            System.out.println("ENTRENATZAILEAK");
                System.out.println("------------");
            for (int i = 0; i < selekzioa.size(); i++) {
             
            if (selekzioa.get(i) instanceof Entrenador) {
               
                System.out.println(selekzioa.get(i));
                entrenatzaileak++;
            }
            }
            System.out.println("GUZTIRA: " + entrenatzaileak + " entrenatzaile");
            System.out.println("");
            System.out.println("MASAJISTAK");
                System.out.println("------------");
            for (int i = 0; i < selekzioa.size(); i++) {
            
                
            if(selekzioa.get(i) instanceof Masajista){
               
                System.out.println(selekzioa.get(i));
                masajistak++;
            }

        }
            System.out.println("GUZTIRA: " + masajistak + " masajista");
        
    }
     public static void partaideakOrdenatu() {
         Collections.sort(selekzioa, new Comparator<IntegranteSeleccion>(){
             public int compare(IntegranteSeleccion i1, IntegranteSeleccion i2){
                 return i1.getApellidos().compareTo(i2.getApellidos());
                 
             }
         
     });
         for(IntegranteSeleccion temp : selekzioa){
             System.out.println(temp);
         }
     }
     public static void posizioaAldatu() {
         Scanner in = new Scanner(System.in);
         System.out.println("Nor aldatu nahi duzu postuz? (idatzi id-a)");
         azkenId = in.nextInt();
         for (int i = 0; i < selekzioa.size(); i++) {
             if(selekzioa.get(i) == selekzioa.get(azkenId) && selekzioa.get(i) instanceof Futbolista){
                 
                 
                 
             }
             else {
                 System.out.println("Ez da jokalaria");
             }
         }
     }
     
    
}
