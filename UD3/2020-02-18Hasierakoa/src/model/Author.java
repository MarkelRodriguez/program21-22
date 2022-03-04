package model;

import java.time.LocalDate;
import java.util.Objects;

/* 
 * The Author class model a book's author.
 */
public class Author {
   // The private instance variables
   private String name;
   private char gender;   // 'm' or 'f'
   private LocalDate birthday;
   // The constructor
   public Author(String name, char gender) {
      this.name = name;
      this.gender = gender;
   }
 
   // The public getters and setters for the private instance variables.
   // No setter for name and gender as they are not designed to be changed.
   public String getName() {
      return name;
   }
   public char getGender() {
      return gender;
   }

    public LocalDate getBirthday() {
        return birthday;
        
    }

    public void setBirthday(String birthday) {

     this.birthday = LocalDate.parse(birthday);
    }
   
   // The toString() describes itself
   public String toString() {
       String bueltatu = " ";
       if(birthday != null){
           bueltatu = name + " (" + gender + ")" + birthday;
       }
       else{
           bueltatu = name + " (" + gender + ")";
       }
       return bueltatu;
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
        final Author other = (Author) obj;
        if (this.gender != other.gender) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.birthday, other.birthday)) {
            return false;
        }
        
        return true;
        
    }


    
   
}