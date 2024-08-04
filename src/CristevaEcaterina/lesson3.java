package CristevaEcaterina;

import java.util.HashSet;
import java.util.Scanner;

public class lesson3 {
    public static void main(String[] args) {
        /* ArrayList<Integer> cars = new ArrayList<>();
         cars.add("Opel");
         cars.add("BMW");
         cars.add("Volvo");
         cars.add("Audi");
         cars.add(0, "Mercedes");
         cars.set(0, "Toyota");
         System.out.println(cars);
        for (int i = 0; i < cars.size(); i++) ;
         {
             System.out.println(cars);
         }
         cars.remove(0);
         System.out.println(cars);
         cars.clear();
         System.out.println(cars);
         cars.size();
         System.out.println(cars);
         for (String car : cars) ;
         {
             System.out.println(i);
         }
    public static void main(String[] args) {

// Create an ArrayList of integers and add some numbers to it. Print the elements of the ArrayList in reverse order.
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        for (int i = numbers.size() - 1; i >= 0; i = i - 1) {

            System.out.println(numbers.get(i));
        }

// Write a program that takes input from the user and stores it in an ArrayList.
// Keep taking input until the user enters "done" and then display the contents of the ArrayList.

        ArrayList<Integer> numbers = new ArrayList<>();
        String input = "";
        Scanner sc = new Scanner(System.in);
        while (!input.equals("done")) {
            System.out.println("Enter a number: ");
            input = sc.nextLine();
            if (!input.equals("done")) {
                numbers.add(Integer.parseInt(input));
            }
        }
        System.out.println(numbers);

 //Given two ArrayLists of integers, write a program to find the common
// elements between them and store them in a new ArrayList.

        ArrayList<Integer> numbers1 = new ArrayList<>();
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(3);
        numbers1.add(4);
        numbers1.add(5);

        ArrayList<Integer> numbers2 = new ArrayList<>();
        Collections.addAll(numbers2, 1, 2, 3, 4, 5, 6, 7);

        for (int i = 0; i < numbers1.size(); i++) {

        if (numbers1.get(i) == numbers2.get(j)) { System.out.println(numbers1.get(i));
          }
        }
    Create an Arraylist of Integer and print it’s elements using foreach.
//   Create an Arraylist of String and collect all elements in single string, print result. ["1","1","1","1","1"] // "1 1 1 1 1"

    List<String> nums = Arrays.asList("1", "2", "3", "4", "5");
    String result = "";

    for (String num : nums) {
    result += num + " ";
    }
    System.out.println(result.trim());

 // Linked List Creation: Write a function to create a linked list from an array of integers. (Arrays.asList())
 // Write a function to reverse a linked list.

    Integer[] arr = {1, 2, 3, 4, 5};
    LinkedList<Integer> list = new LinkedList<>(Arrays.asList(arr));

    Collections.reverse(list);
    System.out.println(list);

 // Write a function to concatenate (merge) two linked lists.

    LinkedList<String> list1 = new LinkedList<>();
    Collections.addAll(list1, "1", "2", "3", "4", "5");
    LinkedList<String> list2 = new LinkedList<>();
    Collections.addAll(list2, "6", "7", "8", "9", "10");
    LinkedList<String> list3 = new LinkedList<>(list1);
    list3.addAll(list2);
    System.out.println(list3);

// Convert an array of integers to a Linked list, print the first and the last items.

        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        var r = Arrays.asList(arr);
        LinkedList<Integer> linkedList = new LinkedList<>(r);
        System.out.println("First element: " + linkedList.getFirst());
        System.out.println("Last element: " + linkedList.getLast());

// Sort a linked list of String and print it before and after sorting.
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("Katia", "Cristeva", "Tekwill", "Java", "Project"));

// Create a Map that stores the abbreviator as keys and names of countries as values. Print them all.

        HashMap<String, String> countryMap = new HashMap<>();
        countryMap.put("USA", "United States of America");
        countryMap.put("UK", "United Kingdom");
        countryMap.put("CAN", "Canada");
        countryMap.put("GER", "Germany");
        countryMap.put("FRA", "France");
        countryMap.put("ITA", "Italy");

        for (String key : countryMap.keySet()) {
            System.out.println(key + " - " + countryMap.get(key));
        }
        // Create a program that takes a sentence as input and counts the frequency of each word in the sentence.
        // Then, print out each word along with its frequency. (the cat sat on the mat)

        String words = "The cat sat on the mat";
        HashMap<String, Integer> wordFrequency = new HashMap<>();

        for (String word : words.split(" ")) {
            // Convert the word to lowercase for case-insensitive comparison
            word = word.toLowerCase();
            // Update the word count in the Map
            int count = wordFrequency.getOrDefault(word, 0);
            wordFrequency.put(word, count + 1);   }
        System.out.println("Word frequency: " + wordFrequency);

//Create a program that simulates a phonebook using a HashMap. Add some contacts to map and prints it’s content.
        HashMap<String, String> phoneMAP = new HashMap<>();

        phoneMAP.put("John Doe", "555-1234");
        phoneMAP.put("Jane Smith", "555-5678");
        phoneMAP.put("Emily Johnson", "555-8765");
        phoneMAP.put("Michael Brown", "555-4321");
        for (Map.Entry<String, String> entry : phoneMAP.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Number: " + entry.getValue());
        } */
// Remove duplicates from an array using HashSet.  (  Arrays.asList(1, 2, 3, 4, 5 ) )
        Scanner sc = new Scanner(System.in);
        HashSet<String> words = new HashSet<>();
        for (int i = 0; i <= 5; i++) {
            System.out.println("Enter a word: ");
            words.add(sc.nextLine());
        }
        System.out.println(words);
        System.out.println("The size of the HashSet is: " + words.size());

    }
}