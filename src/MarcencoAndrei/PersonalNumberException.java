package MarcencoAndrei;

//Create an unchecked PersonalNumberException. Write a program that asks the user for a string and tries to convert it to a number of int type
//using the Integer.parseInt() method. If the string cannot be converted to a number, the program should throw a NumberFormatException.
//Handle this exception and throw your PersonalNumberException with message: “Impossible to parse int from string: ” + stringFromTerminal.
public class PersonalNumberException extends RuntimeException {
    public PersonalNumberException(String message) {
        super(message);
    }
}
