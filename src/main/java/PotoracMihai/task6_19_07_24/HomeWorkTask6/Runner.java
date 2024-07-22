package main.java.PotoracMihai.task6_19_07_24.HomeWorkTask6;

public class Runner {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("BMW");
        car.setYaer(2022);
        car.setModel("X5");

        System.out.println("Car make: " + car.getMake());
        System.out.println("Car model: " + car.getModel());
        System.out.println("Car year: " + car.getYaer());
        System.out.println("********************************");

        Employee employee = new Employee();
        employee.setID(1);
        employee.setName("Ion");
        employee.setSalary(10000);

        System.out.println("Employee ID: " + employee.getID());
        System.out.println("Employee name: " + employee.getName());
        System.out.println("Employee salary: " + employee.getSalary());
        System.out.println("********************************");

        Animal animal = new Animal("Bobik", 2, "Bark");
        animal.printAnimalInfo();
        animal.makeSound();
        System.out.println("********************************");

        Rectangle rectangle = new Rectangle("Green", 3.0, 4.0);
        System.out.println("Rectangle color: " + rectangle.getColor());
        System.out.println("The area of the reactangle is: " + rectangle.getArea());


    }
}
