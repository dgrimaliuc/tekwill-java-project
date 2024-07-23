package IgorTabirta.Les_July19.Inheritance.HW;

public class Runner_July_22 {
    public static void main(String[] args) {

        // Inheritance Shape -> Rectangle

        Rectangle rectangle = new Rectangle("Green", 6.52, 9.32);
        rectangle.printInfo();

        // Inheritance Animal -> Dog

        Dog dog = new Dog("Bunny", 5, "Gaw-Gaw", "York", 6);
        dog.printInfo();

        // Encapsulation Car

        Car car = new Car();
        car.setMake("BMW");
        car.setModel("X5");
        car.setYear(2023);
        car.printInfo();

        // Encapsulation Employee

        Employee emp = new Employee();
        emp.setId(322);
        emp.setName("Smith");
        emp.setSalary(52000);
        emp.printInfo();
    }
}
