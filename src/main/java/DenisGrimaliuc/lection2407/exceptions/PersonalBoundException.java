package DenisGrimaliuc.lection2407.exceptions;


//Create a checked exception PersonalBoundException. Create a “printSecond” method and inside print the second element of an array.
// If the array has length < 2 then throw the PersonalBoundException exception.
public class PersonalBoundException extends Exception {
    public PersonalBoundException(String message) {
        super(message);
    }
}
