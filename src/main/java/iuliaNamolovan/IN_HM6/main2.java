package main.java.iuliaNamolovan.IN_HM6;

public class main2 {
    public static void main(String[] args) {
        Student student1 = new Student("Alex", 22, 8.5);
        Student student2 = new Student("John", 21, 9.5);
        System.out.println("\nInformatie despre studentul 1 :");
        student1.printInfo();
        System.out.println("\nInformatie despre studentul 2 :");
        student2.printInfo();
    }
}
