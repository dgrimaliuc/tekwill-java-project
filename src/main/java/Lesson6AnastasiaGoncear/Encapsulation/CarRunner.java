package Lesson6AnastasiaGoncear.Encapsulation;

public class CarRunner {
    public static void main(String[] args) {

        Car car1= new Car("Germany", "Mercedes", 1996);
        Car car2= new Car("Germany", "Audi", 1989);

    System.out.println("Car1 name "+  car1.getModel());
    System.out.println("Car2 year "+  car2.getYear());
        car1.printInfo();
        car2.printInfo();
}}
