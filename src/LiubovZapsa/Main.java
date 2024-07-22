package LiubovZapsa;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
       /*
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.set(0, "Toyota");

        System.out.println(cars);
        cars.add(0, "Mers");
        System.out.println(cars);
        cars.remove(0);
        System.out.println(cars);
        cars.clear();
        System.out.println(cars);

        for (String car : cars) {
            System.out.println(car);

        //ArrayList of integers and add some numbers to it.
        // Print the elements of the ArrayList in revers order.
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        for (int i = numbers.size() - 1; i >= 0; i = i - 1) {
            System.out.println(numbers.get(i));

        // Write a program that takes input from the user and
        // stores it in an ArrayList.
        //Keep taking input until the use enters "done"
        // and then display the contents of the ArrayList
        ArrayList<String> numbers = new ArrayList<>();
        String input = "";
        Scanner sc = new Scanner(System.in);

        while (!input.equals("done")) {
            System.out.println("Enter a number: ");
            input = sc.nextLine();
            if (!input.equals("done")) {
                numbers.add(input);
            }
        }
        System.out.println(numbers);

//Create an ArrayList of integer and print its
// elemens using foreach
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        for (String car : cars) {
            System.out.println(car);

        // Creat an ArrayList of String and collect all
        // elements in single string, print result.
        // "1","1","1","1","1" / "1 1 1 1 1  "

        List<String> nums = Arrays.asList("1", "2", "3", "4");
        String result = "";
        for (String num : nums) {
            result += num + " ";
        }
        System.out.println(result.trim());


        // Linked List Creation- from ArrayList
        Integer[] arr = {1, 2, 3, 4, 5};
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(arr));
        //Write a function to reverse a LinkedList
        Collections.reverse(list);
        System.out.println(list);

// Write a function to concatenate(объединение 2х списков в один)
        //two LinkedLists
        LinkedList<String> list1 = new LinkedList<>();
        Collections.addAll(list1, "1", "2", "3", "4");
        LinkedList<String> list2 = new LinkedList<>();
        Collections.addAll(list2, "5", "6", "7", "8");
        LinkedList<String> list3 = new LinkedList<>(list1);
        list3.addAll(list2);
        System.out.println(list3);

// Convert an array of integers to a Linked list,
// print the first and the last items.

        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // Create an array
        var r = Arrays.asList(arr); // Convert the array to a list
        LinkedList<Integer> linkedList = new LinkedList<>(r);
        System.out.println("First element: " + linkedList.getFirst());
        System.out.println("Last element: " + linkedList.getLast());

        // Sort a linked list of String and print it before and after sorting.
        LinkedList<String> linkedlist = new LinkedList<>(Arrays.asList("My", "curs", "is", "Java"));
        System.out.println("Before sorting:" + linkedlist);
        Collections.sort(linkedlist);
        System.out.println("After sorting:" + linkedlist);
        Collections.shuffle(linkedlist);
        System.out.println("After sorting:" + linkedlist);

        //Create a Map that stores the abbreviator as keys and names of
        // countries as values. Add some pairs to the map and print content of map.
        //       countryMap.put(“USA”, “United States of America”);
        //       (“UK”, “United Kingdom”);
        //       (“CAN”, “Canada”);
        //       (“GER”, “Germany”);
        //       (“FRA”, “France”);

        HashMap<String, String> countryMap = new HashMap<>();
        countryMap.put("USA", "United States of America");
        countryMap.put("UK", "United Kingdom");
        countryMap.put("CAN", "Canada");
        countryMap.put("GER", "Germany");
        countryMap.put("FRA", "France");
        for (String key : countryMap.keySet()) {
            System.out.println(key + " - " + countryMap.get(key));


        // Create a program that takes a sentence as input and counts the frequency of each word in the sentence.
// Then, print out each word along with its frequency. (the cat sat on the mat)
        String words = "The cat sat on the mat";
        HashMap<String, Integer> wordFrequency = new HashMap<>();

        for (String word : words.split(" ")) {
            // Convert the word to lowercase for case-insensitive comparison
            word = word.toLowerCase();
            // Update the word count in the Map
            int count = wordFrequency.getOrDefault(word, 0);
            wordFrequency.put(word, count + 1);
        }

        System.out.println("Word frequency: " + wordFrequency);

        //Create a program that simulates a phonebook using a HashMap.
        // Add some contacts to map and prints it’s content.
        //"John Doe", "555-1234"
        //"Jane Smith", "555-5678"
        //"Emily Johnson", "555-8765"
        //"Michael Brown", "555-4321"
        HashMap<String, Integer> people = new HashMap<String, Integer>();
        people.put("John Doe", 5551234);
        people.put("Jane Smith", 5555678);
        people.put("Emily Johnson", 5558765);
        people.put("Michael Brown", 5554321);
        for (String key : people.keySet()) {
            System.out.println(key + " : " + people.get(key));


        // Remove duplicates from an array using HashSet.(  Arrays.asList(1, 2, 3, 4, 5 ) )
        HashSet<Integer> nums = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 5, 5, 5));
        System.out.println(nums);


        HashSet<String> words = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 3; i++) {
            System.out.println("Enter a word: ");
            words.add(sc.nextLine());
        }

        System.out.println(words);
        System.out.println("The size of the HashSet is: " + words.size());
    */
        // Using null
        HashMap<String, Integer> map = new HashMap<>();
        var value = map.get("Name");
        if (value == null) {
            System.out.println("Value is null");
        } else {
            System.out.println("Value is not null");
        }
    }
}
