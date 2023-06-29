package anna_gontari;
//Create personal Checked exception with name "ParseToIntException" and method which throws this exception if a string provided
// as parameter can not be converted to int with Integer.parseToInt() method.
public class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}