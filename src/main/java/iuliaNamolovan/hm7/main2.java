package main.java.iuliaNamolovan.hm7;

public class main2 {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle("blue", "fill", 2.1, 2.5);
        Rectangle r2 = new Rectangle("red", "fill", 3.2, 4.5);
        double calculateArea1 = r1.Width * r1.Height;
        double calculateArea2 = r2.Width * r1.Height;
        System.out.println("\nINFO despre primul dreptunghi:" + r1);
        System.out.println("Aria dreptunghiului 1 este : " + calculateArea1);
        System.out.println("\nInfo despre dreptunghiul 2:" + r2);
        System.out.println("Aria dreptunghiului  2 este : " + calculateArea2);
    }
}
