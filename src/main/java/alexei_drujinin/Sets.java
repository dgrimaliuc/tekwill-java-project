package alexei_drujinin;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;


public class Sets {
    public static void main(String[] args) {
        printSetSize();
        printUniqueWords();
    }

    public static void printSetSize() {
        HashSet<String> names = new HashSet<>();
        names.add("Victory");
        names.add("Maxim");
        names.add("Dmitriy");
        names.add("Elena");
        System.out.println("Size of the Name set is " + names.size());
        System.out.println("Enter the name , to check if that name contains in the Set");
        Scanner sc = new Scanner(System.in);
        String searchName = sc.nextLine();
        if (names.contains(searchName)) {
            System.out.println("the Set is contain name " + searchName);
        }
            else{
            System.out.println("The "+searchName+" is not contains in the Set");
            }
    }
    public static void printUniqueWords(){
        System.out.println("Write your sentence");
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        HashSet<String> uniqueWords = new HashSet<>(Arrays.asList(sentence.split(" ")));

        TreeSet<String> sortedWords = new TreeSet<>(uniqueWords);
        System.out.println("Total number of unique words " + uniqueWords.size());
        System.out.println("Set after sorting in alphabetical order "+sortedWords);
    }
}
