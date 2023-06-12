package Ivan;

public class Condition {
    public static void main(String[] args) {
        int number = -20;

        if (number > 0) {
            System.out.println("The number is positive");
        } else if (number < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }

        //Determine the grade based on a given score
        //A > 90
        //B > 80
        //C > 70
        //Else D
        int score = 60;
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
    }

}



