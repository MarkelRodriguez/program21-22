/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import java.util.ArrayList;
import static model.Demarkazioa.DEF;
import static model.Demarkazioa.DEL;
import static model.Demarkazioa.MED;
import static model.Demarkazioa.POR;
import model.Entrenador;
import model.Futbolista;
import model.IntegranteSeleccion;
import model.Masajista;

/**
 *
 * @author rodriguez.markel
 */
public class EuskalSelekzioa {

    public static int azkenId = 0;
    private static ArrayList<IntegranteSeleccion> selekzioa = new ArrayList();

    /**
     * Programa honek metodo desberdinei deituko die banan banan. Beharbada ez
     * diozu koherentzia handirik topatuko programa osoari. Ariketaren helburua
     * da beste pakete bateko klase hierarkia erabiltzen trebatzea.
     *
     */
    public static void main(String[] args) {

        futbolariBat();
        bestePartaideBatzukSortu();
        selekzioOsoaSortu();
        int ezabatzekoIda = 4;
        if (partaideaEzabatu(ezabatzekoIda)) {
            System.out.println(ezabatzekoIda + " id-a duen partaidea ezabatu da.");
        }
    }

    /**
     * Metodo honek "Asier Villalibre"ri dagokion Futbolista objektua sortu eta
     * formatu honetan inprimatzen du: "Futbolista{id=1, nombre=Asier,
     * apellidos=Villalibre, edad=23, dorsal=11, demarcacion=DEL}" Hori lortzeko
     * Futbolista klasean toString() metodoa birdefinitu beharko duzu. Gainera,
     * Web orrian id-rik ez dagoenez, automatikoki kalkulatzea erabaki dugu.
     * Horretarako, kontadore bat (Adibidez, azkenIda izeneko klase atributu
     * bat) erabili dezakezu partaide bat sortzen den bakoitzean handituko dena.
     * Amaitzeko, Villalibre entrenatzen hasiko da.
     */
    public static void futbolariBat() {
        Futbolista f1 = new Futbolista(11, DEL, azkenId++, "Asier", "Villalibre", 24);
        f1.toString();
        f1.entrenar();

    }

    /**
     * Metodo honek hiru objektu berri sortuko ditu. Pertsona hauei dagokienak:
     * - Javier Clemente - Iñaki Sertxiberrieta - Ander Etxeburu Zein klaseko
     * objektua izan behar du bakoitzak?
     *
     * Objektu bakoitza sortu ondoren, bere datuak inprimatu eta kontzentratu
     * eta bidaiatuko dute
     */
    public static void bestePartaideBatzukSortu() {
        Masajista m1 = new Masajista("Fisioterapeuta", 12, azkenId++, "Iñaki", "Sertxiberrieta", 42);
        Masajista m2 = new Masajista("Medikua", 14, azkenId++, "Ander", "Etxeburu", 34);
        Entrenador e1 = new Entrenador("10FH", azkenId++, "Javier", "Clemente", 71);
        System.out.println(m1);
        m1.concentrarse();
        m1.viajar();
        System.out.println(m2);
        m2.concentrarse();
        m2.viajar();
        System.out.println(e1);
        e1.concentrarse();
        e1.viajar();

    }

    /**
     * Selekzio osoaren datuak gorde "selekzioa" deitutako IntegranteSeleccion
     * klaseko ArrayList estatiko baten.
     *
     */
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
        System.out.println(selekzioa);
    }

    /**
     * ArrayListetik objektu bat ezabatzen du. Aurkitzen ez badu false itzuliko
     * du
     *
     * @param id Ezabatu nahi den partaidearen ida
     * @return
     */
    public static boolean partaideaEzabatu(int id) {
        for (id = 0; id <= selekzioa.size(); id++) {
          if(id != selekzioa.get(id).getId()){
          } else {
              selekzioa.remove(id);
            }  
            
            
        }
        System.out.println(selekzioa);
        return false;
    }
}
