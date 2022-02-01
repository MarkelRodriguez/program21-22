/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import static exekutagarriak.EuskalSelekzioa.selekzioOsoaSortu;
import model.Entrenador;
import model.Futbolista;
import model.IntegranteSeleccion;

import java.util.ArrayList;
import java.util.Scanner;
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
       
    public static void main(String[] args) {
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
          System.out.println("Selekzioko Partaideak");
          System.out.println("====================================");
          selekzioOsoaSortu();
          int futbolariak = 0  ;
          Futbolista f1 = new Futbolista();
          int entrenatzaileak =0;
          int masajistak = 0;
          for (int i = 0; i < selekzioa.size(); i++){
              if (selekzioa.get(i).toString().equals(f1.toString())){
                  futbolariak++;
              } else if(selekzioa.get(i) == new Entrenador()) {
                  entrenatzaileak++;
              }
              else{
                  masajistak++;
              }
          }
          System.out.println("====================================");
          System.out.println("Guztira: " + futbolariak + "futbolari, " + entrenatzaileak + "entrenatzaile, " + masajistak + "masajista");
      }
    
}