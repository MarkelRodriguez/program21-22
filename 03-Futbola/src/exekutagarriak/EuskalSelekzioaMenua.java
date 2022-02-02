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
import java.util.Scanner;
import static model.Demarkazioa.DEF;
import static model.Demarkazioa.DEL;
import static model.Demarkazioa.MED;
import static model.Demarkazioa.POR;

import model.Masajista;

/** Programa honetan Euskal Selekzioaren datuekin egingo dugu lan.
 *  Iturria: https://es.wikipedia.org/wiki/Selecci%C3%B3n_de_f%C3%BAtbol_de_Euskadi#Plantilla
 *
 *  Programa hau selekzioko partaideen datuak kargatzen hasiko da. 
 *  Normalena da, datu hauek fitxategi edo datu-base batetik irakurtzea baina 
 *  oraindik hori ez dakigunez egiten guk programan bertan, metodo baten barruan idatziko ditugu.
 * 
 *  Gero, horrelako menu bat agertuko zaigu:
 * 
 *  **********************************************************
 *  *    EUSKAL SELEKZIOA
 *  *  ----------------------------------
 *  *  1. Partaideen datuak ikusi (Goiburuko egoki eta laburpen azken lerro batekin (Futbolistak: 23 Entren...)
 *  *  2. Partaideen datuak ikusi taldekatuta
 *  *  3. Futbolariak alfabetikoki inprimatu
 *  *  4. Aldaketa ( Sartu zaitez zu beste partaide baten ordez. Horretarako ArrayList-en set metodoa erabiliz)
 *  *  5. Bilatu abizenetik (String-en startsWith() metodoa erabiliz adibidez)
 *  *  z. Irten
 * 
 *  *  Aukeratu zenbaki bat:
 * 
 *  **************************************************************
 */
public class EuskalSelekzioaMenua {
    
    public static int azkenId = 0; 
    public static ArrayList<IntegranteSeleccion> selekzioa = new ArrayList<>(); 
       public static ArrayList<Futbolista> futbolista = new ArrayList<>();
    public static void main(String[] args) {
        selekzioOsoaSortu();
               Scanner in = new Scanner(System.in);
        int aukera = 0;
        
        do {
            System.out.println();
            System.out.println("EUSKAL SELEKZIOA");
            System.out.println("====================================");
            System.out.println("1. Partaideen datuak ikusi");
            System.out.println("2. Partaideen datuak ikusi taldekatuta");
            System.out.println("3. Futbolariak alfabetikoki inprimatu");
            System.out.println("4. Aldaketa ");
            System.out.println("5. Bilatu abizenetik");
            System.out.println("6. Irten");
            System.out.println("");
            System.out.print("Aukeratu zenbaki bat: ");
            aukera = in.nextInt();
            switch (aukera) {
                case 1:
                    datuGuztiak();
                    break;
                case 2:
                    
                    break;
                case 3:
                    System.out.println("Hirugarren aukera aukeratu duzu.");
                    break;
                case 4:
                    System.out.println("Laugarren aukera aukeratu duzu.");
                    break;
                case 5:
                    System.out.println("Eskerrik asko programa hau erabiltzeagatik.");
                    break;
                default:
                    System.out.println("Aukera okerra. Saiatu berriz.");
            }
            
        } while (aukera != 5);
    }
      public static void datuGuztiak(){
          int futbolariak = 0;
          int entrenatzaileak = 0;
          int masajistak = 0;
          Object partaideak;
          System.out.println("Selekzioko Partaideak");
          System.out.println("====================================");
          
           
          for (int i = 0; i < selekzioa.size(); i++){
              partaideak = selekzioa.get(i);
              System.out.println(partaideak);
              if(partaideak instanceof Futbolista){
                  futbolariak++;
              
                }
              if(partaideak instanceof Entrenador){
                  entrenatzaileak++;
              
                }
              if(partaideak instanceof Masajista){
                  masajistak++;
              
                }
            }
          
          
         
          System.out.println("====================================");
          System.out.println("GUZTIRA: " + futbolariak + " futbolari, " +  entrenatzaileak + " entrenatzaile, " + masajistak + " masajista ");
      }
     public static void selekzioOsoaSortu() {
        
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
     public static void futbolistak() {
         futbolista.add(new Futbolista(1, POR, azkenId++, "Aitor", "Fernandez", 30));
         futbolista.add(new Futbolista(2, DEF, azkenId++, "Unai", "Bustinza", 29));
        futbolista.add(new Futbolista(3, DEF, azkenId++, "Mikel", "Balenziaga", 33));
        futbolista.add(new Futbolista(4, MED, azkenId++, "Asier", "Illaramendi", 31));
        futbolista.add(new Futbolista(5, DEF, azkenId++, "Iñigo", "Martinez", 30));
        futbolista.add(new Futbolista(6, MED, azkenId++, "Mikel", "San Jose", 32));
        futbolista.add(new Futbolista(7, DEF, azkenId++, "Gaizka", "Larrazabal", 24));
        futbolista.add(new Futbolista(8, MED, azkenId++, "Manu", "Garcia", 35));
        futbolista.add(new Futbolista(9, DEL, azkenId++, "Aritz", "Aduriz", 40));
        futbolista.add(new Futbolista(10, MED, azkenId++, "Javier", "Eraso", 31));
        futbolista.add(new Futbolista(11, DEL, azkenId++, "Asier", "Villalibre", 24));
        futbolista.add(new Futbolista(12, DEF, azkenId++, "Aihen", "Muñoz", 24));
        futbolista.add(new Futbolista(13, POR, azkenId++, "Iago", "Herrerin", 34));
        futbolista.add(new Futbolista(14, DEF, azkenId++, "Aritz", "Elustondo", 27));
        futbolista.add(new Futbolista(15, DEF, azkenId++, "Jesus", "Areso", 22));
        futbolista.add(new Futbolista(16, DEL, azkenId++, "Iñigo", "Vicente", 24));
        futbolista.add(new Futbolista(17, DEF, azkenId++, "Daniel", "Vivian", 30));
     }
}