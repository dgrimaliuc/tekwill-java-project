package AnastasiaGoncear.Lesson4HomeWorkAnastasiaGoncear;
//Create an array ArrayList of strings and add some fruits inside, print array list on screen

import java.util.ArrayList;

public class Task1ArrayList {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("peach");
        fruits.add("plum");
        fruits.add("cherry");

        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }
    }
}
