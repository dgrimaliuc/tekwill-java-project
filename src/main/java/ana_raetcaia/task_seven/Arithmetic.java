package ana_raetcaia.task_seven;

public class Arithmetic {
    //Write a method that asks the user for two numbers and tries to divide the first number by the second.
    // If the second number is zero, the program should throw an ArithmeticException.
    // Handle this exception to avoid an error in the program. The message "Division by zero" should be displayed
    // instead of the error
    int a ;
    int b ;

    public int divideNumbers (int a, int b){
        int rezult = a/b;
        return rezult;
    }

}
