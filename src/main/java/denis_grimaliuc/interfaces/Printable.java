package main.java.denis_grimaliuc.interfaces;


/**
 * Creează o interfață Printable cu metoda print().
 * Creează clasele Book și Magazine care implementează interfața Printable
 * și au câmpuri și metode proprii pentru imprimare. De exemplu, Book are nume, autor și preț, iar Magazine are nume și proprietar.
 * Fă un override al metodei toString() și formatează ieșirea.
 * Metoda print() ar trebui să aibă o implementare default care va folosi toString() și sout pentru a imprima conținutul obiectului.
 * Creează un array de obiecte Printable care conține atât cărți cât și reviste și apelează metoda print() pentru fiecare obiect.
 * Hint: In metoda print in interface faceti sout(this)
 */
public interface Printable {

    default void print() {
        System.out.println(this);
    }
}
