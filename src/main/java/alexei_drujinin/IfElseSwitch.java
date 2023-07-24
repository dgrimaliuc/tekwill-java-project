package alexei_drujinin;

public class IfElseSwitch {
    static int a = (int) (Math.random() * 200) - 100;
    static int b = (int) (Math.random() * 100);

    public static void main(String[] args) {
        checkIfNumberIsPositive(a);
        checkIfNumberIsDivisible(b);
        checkTheGrade(b);
    }

    public static void checkIfNumberIsPositive(int b) {
        if (b > 0) {
            System.out.println("Number " + b + " is positive");
        } else if (b == 0) {
            System.out.println("Number " + b + " is zero");
        } else {
            System.out.println("Number " + b + " is negative");
        }
    }

    public static void checkIfNumberIsDivisible(int c) {
        if (c % 2 == 0 && c % 3 == 0) {
            System.out.println("Number " + b + " is divisible by both 2 and 3");
        } else {
            System.out.println("Number " + b + " is not divisible by both 2 and 3");
        }
    }

    public static void checkTheGrade(int d) {
        switch (d / 10) {
            case 9:
                System.out.println("for the score " + d + " the grade is A");
                break;
            case 8:
                System.out.println("for the score " + d + " the grade is B");
                break;
            case 7:
                System.out.println("for the score " + d + " the grade is C");
                break;
            default:
                System.out.println("for the score " + d + " the grade is D");
        }
    }
}

