package VictorMurashev;


public class Person {
    // Fields
    String firstName = "Adam";
    String lastName = "Smith";
    int age = 32;

    // Method to print person info
    public void printInfo() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println();
    }

    public static class lesson_20240717 {

        public static void main(String[] args) {
            //Task 1
            greet();

            //Task 2
            int a = 10;
            int b = 5;
            int result = subtract(a, b);
            System.out.println("The difference is: " + result);

            //Task 3
            int num1 = 10;
            int num2 = 20;
            int num3 = 15;
            int max = findMaximum(num1, num2, num3);
            System.out.println("The maximum value is: " + max);

            //Task 4
            int sum = sumAll(1, 2, 3, 4, 5);
            System.out.println("The sum is: " + sum);

            //Task 5
            printNumbers(10);

            //Task 6
            Person person1 = new Person();
            person1.firstName = "Adam";
            person1.lastName = "Smith";
            person1.age = 32;

            Person person2 = new Person();
            person2.firstName = "John";
            person2.lastName = "Doe";
            person2.age = 28;

            Person person3 = new Person();
            person3.firstName = "Jane";
            person3.lastName = "Doe";
            person3.age = 25;

            // Print all objects
            person1.printInfo();
            person2.printInfo();
            person3.printInfo();

            // Print all objects again
            System.out.println("\n========\nSecond printing\n========");
            person1.printInfo();
            person2.printInfo();
            person3.printInfo();

        }

        //Task 1
        public static void greet() {
            System.out.println("Hello World!");
        }

        //Task 2
        public static int subtract(int num1, int num2) {
            return num1 - num2;
        }

        //Task 3
        public static int findMaximum(int num1, int num2, int num3) {
            int max = num1;
            if (num2 > max) {
                max = num2;
            }
            if (num3 > max) {
                max = num3;
            }
            return max;
        }

        //Task 4
        public static int sumAll(Integer... numbers) {
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            return sum;
        }

        //Task 5
        public static void printNumbers(int n) {
            for (int i = 1; i <= n; i++) {
                System.out.println(i);
            }
        }
    }
}
