package main.java.PotoracMihai.Collections;

import java.util.HashSet;
import java.util.Scanner;

public class ExampleHashSet {
    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            numbers.add(sc.nextInt());
        }

        System.out.println(numbers);
        System.out.println("The size of the set is: " + numbers.size());
    }
}
