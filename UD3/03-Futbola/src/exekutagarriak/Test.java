/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;


import model.Demarkazioa;
import model.Entrenador;
import model.Futbolista;
import model.Masajista;

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
        Futbolista f1 = new Futbolista(10,Demarkazioa.MED,234,"Iker","Muniain",34);
        Entrenador e1 = new Entrenador();
        Masajista m1 = new Masajista();
        System.out.println(f1);
        
        f1.entrenar();
        e1.dirigirPartido();
        m1.darMasaje();
    }
    
}
