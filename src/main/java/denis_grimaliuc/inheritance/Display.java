package main.java.denis_grimaliuc.inheritance;


/**
 * Creează o clasă “Display” și supraincarcă metoda show pentru a afișa un int, un double și un String.
 */
public class Display {

    public void show(int number) {
        System.out.println("Integer: " + number);
    }
    
    public void show(double number) {
        System.out.println("Double: " + number);
    }

    public void show(String number) {
        System.out.println("String: " + number);
    }
}
