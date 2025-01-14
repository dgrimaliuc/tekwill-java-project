package main.java.cristinamocanu.exceptions;

public class MyUncheckedException extends RuntimeException{
    MyUncheckedException(String message){
        super(message);
    }
    MyUncheckedException(){
        super();
    }
}
