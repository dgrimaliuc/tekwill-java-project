package main.java.LiliaRosca.inheritance;

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
         */


    /*    // class bank - private VS public
        class bank {
            private Double balance; // protected - poate fi accesata in cadrul clasei
            public Double getBalance() { // Code - Generate - Setter
                return balance;
            }
            public void setBalance(Double newBalance) { // Code - Generate - Setter
                this.balance = newBalance;
            }
        // alta clasa
            public static void main(String[] args) {
                Bank bank = new Bank();
                bank.setBalance(100.1);
                System.out.println(bank.getBalance());
            }
        }
         */
        // class Student - private pentru ID-ul studentului, nume și notă.
        // Scrieți metode getter și setter pentru fiecare variabilă.
/*        public class Student {
            private int id;
            private String name;
            private double grade;

            public Employee(int id, String name, double grade) {
                this.id = id;
                this.name = name;
                this.grade = grade;
            }
            public int getId() {
                return id;
            }
            public void setId(int id) {
                this.id = id;
            }
            public String getName() {
                return name;
            }
            public void setName(String name) {
                this.name = name;
            }
            public double getSalary() {
                return grade;
            }
            public void setSalary(double salary) {
                this.grade = grade;
            }
        }*/
// Inheritance - extends
// public class Car extends Vehicle {} - car mosteneste tot de la Vehicle
        /*public class Vehicle { // parent class
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
                super(color, year, fuelType) // mostenit de la clasa superioara
                this.horsePower = horsePower; // variabile aditional specifica doar clasei inferioare
            }
        }*/

    }
}
