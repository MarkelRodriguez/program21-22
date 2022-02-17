/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import java.util.ArrayList;
import java.util.Scanner;
import model.EpekakoErosketa;
import model.Erosketa;
import model.Produktua;
import model.bezerointerfazea.Enpresa;
import model.bezerointerfazea.Pertsona;
import model.bezerointerfazea.Bezeroa;

/**
 *
 * @author rodriguez.markel
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        
        Erosketa e2 = new Erosketa("E18-01","2018-09-25",null,null,null,3630);
        System.out.println(e2);
         ArrayList<Erosketa> erosketenZerrenda = new ArrayList<>();
         ArrayList<Bezeroa> kontaktuak= new ArrayList<>();
         ArrayList<Produktua> produktuKatalogoa = new ArrayList<>();
        String [] emailak = {"idazkaria@uni.eus","zuzendaria@uni.eus"};
        kontaktuak.add(new Pertsona(1,"Karlos","Argiñano","Hondartza Pasialekua z/g ZARAUTZ","kargi@zarautz.eus"));
        kontaktuak.add(new Pertsona(2,"Martin","Berasategui","Mirakontxa z/g DONOSTIA","mbera@donostia.eus"));
        kontaktuak.add(new Enpresa(3,"Uni","Eibar-Ermua","Otaola Etorbidea 29. EIBAR",emailak));
        
        produktuKatalogoa.add(new Produktua("C01","Toshiba Satellite Pro",450));
        produktuKatalogoa.add(new Produktua("C02","HP Pavilon",600));
        produktuKatalogoa.add(new Produktua("T01","Samsung Galaxy",210));
        produktuKatalogoa.add(new Produktua("T02","iPhone XX",1300));
        

        erosketenZerrenda.add(new Erosketa("E18-01","2018-09-25",kontaktuak.get(1),3630));
        erosketenZerrenda.add(new Erosketa("E18-02","2018-09-24",kontaktuak.get(0),6750));
        erosketenZerrenda.add(new Erosketa("E19-01","2019-01-09",kontaktuak.get(0),660));
        erosketenZerrenda.add(new EpekakoErosketa(300,"E19-02","2019-02-09",kontaktuak.get(0),3250));
        erosketenZerrenda.add(new Erosketa("E21-01","2021-01-17",kontaktuak.get(2),15000));
        erosketenZerrenda.add(new Erosketa("E22-01","2022-02-11",kontaktuak.get(0),500));
       /** 
        double osoa = 0;
        for (int i = 0 ; i < erosketenZerrenda.size();i++ ){
            osoa = osoa + erosketenZerrenda.get(i).getGuztira();
        }
        System.out.println("Fakturazio osoa: " + osoa);
        */
        
        Scanner in = new Scanner(System.in);
        System.out.print("Sartu ezabatu nahi duzun erosketaren kodea: ");
        String kodea  = in.next();
        
        for (int i = 0 ; i < erosketenZerrenda.size();i++ ){
            if(erosketenZerrenda.get(i).getStrKodea().equals(kodea)){
                erosketenZerrenda.remove(i);
            }
            System.out.println(erosketenZerrenda.get(i));
        }
        
        for (int i = 0 ; i < erosketenZerrenda.size();i++ ){
            
              if (erosketenZerrenda.get(i).getGuztira() > erosketenZerrenda.get(i).getGuztira() )  {
                  System.out.println(erosketenZerrenda.get(i).getBezeroa());
              }
            
        }
    }    
        
        
    
}
