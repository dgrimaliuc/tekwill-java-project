package main.java.georgeVinaga.Learn_10_01_2025.ClassWork.exceptions;

public class PersonalNullException  extends NullPointerException{
    PersonalNullException(String message) {
        super(message);
    }

    PersonalNullException() {
        super();
    }
}
