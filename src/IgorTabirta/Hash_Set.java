package IgorTabirta;

import java.util.HashSet;
import java.util.Scanner;

public class Hash_Set {
    public static void main(String[] args) {
        // Remove duplicates from an array using HashSet.  (  Arrays.asList(1, 2, 3, 4, 5 ) )

        HashSet<String> words = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 4; i++) {
            System.out.println("Enter a word: ");
            words.add(sc.nextLine());
        }

        System.out.println(words);
        System.out.println("The size of the HashSet is: " + words.size());
    }
}
