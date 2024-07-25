package DenisGrimaliuc.lection2407.exceptions;


/*

    Create an unchecked exception class PersonalNullException.
    Create a toUpperCase method and inside print the UpperCase of  a provided string.
Throw a PersonalNullException when the provided string is null.
 */
public class PersonalNullException extends RuntimeException {
    public PersonalNullException(String message) {
        super(message);
    }
}
