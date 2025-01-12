package main.java.LiliaRosca.polymorphism_abstraction_08_01.HW;

import java.util.List;

public class main_HW {

    // 1. Creează o clasă abstractă “Employee” cu o metodă abstractă “calculateSalary”.
    // si subclase - “FullTimeEmployee” și “PartTimeEmployee”, și implementează metoda “calculateSalary” diferit în fiecare subclasă.
/*    public static void main(String[] args) {
        FullTimeEmployee fullTime = new FullTimeEmployee();
        PartTimeEmployee partTime = new PartTimeEmployee();
        fullTime.calculateSalary();
        partTime.calculateSalary();
    }*/

    // 2. Creează o clasă “Animal” cu o metodă “makeSound”.
    // subclase “Dog”, “Cat” și “Bird” care suprascriu metoda “makeSound” pentru a produce sunete diferite.
/*    public static void main(String[] args) {
        List<Animal> animals = List.of(
                new Dog(),
                new Cat(),
                new Bird()
        );
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }*/

    // 3. Proiectează o ierarhie “Shape” clasă de bază și subclase “Circle”, “Square” și “Triangle”.
    // Include o metodă “calculateArea” în fiecare subclasă care calculează aria formei respective.
    public static void main(String[] args) {
        List<Shape> shapes = List.of(
                new Circle(3),
                new Square(5),
                new Triangle(4, 3)
        );
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.calculateArea());
        }
    }

}
