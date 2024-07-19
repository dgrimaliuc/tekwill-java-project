package SergheiRubailo.Task7_2;

/*1. Create a Class “Person” with 3 fields:
firstName = “Adam”
lastName = “Smith”
age = 32
2. Create 3 objects of class Person
3. Create printInfo method inside
4. Print all objects
5. Print all objects again*/

public class Runner {

    public static void main(String[] args) {
        Person person1 = new Person("Mike", "Smith", 25);
        Person person2 = new Person("John", "Smith", 45);
        Person person3 = new Person("Anna", "Smith", 54);

        person1.printInfo();
        person2.printInfo();
        person3.printInfo();

        Book book1 = new Book("Java for Dummies", "John Smith", 2024, 9.99);
        System.out.println(book1);

        Fruit fruit1 = new Fruit("Apple", "Green", 25);
        System.out.println(fruit1);
    }
}

