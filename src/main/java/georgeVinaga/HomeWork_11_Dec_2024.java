package main.java.georgeVinaga;
import java.util.Scanner;

public class HomeWork_11_Dec_2024 {
    public static void main(String[] args) {
        String bname = "Eugen";
        System.out.println("Salut, eu ma numesc " +bname+ ", și sunt de la secția de cadre.");

        // Scanner functie, se foloseste pentru a introduce un raspuns la o cerere.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cum te numești? :");
        String name = scanner.nextLine();
        System.out.println(bname+": Bine, "+ name + " spunemi ceva despre tine.");

        String aname = name +", spunemi ceva despre tine";

        // integer variabile
        int myAge = 34;
        double greutate = 60.2;
        System.out.println(name +": Virsta mea este de "+ myAge +" Ani");
        System.out.println(name +": Și eu cântăresc "+greutate + " Kg");

        // integer variabile
        int z = 5;
        int y = 6;
        int rezultatul = z + y; // rezultatul este 11
        System.out.println(name +": Știu matematica, de exemplu 5+6 este egal cu " +rezultatul + " :D");

        // if și else
        if (myAge >= 18) {
            System.out.println(name +": Și am permis deoarece sunt matur");
        } else System.out.println(name +": Și nu am permis deoarece sunt minor");

        // boolean Variabile
        boolean CodeJavaDificila = true;
        boolean CodePythoHard = false;
        System.out.println(bname +": Este codul Java Dificil? " + name + " raspunde: " + CodeJavaDificila);
        System.out.println(bname +": Este codul Python Dificil? " + name + " raspunde: " + CodePythoHard);

    }
}
