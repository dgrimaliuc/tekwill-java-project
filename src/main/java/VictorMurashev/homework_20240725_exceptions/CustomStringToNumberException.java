package VictorMurashev.homework_20240725_exceptions;

public class CustomStringToNumberException extends RuntimeException {
    public CustomStringToNumberException(String message) {
        super(message);
    }
}
