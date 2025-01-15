package main.java.georgeVinaga.Learn_10_01_2025.ClassWork;

public class MyException extends Exception {
        public MyException() {
            super(); // Cheama constructorul superclass
        }
        public MyException (String message) {
            super(message); // Cheama constructorul super class cu un mesaj
       }
}

