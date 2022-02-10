/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import java.util.ArrayList;
import model.Erosketak;
import model.Produktua;
import model.bezerointerfazea.Bezeroak;
import model.bezerointerfazea.Pertsona;

/**
 *
 * @author rodriguez.markel
 */
public class ObjetuBanaSortu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Bezeroak karlos = new Pertsona(1,"Karlos","Argiñano","Hondartza Pasialekua z/g ZARAUTZ","kargi@uni.eus");
        System.out.println("karlos => " + karlos);
        
        Produktua toshiba = new Produktua("C01","Toshiba Satellite Pro",450);
        System.out.println("toshiba => " + toshiba);    
        
        
        ArrayList<Produktua> erosketaHonetakoproduktuak = new ArrayList<>();
        erosketaHonetakoproduktuak.add(toshiba);
        ArrayList<Integer> erosketaHonetakounitateak = new ArrayList<>();
        erosketaHonetakounitateak.add(15);
        Erosketak gaurkoErosketa = new Erosketak("E18-02","2018-10-24",karlos,
                            erosketaHonetakoproduktuak,erosketaHonetakounitateak,6750);
        System.out.println("gaurkoErosketa =>"+gaurkoErosketa);
        System.out.println("Orain formato luzean:");
        System.out.println(gaurkoErosketa.toStringLuzea());
        
        if (gaurkoErosketa.guztiraEgiaztatu())
            System.out.println("Datu zuzenak.");
        else
            System.out.println("'guztira' atributua ez dator bat produktuen zerrendak dioenarekin.");
    }
    
}
