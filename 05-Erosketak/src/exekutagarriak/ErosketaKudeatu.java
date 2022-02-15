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
import model.bezerointerfazea.Enpresak;
import model.bezerointerfazea.Pertsona;

/**
 *
 * @author rodriguez.markel
 */
public class ErosketaKudeatu {

    /**
     * @param args the command line arguments
     */
    private ArrayList<Bezeroak> kontaktuak= new ArrayList<>();
    private ArrayList<Produktua> produktuKatalogoa = new ArrayList<>();
    private ArrayList<Erosketak> erosketenZerrenda = new ArrayList<>();
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public  void intialize(){
        String [] emailak = {"idazkaria@uni.eus","zuzendaria@uni.eus"};
        kontaktuak.add(new Pertsona(1,"Karlos","Argiñano","Hondartza Pasialekua z/g ZARAUTZ","kargi@zarautz.eus"));
        kontaktuak.add(new Pertsona(2,"Martin","Berasategui","Mirakontxa z/g DONOSTIA","mbera@donostia.eus"));
        kontaktuak.add(new Enpresak(3,"Uni","Eibar-Ermua","Otaola Etorbidea 29. EIBAR",emailak));
        
        produktuKatalogoa.add(new Produktua("C01","Toshiba Satellite Pro",450));
        produktuKatalogoa.add(new Produktua("C02","HP Pavilon",600));
        produktuKatalogoa.add(new Produktua("T01","Samsung Galaxy",210));
        produktuKatalogoa.add(new Produktua("T02","iPhone XX",1300));
        

        erosketenZerrenda.add(new Erosketak("E18-02",kontaktuak.get(0),6750));
        
        
        
    }
    
}
