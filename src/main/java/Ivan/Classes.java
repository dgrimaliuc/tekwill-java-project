package Ivan;

public class Classes {
    // Task 1: Abstract class Shape and its subclasses Rectangle and Circle
    abstract class Shape {
        abstract double calculateArea();
    }

    class Rectangle extends Shape {
        private double length;
        private double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        double calculateArea() {
            return length * width;
        }
    }

    class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

    // Task 2: Abstract class BankAccount and its subclasses SavingsAccount and CheckingAccount
    abstract class BankAccount {
        abstract void deposit(double amount);
        abstract void withdraw(double amount);
    }

    class SavingsAccount extends BankAccount {
        private double balance;

        @Override
        void deposit(double amount) {
            balance += amount;
        }

        @Override
        void withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
            } else {
                System.out.println("Insufficient funds");
            }
        }
    }

    class CheckingAccount extends BankAccount {
        private double balance;
        private double overdraftLimit;

        @Override
        void deposit(double amount) {
            balance += amount;
        }

        @Override
        void withdraw(double amount) {
            if (balance + overdraftLimit >= amount) {
                balance -= amount;
            } else {
                System.out.println("Insufficient funds");
            }
        }
    }

    // Task 3: Abstract class Employee and its subclasses FullTimeEmployee and PartTimeEmployee
    abstract class Employee {
        abstract double calculateSalary();
    }

    class FullTimeEmployee extends Employee {
        private double monthlySalary;

        public FullTimeEmployee(double monthlySalary) {
            this.monthlySalary = monthlySalary;
        }

        @Override
        double calculateSalary() {
            return monthlySalary;
        }
    }

    class PartTimeEmployee extends Employee {
        private double hourlyRate;
        private int hoursWorked;

        public PartTimeEmployee(double hourlyRate, int hoursWorked) {
            this.hourlyRate = hourlyRate;
            this.hoursWorked = hoursWorked;
        }

        @Override
        double calculateSalary() {
            return hourlyRate * hoursWorked;
        }
    }

    // Task 4: Class hierarchy for musical instruments
    class Instrument {
        void play() {
            System.out.println("Playing the instrument");
        }
    }

    class Guitar extends Instrument {
        @Override
        void play() {
            System.out.println("Strumming the guitar");
        }
    }

    class Piano extends Instrument {
        @Override
        void play() {
            System.out.println("Playing the piano");
        }
    }

    class Violin extends Instrument {
        @Override
        void play() {
            System.out.println("Playing the violin");
        }
    }

    // Task 5: Class ArrayUtils with overloaded methods for finding the maximum element
    class ArrayUtils {
        static int findMax(int[] array) {
            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            return max;
        }

        static double findMax(double[] array) {
            double max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            return max;
        }

        static String findMax(String[] array) {
            String max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i].compareTo(max) > 0) {
                    max = array[i];
                }
            }
            return max;
        }
    }

    // Task 6: Printable interface and its implementations Book and Magazine
    interface Printable {
        void print();
    }

    class Book implements Printable {
        private String name;
        private String author;
        private double price;

        public Book(String name, String author, double price) {
            this.name = name;
            this.author = author;
            this.price = price;
        }

        @Override
        public void print() {
            System.out.println("Book: " + name + " by " + author + ", Price: $" + price);
        }

        @Override
        public String toString() {
            return "Book [name=" + name + ", author=" + author + ", price=" + price + "]";
        }
    }

    class Magazine implements Printable {
        private String name;
        private String street;
        private String owner;

        public Magazine(String name, String street, String owner) {
            this.name = name;
            this.street = street;
            this.owner = owner;
        }

        @Override
        public void print() {
            System.out.println("Magazine: " + name + ", Street: " + street + ", Owner: " + owner);
        }

        @Override
        public String toString() {
            return "Magazine [name=" + name + ", street=" + street + ", owner=" + owner + "]";
        }
    }

    // Task 7: Enum Currency
    enum Currency {
        USD("United States Dollar"), EUR("Euro"), GBP("British Pound");

        private String name;

        Currency(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public class Main {
        public void main(String[] args) {
            // Task 1: Abstract class Shape and its subclasses Rectangle and Circle
            Rectangle rectangle = new Rectangle(5, 3);
            Circle circle = new Circle(4);

            System.out.println("Rectangle Area: " + rectangle.calculateArea());
            System.out.println("Circle Area: " + circle.calculateArea());

            // Task 2: Abstract class BankAccount and its subclasses SavingsAccount and CheckingAccount
            SavingsAccount savingsAccount = new SavingsAccount();
            CheckingAccount checkingAccount = new CheckingAccount();

            savingsAccount.deposit(1000);
            savingsAccount.withdraw(500);

            checkingAccount.deposit(2000);
            checkingAccount.withdraw(3000);

            // Task 3: Abstract class Employee and its subclasses FullTimeEmployee and PartTimeEmployee
            FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(5000);
            PartTimeEmployee partTimeEmployee = new PartTimeEmployee(10, 40);

            System.out.println("Full-Time Employee Salary: " + fullTimeEmployee.calculateSalary());
            System.out.println("Part-Time Employee Salary: " + partTimeEmployee.calculateSalary());

            // Task 4: Class hierarchy for musical instruments
            Instrument instrument = new Instrument();
            Guitar guitar = new Guitar();
            Piano piano = new Piano();
            Violin violin = new Violin();

            instrument.play();
            guitar.play();
            piano.play();
            violin.play();

            // Task 5: Class ArrayUtils with overloaded methods for finding the maximum element
            int[] intArray = { 3, 7, 2, 9, 5 };
            double[] doubleArray = { 3.5, 1.2, 5.7, 2.8 };
            String[] stringArray = { "apple", "banana", "orange", "grape" };

            System.out.println("Max Integer: " + ArrayUtils.findMax(intArray));
            System.out.println("Max Double: " + ArrayUtils.findMax(doubleArray));
            System.out.println("Max String: " + ArrayUtils.findMax(stringArray));

            // Task 6: Printable interface and its implementations Book and Magazine
            Printable[] printables = { new Book("Java Programming", "John Doe", 29.99),
                    new Magazine("Tech Trends", "123 Street", "Jane Smith") };

            for (Printable printable : printables) {
                printable.print();
            }

            // Task 7: Enum Currency
            Currency currency = Currency.USD;
            System.out.println("Currency Name: " + currency.getName());
        }
    }

}
