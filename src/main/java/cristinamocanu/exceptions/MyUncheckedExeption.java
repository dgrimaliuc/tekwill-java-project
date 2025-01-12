package main.java.cristinamocanu.exceptions;

public class MyUncheckedExeption extends RuntimeException{
    MyUncheckedExeption (String message){
        super(message);

    }
    MyUncheckedExeption (){
        super();
    }
}
