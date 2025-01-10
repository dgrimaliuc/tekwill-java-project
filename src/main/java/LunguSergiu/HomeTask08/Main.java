package main.java.LunguSergiu.HomeTask08;

public class Main {

    public static void main(String[] args) {
//        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Adam Sandler", 1000);
//
//        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("John Weak", 10, 40);
//
//        System.out.println("Employee's salary full-time (" + fullTimeEmployee.getName() + "): " + fullTimeEmployee.calculateSalary());
//        System.out.println("Employee's salary part-time (" + partTimeEmployee.getName() + "): " + partTimeEmployee.calculateSalary());
//    }
//}

//        Animal dog = new Dog("Blacky");
//        Animal cat = new Cat("Kitty");
//        Animal bird = new Bird("Woody");
//
//        // Apelarea metodei makeSound pentru fiecare obiect
//        dog.makeSound();
//        cat.makeSound();
//        bird.makeSound();
//    }
//}

        Shape circle = new Circle("Circle", 6);
        Shape square = new Square("Square", 5);
        Shape triangle = new Triangle("Triangle", 7, 4);

        System.out.println(circle.getName() + " - Aria: " + circle.calculateArea());
        System.out.println(square.getName() + " - Aria: " + square.calculateArea());
        System.out.println(triangle.getName() + " - Aria: " + triangle.calculateArea());
    }
}