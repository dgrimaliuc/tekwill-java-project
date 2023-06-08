package arina_tolchenitsyna.second_java_task.condition_main;

public class ConditionMain {
    public static void main(String[] args) {
        int num1 = 0;
        if (num1 > 0) {
            System.out.println("This is positive number");
        } else if (num1 < 0) {
            System.out.println("This is negative number");
        } else {
            System.out.println("This number is zero");
        }
        int divisible = 30;
        if (divisible % 3 == 0 && divisible % 2 == 0) {
            System.out.println("Our number is divisible by 2 and 3");
        }
        int score = 100;
        String grade;
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("Your grade is " + grade);
    }
}
