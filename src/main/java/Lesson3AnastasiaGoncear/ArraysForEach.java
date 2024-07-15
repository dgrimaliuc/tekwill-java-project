package Lesson3AnastasiaGoncear;

public class ArraysForEach {public static void main(String[] args) {
    // Example array
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    // Create a Scanner object for user input
    Scanner scanner = new Scanner(System.in);

    // Prompt the user to enter the element to search for
    System.out.print("Enter the element to search for: ");
    int element = scanner.nextInt();

    // Close the scanner
    scanner.close();

    // Call the method to check if the element exists in the array
    boolean exists = elementExists(array, element);

    // Print the result
    if (exists) {
        System.out.println("The element " + element + " exists in the array.");
    } else {
        System.out.println("The element " + element + " does not exist in the array.");
    }
}

    // Method to check if an element exists in the array using for-each loop
    public static boolean elementExists(int[] array, int element) {
        for (int i : array) {
            if (i == element) {
                return true;
            }
        }
        return false;
    }
}
