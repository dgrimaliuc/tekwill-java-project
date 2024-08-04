package IrinaSamurenco;

import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;

/*public class task4 {
    public static void main(String[] args) {


        //Create an Arraylist of Integer and print it’s elements using foreach.

        ArrayList<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, 25,12,16,78,95);
        for(int i : arr) {
            System.out.println(i);
        }

        //Create an Arraylist of String and collect all elements in single string, print result.

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "H", "e", "l", "l", "o");
        String result = "";
        for (String i : list) {
            result += i;

        }
        System.out.println(result);

        //Convert an array of integers to a Linked list, print the first and the last items.
        List<Integer> aL = Arrays.asList(1,2,3,4,5);
        LinkedList<Integer> lL = new LinkedList<>();
        for (int i : aL) {
            lL.add(i);
        }
        int first = lL.getFirst();
        int last = lL.getLast();
        System.out.println("arrayList " + aL);
        System.out.println("linkedList first item " + first + " and last item " + last);

        //Sort a linked list of String and print it before and after sorting. (Collections.sort())
        LinkedList<Integer> num = new LinkedList<>();
        Collections.addAll(num, 10,6,3,8,2,9,7,5,4,1);
        System.out.println("Before sorting: "+ num);
        Collections.sort(num);
        System.out.println("After sorting: " + num);


        //Create a program that simulates a phonebook using a HashMap.
        //Add some contacts to map and prints it's content.
        HashMap<String, String> phonebook = new HashMap<>();
        phonebook.put("John Doe", "555-1234");
        phonebook.put("Jane Smith", "555-5678");
        phonebook.put("Emily Johnson", "555-8765");
        phonebook.put("Michael Brown", "555-4321");

        for (String key : phonebook.keySet()) {
            System.out.println("Name: " + key  + "\nPhone: " + phonebook.get(key) + "\n");
        }
}*/


//for task5
public class task4 {

    public static void main(String[] args) {

            //Create an array ArrayList of strings and add some fruits inside, print array list on screen
        List<String> fruits = new ArrayList<>();
        Collections.addAll(fruits, "apple", "mango", "banana", "abricot");
        /*for (String i : fruits) {
            System.out.println(i);
        }*/
        System.out.println("Fruits: " + fruits);


        //Create a Set of strings and add some names to it. Print the size of the Set and check if a specific name exists in the Set.
        List<String> set = new LinkedList<>();
        Collections.addAll(set, "John", "Jane", "Michael", "Peter");
        String result = "";
        System.out.println("\nThe size of the Set is: " + set.size());
        for (int i = 0; i < set.size(); i++) {
            if (set.get(i) == "Jane") {
                result = set.get(i);
            }
        }
        System.out.println("The name '" + result + "' exists in the Set!\n");

        //Create a Map that stores the abbreviator as keys and names of countries as values. Add some pairs to the map and print content of map.
        HashMap<String, String> countries = new HashMap<>();
        countries.put("USA", "United States of America");
        countries.put("UK", "United Kingdom");
        countries.put("CAN", "Canada");
        countries.put("GER", "Germany");
        countries.put("FRA", "France");

        for (String key : countries.keySet()) {
            System.out.println(key + "-" + countries.get(key));
        }


        //Given two Maps that contain student names as keys and their corresponding scores as values, write a program to find the students who scored higher than  90  and store their names and scores in a new Map.
        HashMap<String, Integer> studentScores1 = new HashMap<>();
        studentScores1.put("Evelina", 85);
        studentScores1.put("Bob", 92);
        studentScores1.put("Charlie", 78);
        studentScores1.put("David", 95);
        HashMap<String, Integer> studentScores2 = new HashMap<>();
        studentScores2.put("Eve", 89);
        studentScores2.put("Frank", 81);
        studentScores2.put("Alice", 75);
        studentScores2.put("Alice", 91);// Duplicate name with different score
        studentScores2.put("George", 87);

        HashMap<String,Integer>  studentScoresHigh = new HashMap<>();

        for (String key : studentScores1.keySet()) {
            var score = studentScores1.getOrDefault(key, 0);
            if (score >= 90) {
                studentScoresHigh.put(key,score);
            }
        }
        for (String key : studentScores2.keySet()) {
            var score = studentScores2.getOrDefault(key, 0);
            if (score >= 90) {
                studentScoresHigh.put(key,score);
            }
        }
        System.out.println("\nGroup Students Score High:");
        for (String key : studentScoresHigh.keySet()) {
            System.out.println(key  + " - " + studentScoresHigh.get(key));
        }

    }

}
