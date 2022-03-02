/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import model.Author;
import model.Book;
import model.Komikia;

/**
 *
 * @author rodriguez.markel
 */
public class TestArgitaratu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Author i1 = new Author("J.K.Rowling", 'm');
       Book b1 = new Book("Harry Potter", i1, 99.99, 2850);
       Komikia k1 = new Komikia("Mortadelo y Filemón", i1, 19.95, 75, true);
       
       b1.argitaratu();
       k1.argitaratu();
       
        System.out.println(Book.getArgitaratutakoLiburuak() + " liburu argitaratu dira");
    }
    
}
