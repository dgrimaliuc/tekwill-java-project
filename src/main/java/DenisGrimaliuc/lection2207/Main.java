package DenisGrimaliuc.lection2207;

import DenisGrimaliuc.lection2207.enums.Sizes;

import static DenisGrimaliuc.lection2207.enums.Sizes.M;

public class Main {
  /*
  Create a class called "Animal" with a method named "makeSound". Implement subclasses such as "Dog", "Cat",
  and "Bird" that override the "makeSound" method to produce different sounds.
   */

    public static void validateSize(Sizes size) {
        System.out.println("Size is: " + size);
    }

    public static void main(String[] args) {
          /*
  Create a class called "Animal" with a method named "makeSound". Implement subclasses such as "Dog", "Cat",
  and "Bird" that override the "makeSound" method to produce different sounds.
   */
//        Printable dog = new Dog("Rex", 5, "brown", "bark", "German Shepherd", 25.5);
//        Printable bird = new Bird("Tweety", 2, "yellow", "chirp");
//        Printable cat = new Cat("Tom", 3, "grey", "meow", "British Shorthair");
////        dog.makeSound();
////        bird.makeSound();
//
//        List<Printable> zoo = new ArrayList<>();
//        Collections.addAll(zoo, dog, bird, cat);
//
//        for (Printable animal : zoo) {
//            animal.print();
//        }

        /*
        Design a class hierarchy for different shapes, such as "Shape" as the superclass and subclasses
        like "Circle", "Square", and "Triangle".
        Include a method named "calculateArea"
        in each subclass that calculates the area of the respective shape.
         */

//        List<Shape> shapes = new ArrayList<>();
//        shapes.add(
//                new Triangle(5, 10)
//        );
//        shapes.add(new Circle(5));
//        shapes.add(new Square(5));
//
//
//        for (Shape shape : shapes) {
//            System.out.println(shape);
//            System.out.println("Area: " + shape.calculateArea());
//        }
        validateSize(M);

    }
}
