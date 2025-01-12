package main.java.LiliaRosca.exception_errors_etc_10_01;

public class PersonalBoundException extends Exception {
    PersonalBoundException(String message) {
        super(message);
    }

    PersonalBoundException() {
        super();
    }
}
