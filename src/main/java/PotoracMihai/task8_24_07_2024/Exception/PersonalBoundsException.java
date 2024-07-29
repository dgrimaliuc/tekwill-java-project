package main.java.PotoracMihai.task8_24_07_2024.Exception;

/*
Create an unchecked exception class PersonalNullException.
Create a toUpperCase method and inside print the UpperCase of a provuded string.
Throw a PersonalNullException when the provided string is null.
 */
public class PersonalBoundsException extends Exception {
    public PersonalBoundsException(String message) {
        super(message);
    }
}
