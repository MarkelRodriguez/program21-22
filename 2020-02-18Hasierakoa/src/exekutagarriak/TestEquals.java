/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import model.Author;
import model.Book;

/**
 *
 * @author rodriguez.markel
 */
public class TestEquals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Author i1 = new Author("J.K.Rowling", 'm');
        Author i2 = new Author("J.K.Rowling", 'f');
        Book b1 = new Book("Harry Potte", i1, 99.99, 2850);
        Book b2 = new Book("Harry Potter", i2, 99.99, 2850);
        
        if(b1.equals(b2)){
            System.out.println("liburuak berdinak dira");
        }
        else{
            System.out.println("liburuak desberdinak dira");
        }
        if(i1.equals(i2)){
           System.out.println("idazleak berdinak dira"); 
        }
        else{
            System.out.println("idazleak desberdinak dira");
        }
        
    }
    
}
