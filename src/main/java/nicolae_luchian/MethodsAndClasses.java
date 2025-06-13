package main.java.nicolae_luchian;

public class MethodsAndClasses {

    static int sum(int a, int b) {
        return a + b;
    }

    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Access denied - you are not old enough!");
        } else {
            System.out.println("Access granted - you are old enough!");
        }
    }

    static String checkEvenOrOdd(int number) {
        return number % 2 == 0 ? "even" : "odd";
    }

    static double calculateAverage(int [] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;
    }

    static void printMessage(String message) {
        System.out.println(message);
    }

    static int calculateDifference(int a, int b) {
        return a - b;
    }

    static Integer checkMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    static Integer calculateSum(Integer a, Integer b, Integer c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        var result = sum(1, 2);
        System.out.println(result);

        checkAge(15);
        checkAge(20);

        var number = 10;
        checkEvenOrOdd(number);
        System.out.println( checkEvenOrOdd(number) );

        var avg = calculateAverage(new int[] {1, 2, 3, 4, 5});
        System.out.println(avg);


        printMessage("Hello World!");
        var diff = calculateDifference(10, 5);
        System.out.println(diff);
        var maxNum = checkMax(10, 20, 30);
        System.out.println(maxNum);
        var sum = calculateSum(10, 20, 30);
        System.out.println(sum);

        // Classes and Objects

        Person person1 = new Person("John", "Doe", 30);
        person1.printPerson();
        Person person2 = new Person("Jane", "Doe", 25);
        person2.printPerson();


        // Books
        Book book1 = new Book("J.K. Rowling", "Harry Potter", 200, 2000);
        Book book2 = new Book("J.R.R. Tolkien", "The Hobbit", 300, 2010);

        book1.printBookInfo();
        book2.printBookInfo();

        //Students
        Student student1 = new Student(17, "Doe", 30, 1234);
        Student student2 = new Student(16, "Doe", 25, 5678);

        student1.printStudentInfo();
        student2.printStudentInfo();

    }
}
