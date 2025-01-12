package main.java.LiliaRosca.exception_errors_etc_10_01;

public class PersonalNullException extends NullPointerException {
    public PersonalNullException(String message) {
        super(message);
    }

    PersonalNullException() {
        super();
    }
}
