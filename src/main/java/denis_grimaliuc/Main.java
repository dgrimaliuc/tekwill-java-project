package main.java.denis_grimaliuc;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }

    /*
    1.
      // Creează un ArrayList de numere întregi și adaugă câteva numere în el.
        // Afișează elementele din ArrayList în ordine inversă.
        ArrayList<Integer> cars = new ArrayList<>();

        cars.add(1);
        cars.add(2);
        cars.add(3);
        cars.add(4);
        cars.add(5);
        cars.add(6);

        for (int i = cars.size() - 1; i >= 0; i--) {
            System.out.println(cars.get(i));
        }

        2.
        // Scrie un program care ia input de la utilizator și îl stochează într-un ArrayList.
        // Continuă să ceri input până când utilizatorul introduce „done” și apoi afișează conținutul ArrayList-ului.
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.println("Introduceți un element (sau 'done' pentru a termina): ");
            input = scanner.nextLine();
            if (input.equals("done")) {
                break;
            } else {
                list.add(input);
            }
        } while (!input.contains("done"));

        System.out.println("Lista finală: " + list);

        3.

         // Având două ArrayList-uri de numere întregi, scrie un program pentru a găsi elementele comune între ele
        // și a le stoca într-un nou ArrayList.
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);


        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(3);
        list2.add(5);
        list2.add(7);
        list2.add(10);

        ArrayList<Integer> commonElements = new ArrayList<>();

        for (int num : list1) {
            if (list2.contains(num)) {
                commonElements.add(num);
            }
        }

        System.out.println("Elementele comune sunt: " + commonElements);


        4. //  Creează un ArrayList de String și adună toate elementele într-un singur șir, afișează rezultatul.
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        strings.add("Java");
        strings.add("Programming");
        strings.add("ArrayList");

        String sum = "";

        for (String i : strings) {
            sum += i + " ";
        }

        System.out.println(sum);

     */
    public static void main(String[] args) {
        //  Scrie un program care citește o propoziție de la
        //  utilizator și stochează fiecare cuvânt unic într-un Set. Afișează numărul total de cuvinte unice.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceți o propoziție: ");
        String string = scanner.nextLine();

        String[] words = string.split(" ");

        var set = new HashSet<>(Arrays.asList(words));
        System.out.println(set);

        System.out.println(set.size());


    }
}
