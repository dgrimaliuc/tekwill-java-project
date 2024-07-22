package Lesson4AnastasiaGoncear;

import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    public static void main(String[] args) {
        // Create a HashMap to store the phonebook contacts
        HashMap<String, String> phonebook = new HashMap<>();

        // Add contacts to the phonebook
        phonebook.put("John Doe", "555-1234");
        phonebook.put("Jane Smith", "555-5678");
        phonebook.put("Emily Johnson", "555-8765");
        phonebook.put("Michael Brown", "555-4321");

        // Print the content of the phonebook
        for (Map.Entry<String, String> entry : phonebook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
