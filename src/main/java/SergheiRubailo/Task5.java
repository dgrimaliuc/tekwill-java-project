package SergheiRubailo;

import java.util.HashMap;

public class Task5 {
    public static void main(String[] args) {
        /*1
        ArrayList<String> cars = new ArrayList<>();

        cars.add("Volvo");
        cars.add("Opel");
        cars.add("Mazda");
        cars.add("Honda");
        cars.add("BMW");
        cars.add(0, "Mercedes");
        cars.set(0, "Toyota");
        System.out.println(cars);
        System.out.println(cars.size());

        cars.remove(0);
        System.out.println(cars);

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        for (String car : cars)
            System.out.println(car);

        cars.clear();
        System.out.println(cars);
        System.out.println(cars.size());
        */

        /*Task 1*/
        /*Create an Arraylist of Integer and print it’s elements using foreach.

        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(45);
        arr1.add(32);
        arr1.add(44);
        arr1.add(12);
        arr1.add(8);

        for (Integer i : arr1)
            System.out.println(i);

        /*Create an Arraylist of String and collect all elements in single string, print result.
        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("12");
        arr2.add("gg");
        arr2.add("34");
        arr2.add("tr");
        arr2.add("ew");
        arr2.add("90");

        String out = "";

        for (String s : arr2)
            out = out + s + " ";

        System.out.println(out.trim());
        */

        /*Task2*/
        /*Convert an array of integers to a Linked list, print the first and the last items.

        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(numbers));
        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());

         */

        /*Sort a linked list and print it before and after sorting. (Collections.sort())
        System.out.println("Before: " + list);
        Collections.reverse(list);
        System.out.println("After: " + list);

         */

        /*Task3*/
        /*Create a program that simulates a phonebook using a HashMap. Add some contacts to map and prints it’s content.
        "John Doe", "555-1234"
        "Jane Smith", "555-5678"
        "Emily Johnson", "555-8765"
        "Michael Brown", "555-4321"*/

        HashMap<String, String> hash = new HashMap<>();
        hash.put("John Doe", "555-1234");
        hash.put("Jane Smith", "555-5678");
        hash.put("Emily Johnson", "555-8765");
        hash.put("Michael Brown", "555-4321");

        System.out.println(hash);
    }
}
