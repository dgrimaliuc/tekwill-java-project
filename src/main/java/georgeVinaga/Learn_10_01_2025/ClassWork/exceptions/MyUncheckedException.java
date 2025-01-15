package main.java.georgeVinaga.Learn_10_01_2025.ClassWork.exceptions;

public class MyUncheckedException extends RuntimeException{ // Da
    MyUncheckedException(String message) {
        super(message);
    }

    MyUncheckedException() {
        super();
    }
}
