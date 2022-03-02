package model;

import java.time.LocalDate;
import java.util.Objects;

/*
 * The Book class models a book with one (and only one) author.
 */
public class Book implements Argitagarria {
    // The private instance variables

    private String name;
    private Author author;
    private double price;
    private int pages;
    protected Hizkuntza hizkuntza;
    protected static int argitaratutakoLiburuak = 0;
   
    // Constructors
    public Book() {

    }

    public Book(String name, Author author, double price, int pages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.pages = pages;
    }
    
    public Book(String name, Author author, double price, int pages,Hizkuntza hizkuntza) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.pages = pages;
        this.hizkuntza = hizkuntza;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;  // return member author, which is an instance of the class Author
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
    public String getNolakoa(){
        if (pages < 100){
            return "txikia";
        }
        else if(pages > 100 && pages < 400){
            return "normala";
        }
        else{
            return "handia";
        }
        
    }

    public static int getArgitaratutakoLiburuak() {
        return argitaratutakoLiburuak;
    }

    public static void setArgitaratutakoLiburuak(int argitaratutakoLiburuak) {
        Book.argitaratutakoLiburuak = argitaratutakoLiburuak;
    }

    
    @Override
    public String toString() {
        return name + ", " + author.getName() + ", " + price + ", " + pages;  
    }
    public void argitaratuHizk() {
        if (this.hizkuntza == Hizkuntza.EU ){
          System.out.println("Eibarren argitaratua " + LocalDate.now() + "egunean");
          argitaratutakoLiburuak++; 
        
        }
        else if (this.hizkuntza == Hizkuntza.EN){
          System.out.println("This book was published in Eibar in " + LocalDate.now() );
          argitaratutakoLiburuak++;      
        }
        else if (this.hizkuntza == Hizkuntza.ES){
          System.out.println("Este libro ha sido publicado en Eibar el dia " + LocalDate.now());
          argitaratutakoLiburuak++;      
        }
    }
    @Override
    public void argitaratu() {
        System.out.println("Eibarren argitaratua " + LocalDate.now() + "egunean");
        argitaratutakoLiburuak++;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
           
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.author, other.author)) {
            return false;
        }
         
        return true;
    }
    
    

}