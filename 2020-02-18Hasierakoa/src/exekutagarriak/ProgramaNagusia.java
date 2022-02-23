package exekutagarriak;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import model.Author;
import model.Book;
import model.Komikia;

public class ProgramaNagusia {

    private static Author[] idazleak = new Author[100];
    private static ArrayList<Book> liburutegia = new ArrayList<>();

    public static void initialize() {
        idazleak[0] = new Author("J.K.Rowling", 'm');
        idazleak[1] = new Author("Agatha Christie ", 'f');
        idazleak[2] = new Author("Francisco Ibañez ", 'm');
        idazleak[3] = new Author("Margaret Atwood ", 'f');
        idazleak[4] = new Author("Marjane Satrapi", 'f');
        idazleak[5] = new Author("Mariasun Landa", 'f');
        idazleak[6] = new Author("Harper Lee ", 'm');
        idazleak[7] = new Author("Mary Shelley", 'f');

        liburutegia.add(new Book("Harry Potter", idazleak[0], 99.99, 2850));
        liburutegia.add(new Book("Asesinato en el Orient Express", idazleak[1], 9.95, 275));
        liburutegia.add(new Book("Muerte en el Nilo", idazleak[1], 9.95, 300));
        liburutegia.add(new Book("10 negritos", idazleak[1], 9.95, 325));
        liburutegia.add(new Komikia("Mortadelo y Filemón", idazleak[2], 19.95, 75, true));
        liburutegia.add(new Book("El cuento de la criada", idazleak[3], 24.95, 410));
        liburutegia.add(new Book("Cat’s eye", idazleak[3], 6.95, 78));
        liburutegia.add(new Komikia("Persepolis", idazleak[4], 19.95, 75, false));
        liburutegia.add(new Book("Azken balada,", idazleak[5], 10.95, 225));
        liburutegia.add(new Book("Matar a un ruiseñor", idazleak[6], 15.95, 450));
        liburutegia.add(new Book("Frankenstein", idazleak[7], 19.95, 300));

    }

    public static void jaiotzeDataBete() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Zein idazleren jaiotze data nahi duzu bete (Idatzi posizioa)?");
            int i = sc.nextInt();

            System.out.println("Sartu " + idazleak[i - 1].getName() + " idazlearen jaiotze data (uuuu-hh-ee):");
            String birthday = sc.next();
            idazleak[i - 1].setBirthday(birthday);
            System.out.println("Ondo aldatu da");
        } catch (Exception ex) {
            System.out.println("Data okerra.");
            System.out.println("Hurrengo baten sartuko duzu data.");
        }
    }

    public static void inprimatu() {
        System.out.println("LIBURUTEGIA");
        System.out.println("===============================");
        for (Book b : liburutegia) {
            System.out.println(b);
        }
    }

    public static void main(String[] args) {

        initialize();
        jaiotzeDataBete();
        inprimatu();

    }

}
