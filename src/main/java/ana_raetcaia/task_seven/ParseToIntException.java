package ana_raetcaia.task_seven;

public class ParseToIntException extends RuntimeException{
    //Create personal Checked exception with name "ParseToIntException" and method which throws
    // this excecption if a string provided as parameter can not be converted to int with Integer.parseToInt() method.
    public  ParseToIntException (String input){
        super( "Can not parse int: " + input);
    }
}
