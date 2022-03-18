/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;



/**
 *
 * @author rodriguez.markel
 */
public class Model {
    
    private String fitxategia = "Hiztegia.csv";
    
    public void terminoakJaso(String edukia) throws IOException{
        PrintWriter terminoa = null;
       
        try {
             terminoa = new PrintWriter(new FileWriter(fitxategia));
             
             terminoa.write(edukia, 0, edukia.length());
            
        }
        catch (IOException x) {
      System.err.println(x);
    }
        
    }
    public String terminoakGorde() throws FileNotFoundException, IOException{
        BufferedReader hiztegia = null;
       String l;
        try {
            hiztegia = new BufferedReader(new FileReader(fitxategia));
            while ((l = hiztegia.readLine()) != null) {
               return l;
            }
        }
        finally {
            if (hiztegia != null) {
                hiztegia.close();
            }
        }
        
         return l;   
    }
}
