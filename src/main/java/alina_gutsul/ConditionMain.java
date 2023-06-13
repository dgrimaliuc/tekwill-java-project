package alina_gutsul;

public class ConditionMain {
    public static void main(String[] args) {
        // Check if a number is positive, negative, or zero.
        int number = -5;

        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        //switch case
        int number_sc = -5;

        switch (Integer.signum(number_sc)) {
            case 1:
                System.out.println("The number is positive.");;
                break;
            case -1:
                System.out.println("The number is negative.");
                break;
            default:
                System.out.println("The number is zero.");
                break;
        }

        //Check if a number is divisible by both 2 and 3.
        int num = 12;

        if (num % 2 == 0 && num % 3 == 0) {
            System.out.println("The number is divisible by both 2 and 3.");
        } else {
            System.out.println("The number is not divisible by both 2 and 3.");
        }

        //switch case
        int num_sc = 12;

        switch (num_sc % 6) {
            case 0:
                System.out.println("The number is divisible by both 2 and 3.");
                break;
            default:
                System.out.println("The number is not divisible by both 2 and 3.");
                break;
        }

        //Determine the grade based on a given score.
        //A > 90
        //B > 80
        //C > 70
        //Else D
        int score = 85;
        char grade;

        if (score > 90) {
            grade = 'A';
        } else if (score > 80) {
            grade = 'B';
        } else if (score > 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        System.out.println("The grade is: " + grade);


        //switch case
        int score_sc = 85;
        char grade_sc;

        switch (score_sc / 10)
        {
            case 10:
            case 9:
                grade_sc = 'A';
                break;
            case 8:
                grade_sc = 'B';
                break;
            case 7:
                grade_sc = 'C';
                break;
            default:
                grade_sc = 'D';
                break;
        }

        System.out.println("The grade is: " + grade_sc);
    }
}
