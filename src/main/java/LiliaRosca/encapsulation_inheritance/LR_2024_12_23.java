package main.java.LiliaRosca.encapsulation_inheritance;

public class LR_2024_12_23 {
    public static void main(String[] args) {
        // Exercitii clasa
        // Ex 1 LR_Fruit
/*        LR_Fruit fruit1 = new LR_Fruit("Apple", "green", 11);
        LR_Fruit fruit2 = new LR_Fruit("Pear", "yellow", 124);
        fruit1.printInfoF();
        fruit2.printInfoF();

        // Ex 2 Person
        Person person1 = new Person("David", "Ricardo", 102);
        Person person2 = new Person("Dave", "Rich", 101);
        System.out.println(person1.getfullName());
        System.out.println(person2.getfullName());

        // Ex 3 Engine
        Engine engine = new Engine();
        engine.start();
        engine.accelerate();
        engine.accelerate();
        engine.accelerate();
        engine.stop();

        // Ex 4 Bank
        Bank bank = new Bank();
        bank.addFunds(100);
        bank.printBalance();
        bank.withdraw(50);
        bank.printBalance();

// this - operator - ofera referinta la instanta curenta / obiectul curent
        String firstName;
        String lastName;
        int age;

        Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }
    }

// OOP - prezentarea
    // static - atribut - metodele statice pot fi accesate fara a crea obiecte in ele
    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // public method
    public void myPublicMethod() {
        System.out.println("Public method must de called by creatin pbjects");
    }

    // alta clasa
    public static void main(String[] args) {
        myStaticMethod(); // for static methods

        Main myObj = new Main(); // crearea obiectului in clasa
        myObj.myPublicMethod(); // call the public method on the object
    }

    // static field - este comun pentru toate obiectele
        public class Main {
            static int x = 5;
        }
        // alta clasa
        public static void main(String[] args) {
            System.out.println(x); // outputs 5;
        }
// 4 principii de baza in OOP: Incapsularea, Mostenirea, Polimorfism, Abstractia
   // Incapsularea - variabilele, atributele sunt private;
        // utilizeaza get si set pentru a accesa si utiliza variabilele private
        // modificatori de acces:
      // private - poate fi accesata numai in cadrul clasei
      // public - poate fi accesata de oriunde in program
      // protected - poate fi accesata in cadrul aceluiaia pachet si din subclase
      // default protected - implicit / daca nu este scris nimic - acces in cadrul aceluiasi pachet
        class bank { // getter si setter
            private Double balance;
            public Double getBalance() { // Code - Generate - Setter   - returneaza variabila
                return balance;
            }
            public void setBalance(Double newBalance) { // Code - Generate - Setter  - seteaza variabila
                this.balance = newBalance; // set - verifica daca utilizatorul are acces la setarea variabilei
            }
        // alta clasa
            public static void main(String[] args) {
                Bank bank = new Bank();
                bank.setBalance(100.1);
                System.out.println(bank.getBalance());
            }
        }
        // Creați o clasă numită „Employee” - class Employee
        // class Student - de sine statator

// Inheritance - key word extends - utila pentru reutilizarea atributelor, metodelor...
// permite crearea ierarhielor de clase - mostenirea se face doar de la a singura clasa parinte
// public class Car extends Vehicle {} - car subclasa mosteneste tot de la Vehicle
         public class Vehicle { // parent class - superclasa
            public String color;
            public Integer year;
            public String fuelType;

            public Vehicle(String color, Integer year, String fuelType) {
                this.color = color;
                this.year = year;
                this.fuelType = fuelType;
            }
        }
        public class Car extends Vehicle {
            Double horsePower;

            public Car(String color, Integer year, String fuelType, Double horsePower) {
                super(color, year, fuelType); // mostenit de la clasa superioara
                this.horsePower = horsePower; // variabile aditional specifica doar clasei inferioare
            }
        }
        // class Animal, subclass Cat
        Cat cat = new Cat();
        cat.name = "Whiskers";
        cat.eat(); // inherited from Animal
        cat.meow(); // specific to Cat
*/
        // Vehicle - Car
        Car car = new Car("BMW", "Purple", 2023, 3, "Gas");
        System.out.println(car);

        // key word super - referire la clasa superioara
        /* class Animal {
            String name;

            public void eat() {
                System.out.println("The animal is eatintg.");
            }
         }

         class Cat extends Animal {
            String colour;

            public void eat() {
                super.eat(); // invokes the method from superclass, constructor or anything else from the parent class
                this.colour = colour;
            }
         }     */
    }
}