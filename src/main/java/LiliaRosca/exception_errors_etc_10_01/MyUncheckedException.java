package main.java.LiliaRosca.exception_errors_etc_10_01;

public class MyUncheckedException extends RuntimeException {
    public MyUncheckedException() {
        super(); // call the superclass constructor
    }

    MyUncheckedException(String message) {
        super(message); // call the superclass constructor with a custom message
    }
}
