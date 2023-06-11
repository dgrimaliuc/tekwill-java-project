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
        switch (score / 10) {
            case 10:
            case 9:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
            case 6:
                grade = "D";
                break;
            default:
                grade = "F";
                break;
        }
        System.out.println("Your grade is " + grade);
    }
}
