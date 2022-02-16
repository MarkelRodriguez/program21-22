/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import java.util.ArrayList;
import java.util.Scanner;
import model.EpekakoErosketa;
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
        

        erosketenZerrenda.add(new Erosketak("E18-01","2018-09-25",kontaktuak.get(1),3630));
        erosketenZerrenda.add(new Erosketak("E18-02","2018-09-24",kontaktuak.get(0),6750));
        erosketenZerrenda.add(new Erosketak("E19-01","2019-01-09",kontaktuak.get(0),660));
        erosketenZerrenda.add(new EpekakoErosketa(300,"E19-02","2019-02-09",kontaktuak.get(0),660));
        erosketenZerrenda.add(new Erosketak("E21-01","2021-01-17",kontaktuak.get(2),15000));
        erosketenZerrenda.add(new Erosketak("E22-01","2022-02-11",kontaktuak.get(0),500));
        
        
    }
    public int menuNagusiaErakutsi(){
        Scanner in = new Scanner(System.in);
        int aukera = 0;
        do {
            System.out.println();
            System.out.println("MENUA");
            System.out.println("====================================");
            System.out.println("1. create(Datuak gehitu)");
            System.out.println("2. read(Ikusi)");
            System.out.println("3. update(Aldatu)");
            System.out.println("4. delete(Ezabatu)");
            System.out.println("5. Irten");
            System.out.print("Aukeratu zenbaki bat: ");
            aukera = in.nextInt();
            switch (aukera) {
                case 1:
                    create();
                    break;
                case 2:
                    read();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    System.out.println("Eskerrik asko programa hau erabiltzeagatik.");
                    break;
                default:
                    System.out.println("Aukera okerra. Saiatu berriz.");
            }

        } while (aukera != 5);
        return aukera;
    }
    public void create(){
        Scanner in = new Scanner(System.in);
        System.out.print("Sartu erosketa kodea: ");
        String kodea  = in.next();
        System.out.print("Sartu bezero kodea: ");
        int bezeroKodea = in.nextInt();
        System.out.print("Guztira ordaindu beharrekoa: ");
        double guztira  = in.nextInt();
        System.out.print("Epekako erosketa da? (B/E) ");
        String epeka  = in.next().toUpperCase();
        
         switch (epeka) {
            case "E":
                erosketenZerrenda.add(new Erosketak(kodea ," ",kontaktuak.get(bezeroKodea),guztira));
                break;
            case "B":
                System.out.print("Sartu zenbateko kuota: ");
                double kuota  = in.nextInt();
                erosketenZerrenda.add(new EpekakoErosketa(kuota,kodea," ",kontaktuak.get(bezeroKodea),guztira));
                break;
            default:
                System.out.println("Aukera okerra. Saiatu berriz.");
                
        }
    }
    public int read(){
        Scanner in = new Scanner(System.in);
        int aukera = 0;
        do {
            System.out.println();
            System.out.println("MENUA");
            System.out.println("====================================");
            System.out.println("1. Erosketen zerrenda");
            System.out.println("2.  Fakturazio osoa");
            System.out.println("3. Bezerorik onena");
            System.out.println("4. Helbidea bilatu");
            System.out.println("5.  Epekako erosketen txostena");
            System.out.println("20. Irten");
            System.out.print("Aukeratu zenbaki bat: ");
            aukera = in.nextInt();
            switch (aukera) {
                case 1:
                    create();
                    break;
                case 2:
                    read();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    delete();
                    break;
                case 20:
                    System.out.println("Eskerrik asko programa hau erabiltzeagatik.");
                    break;
                default:
                    System.out.println("Aukera okerra. Saiatu berriz.");
            }

        } while (aukera != 5);
        return aukera;
    
    }
    public void upadate(){
        Scanner in = new Scanner(System.in);
        System.out.print("Sartu aldatu nahi duzun erosketaren kodea: ");
        String kodea  = in.next();
        
        for (int i = 0 ; i <= erosketenZerrenda.size();i++ ){
            if(erosketenZerrenda.get(i).getStrKodea() == kodea){
                
            }
        }
    }
}
