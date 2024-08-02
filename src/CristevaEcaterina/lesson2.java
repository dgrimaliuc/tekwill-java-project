package CristevaEcaterina;

public class lesson2 {
    public static void main(String[] args) {
/*
1.Write a program that counts from 1 to 10 using a while loop.

        int count = 1;
        while (count <= 10) {
            System.out.println( count );
            count++;
       }
2.Write a program that prints all even numbers from 0 to 50 using a while loop.
        int count = 2;
        while (count <= 50) {
            System.out.println( count);
            count += 2;
        }
3.Implement a program that prompts the user to enter a password until the correct password entered.


        String password = "1111";
        String input = "";
        Scanner sc = new Scanner(System.in);
        while (!input.equals((password))) {
            System.out.println("Enter password: ");
            input = sc.nextLine();
        }
        System.out.println("Correct password!");

 Create a program that calculates the sum of all even numbers between 1 and 100 using a while loop.

        int count = 10;
        while (count >=1) {
            System.out.println( count );
            count -- ;
        }

        int count = 0;
        int sum = 0;

        while (count <= 50) {
            sum = sum + count;
            count += 2;
        }
        System.out.println("Sum of all even numbers between 1 and 50 is: " + sum);


    Write a program that counts from 1 to 10.

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);

    Write a program that prints the multiplication table for a given number.

            int number = 6;
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " * " + i + " = " + number * i);
            }


        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }



        for (int i = 1; i <= 51; i++) {
            if (i % 2 != 0 ){
                System.out.println(i);
            }
        }



// Print all elements of an array
        String[] arr = {"Opel", "Volvo", "BMW", "Audi", "Mercedes", "Toyota", "Ford", "Volkswagen", "Renault", "Peugeot"};
        for (String s : arr) {
            System.out.println(s);
        }
// Array Sum: Write a program that calculates the sum of all elements in an array.
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 5, 6, 7, 8};
        int sum = 0;

//        for (int number : arr) {
//            sum = sum + number;
//        }
for (int i = 0; i < arr.length; i++) {
    sum = sum + arr[i];
}
System.out.println("Sum of all elements in an array is: " + sum);

  // Write a Java program to find the maximum element in an integer array.
int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 5, 6, 7, 8};
int max = arr[0];
for (int i = 0; i < arr.length; i++) {

    if (arr[i] > max) {
        max = arr[i];
    }
}
System.out.println("Max element in an array is: " + max);

Write a Java program to check if an element exists in an integer array.
Write a Java program to count the number of positive elements in an integer array.

//Write a Java program to check if an element exists in an integer array.
int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 5, 6, 7, 8};
int element = 89;
boolean found = false;

for (int i : arr) {
    if (i == element) {
        found = true;
        break;
    }
}
if (found) {
    System.out.println("Element exists in an array");
} else {
    System.out.println("Element does not exist in an array");
}

// Write a Java program to count the number of positive elements in an integer array");
}

 */
        int[] arr = {1, 2, -3, 4, -5, 6, 7, 8, -5, 6, -7, 8};

        int sum = 0;
        for (int number : arr) {
            if (number > 0) {
                sum = sum + number;
            }
        }
        System.out.println("Sum of all positive elements in an array is: " + sum);


    }

}
