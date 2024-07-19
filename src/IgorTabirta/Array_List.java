package IgorTabirta;

import java.util.*;

public class Array_List {
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

        ArrayList<Integer> numbers1 = new ArrayList<>();
        String input = "";
        Scanner sc = new Scanner(System.in);

        while (!input.equals("done")) {
            System.out.println("Enter a number: ");
            input = sc.nextLine();
            if (!input.equals("done")) {
                numbers1.add(Integer.parseInt(input));
            }
        }

        System.out.println(numbers1);

        //Given two ArrayLists of integers, write a program to find the common elements between them and store them in a new ArrayList.
        ArrayList<Integer> numbers3 = new ArrayList<>();
        String input1 = "";
        Scanner sc1 = new Scanner(System.in);

        while (!input1.equals("done")) {
            System.out.println("Enter a number: ");
            input1 = sc.nextLine();
            if (!input1.equals("done")) {
                numbers3.add(Integer.parseInt(input1));
            }
        }


        System.out.println(numbers);

        //Given two ArrayLists of integers, write a program to find the common
        // elements between them and store them in a new ArrayList.

        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(1);
        numbers2.add(2);
        numbers2.add(3);
        numbers2.add(4);
        numbers2.add(5);

        ArrayList<Integer> numbers4 = new ArrayList<>();
        Collections.addAll(numbers2, 1, 2, 3, 4, 5, 6, 7);


        for (int i = 0; i < numbers2.size(); i++) {
            for (int j = 0; j < numbers4.size(); j++) {

                if (numbers1.get(i) == numbers2.get(j)) {
                    System.out.println(numbers1.get(i));
                }

            }
        }

        ArrayList<String> list = new ArrayList<>(); // Создание ArrayList для хранения строк

        list.add("Apple"); // Добавление элемента в список
        list.add("Banana");
        list.add("Cherry");

        System.out.println(list); // Вывод списка: [Apple, Banana, Cherry]

        list.remove("Banana"); // Удаление элемента из списка

        System.out.println(list); // Вывод списка после удаления: [Apple, Cherry]

        list.add(0, "Kiwi"); // Добавили ["Kiwi"] в начало списка
        System.out.println(list);
        list.add("Banana");
        System.out.println(list);
        list.add(1, "Coffee"); // Добавили ["Coffee"] в список под индексом 1
        System.out.println(list);
        System.out.println(list.size());

        // Create an Arraylist of String and collect all elements in single string, print result.
        List<String> nums = Arrays.asList("1", "2", "3", "4", "5");
        String result = "";

        for (String num : nums) {
            result += num + " ";
        }
        System.out.println(result.trim());


    }
}
