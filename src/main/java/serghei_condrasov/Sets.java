package serghei_condrasov;

import java.util.*;

public class Sets {
    public static void main(String[] args) {

    /*1. Create a Set of strings and add some names to it.
    Print the size of the Set and check if a specific name exists in the Set.*/

        Set<String> mySet = new HashSet<>();
        mySet.add("Serghei");
        mySet.add("Anna");
        mySet.add("Dmitrii");
        mySet.add("Olga");

        for (String x : mySet) ;
        System.out.print("size of the Set" + " = " + mySet.size());
        System.out.println();
        System.out.println("If the set contains the name Anna?" + " " + mySet.contains("Anna"));

        /*2. Write a program that reads a sentence from the user and stores each unique word in a Set.
        Print the total number of unique words and display them in alphabetical order.*/

        Set<String> mySet_2 = new HashSet<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your text:");
        String input = scan.nextLine();

        for (String words : input.split(" ")) {
            mySet_2.add(words);
        }
        System.out.println("Your text contains " + mySet_2.size() + " of unique words");
        List<String> myList = new ArrayList<String>(mySet_2);
        Collections.sort(myList);
        System.out.print(myList);
    }
}
