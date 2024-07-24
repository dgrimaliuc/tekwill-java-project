package CristevaEcaterina;

public class lesson1 {
 /*
 1.
    int number = 5;
    if (number > 0) {
        System.out.println("Number is positive");}
    else if (number < 0){
        System.out.println("Number is negative");}
    else {
        System.out.println("Number is zero"); }
 2.
    int number = 8;
        if(number % 2 == 0 ){
        System.out.println("Number is even");}
        else{
        System.out.println("Number is odd");
    }
 3.
    int number = 13;
    if(number % 2 == 0 && number % 3 == 0){
        System.out.println("Number is divisible by both 2 and 3");}
    else{
        System.out.println("Number is not divisible by both 2 and 3");
    }
    4. String ;
    Scanner  = new Scanner(System.in);
    System.out.println("Enter a string");
    string = scanner.nextLine();
    System.out.println("Length of the string:"+ string.length());
}


 1.Find sum of two numbers
int a = 3;
int b = 5;
int s = a+b;
    System.out.println(a+b);

 2.Check if two numbers are equal
int a = 6;
int b = 5;
    if(a==b){
        System.out.println("Numbers are equal");}
        else{
        System.out.println("Number are not equal");
     }
             3.Check if a numbers is positive,negative, or zero using if-else
int number = -2;
    if (number > 0) {
        System.out.println("Number is positive");}
        else if (number < 0){
        System.out.println("Number is negative");}
        else {
        System.out.println("Number is zero"); }
        4.Find the maximum of 2 numbers
int x = 2;
int y = 3;
    if (x > y) {
        System.out.println("Number x is greater than number y ");}
        else if (x < y){
        System.out.println("Number x is less than number y");}
        else {
        System.out.println("Numbers are equal"); }
        5.
String Name;
String surName;
Scanner  = new Scanner(System.in);
    System.out.println("Enter your name: ");
Name = scanner.nextLine();
    System.out.println("Enter your surname: ");
surName = scanner.nextLine();
    System.out.println("Welcome " +  surName +" " + Name);
}
        }
        */
public static void main(String[] args) {
    int number = 0;

    switch (number) {

        case 0:
            System.out.println("Number is zero");
            break;
        case 1:
            System.out.println("Number is one");
            break;
        case 2:
            System.out.println("Number is two");
            break;
        default:
            System.out.println("Number is not zero, one or two");
            break;
    }
}
}




