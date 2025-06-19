package main.java.lilia_toma;

import java.util.*;

public class Collections {
//    public static void main(String[] args) {
    //ArrayList<String> cars = new ArrayList<>();   sau
//var vars2 = new ArrayList<String>()

//       ** ArrayList<String> cars = new ArrayList<>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Opel");
//        cars.add("Mazda");
//        cars.add("Audi");
//        cars.add("Mercedes");
//
//        System.out.println(cars);
//
//        System.out.println("First car: " + cars.get(0));
//        cars.set(0, "Tesla");
//        System.out.println("First car: " + cars.get(0));
//    }
//}
//    **ArrayList<String> cars = new ArrayList<String>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//        for (String i : cars) {
//            System.out.println(i);
//        }}}

//    //1. Creeaza un ArrayList din numere intregi si adauga cateva numere in el.
//    // Afiseaza elementele din ArrayList in ordine inversa.
//    ArrayList<Integer> cars = new ArrayList<>();
//
//        cars.add(1);
//        cars.add(2);
//        cars.add(3);
//        cars.add(4);
//        cars.add(5);
//        cars.add(6);
//        for (int i = cars.size() - 1; i >= 0; i--) {
//            System.out.println(cars.get(i));
//        }}}
//        //2. Scrie un program care ia input de la utilizator si il stocheaza intr-un ArrayList.
//        // Continua sa ceri input pana cand utilizatorul introduce "done" si apoi afiseaza continutul ArrayList-ului.
//    ArrayList<String> list = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//        String input;
//        do {
//            System.out.println("Introduceti un element (sau 'done' pentru a termina): ");
//        input = scanner.nextLine();
//        if (input.equals("done")) {
//        break;
//        } else {
//            list.add(input);
//        }
//        } while (!input.contains("done"));
//        System.out.println("Lista finala: " + list);
//    }
//    }
//        //3. Avand doua ArrayList-uri de numere intregi, scrie un program
//        // pentru a gasi elementele comune intre ele si a le stoca intr-un nou ArrayList.
//    ArrayList<Integer> list1 = new ArrayList<>();
//        list1.add(1);
//        list1.add(2);
//        list1.add(3);
//        list1.add(4);
//        list1.add(5);
//    ArrayList<Integer> list2 = new ArrayList<>();
//        list2.add(1);
//        list2.add(3);
//        list2.add(5);
//        list2.add(7);
//        list2.add(10);
//    ArrayList<Integer> commonElements = new ArrayList<>();
//
//    for (int num : list1) {
//        if (list2.contains(num)) {
//            commonElements.add(num);
//        }
//    }
//        System.out.println("Elementele comune sunt: " + commonElements);
//}}
//        //4.Creeaza un ArrayList de Integer si afiseaza elementele sale folosind for-each.
//        ArrayList<Integer> nums = new ArrayList<>();
//        nums.add(8);
//        nums.add(10);
//        nums.add(13);
//        nums.add(19);
//        for (int i : nums) {
//            System.out.println(i);
//        }}}

//        //5.Creeaza un ArrayList de String si aduna toate elementele intr-un singur sir, afiseaza rezultatul.
//        ArrayList<String> month = new ArrayList<String>();
//        month.add("Iunie");
//        month.add("Iulie");
//        month.add("August");
//        month.add("Septembrie");
//        month.add("Octombrie");
//
//            System.out.println(month);
//        }}

    /**-----------LinkedList-------------**/
//////1. Crearea unei liste legate: Scrie o functie pentru a crea o
////// lista dintr-un array de numere intregi.(Arrays.asList())
//            public static void main(String[] args) {
//            Integer[] numbers = {1, 2, 3, 4, 5};
//
//        List<Integer> list = Arrays.asList(numbers);
//        System.out.println("Lista creata din array; " + list);
//
//        var List = Arrays.asList(1, 2, 3, 4, 5);
//    }}
////2. lista inversata*/
//            public static void main(String[] args) {
//        Integer[] numbers = {1, 2, 3, 4, 5};
//
//        List<Integer> list = new ArrayList<>(Arrays.asList(numbers));
//        System.out.println("Lista creata din array: " + list);
//        java.util.Collections.reverse(list);
//        System.out.println("Lista inversata: " + list);
//            }
//}
    ////3. Scrie o functie pentru a concatina (completa) doua liste legate.
//            public static void main(String[] args) {
//                List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
//                List<Integer> list2 = Arrays.asList(6, 7, 8, 9, 10);
//
//                List<Integer> combinedList = new ArrayList<>();
////                java.util.Collections.copy(combinedList, list1);
//                combinedList.addAll(list1);
//                combinedList.addAll(list2);
//                System.out.println(combinedList);
//            }}

    /**
     * ---------------HashMap---------------
     */
    public static void main(String[] args) {
//                        // Create a HashMap object called capitalCities
//                        HashMap<String, String> capitalCities = new HashMap<String, String>();
//
//                        // Add keys and values (Country, City)
//                        capitalCities.put("England", "London");
//                        capitalCities.put("Germany", "Berlin");
//                        capitalCities.put("Norway", "Oslo");
//                        capitalCities.put("USA", "Washington DC");
//                        System.out.println(capitalCities);
//                    }}

//            HashMap<String, String> map = new HashMap<>();
//            map.put("key1", "value1");
//            map.put("key2", "value2");
//            map.put("key3", "value3");
//
//        //   for (String key : map.keySet()) {
//        //           System.out.println("Key: " + key + ", Value: " + map.get(key));}
//                System.out.println(map);
//            }}

//                // exercitiu Map ---- 1. Creeaza un Map care stocheaza abrevierile
//               // ca chei si numele tarilor ca valori. Afiseaza-le pe toate.
//            HashMap<String, String> countryMap = new HashMap<>();
//
//            countryMap.put("USA", "United States of America");
//            countryMap.put("UK", "United Kingdom");
//            countryMap.put("CAN", "Canada");
//            countryMap.put("GER", "Germany");
//            countryMap.put("FRA", "France");
//
//            for (String key :  countryMap.keySet()) {
//                   System.out.println(key + " => " + countryMap.get(key));}
//
//                    System.out.println(countryMap);
//            }}

//                  // exercitiu Map ---- 2. Scrie un program care ia o pozitie ca input si
//                  // numara frecventa fiecarui cuvant din propozitie. Apoi, afiseaza fiecare
//                  // cuvant impreuna cu frecventa sa. (exemplu "the cat sat on the mat")
//
//            String[] words = {"the", "cat", "sat", "on", "the", "mat"};
//
//            HashMap<String, Integer> wordFrequency = new HashMap<>();
//
//            for (String word :  words) {
//                //Convert the word to lowercase for case-insensitive comparison
//                word = word.toLowerCase();
//                // Update the word count in the Map
//                int count = wordFrequency.getOrDefault(word, 0);
//                wordFrequency.put(word, count + 1);
//            }
//            System.out.println(wordFrequency);
//                    }}

//            /**-----------Collections---------shuffle, sort, fill-----*/
//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        numbers.add(4);
//        java.util.Collections.shuffle(numbers);
//        System.out.println("ArrayList-ul amestecat este: " + numbers);
//
//        java.util.Collections.sort(numbers);
//        System.out.println("ArryList-ul sortat este: " + numbers);
//
//        java.util.Collections.fill(numbers, 0); /**inlocuieste toate elementele cu valoarea indicata*/
//        System.out.println("ArrayList-ul dupa umplere este: " + numbers);
//    }
//}
//        //ex.1. Elimina dublicatele dintr-un array folosind HashSet. (Arrays.asList(1, 2, 3, 4, 5)).
//        List<Integer> numbers = Arrays.asList(99, 99, 66, 1, 2, 3, 4, 5, 5, 5, 5, 55, 5, 1, 2, 3, 4, 10);
//        var set = new HashSet<>(numbers);
//        System.out.println(set);
//    }
//}
        //ex.2. Scrie un program care citeste o propozitie de la utilizator si stocheaza
        // fiecare cuvant unic intr-un Set. Afiseaza numarul total decuvinte unice.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti o propozitie: ");
        String string = scanner.nextLine();

        String[] words = string.split(" ");

        var set = new HashSet<>(Arrays.asList(words));
        System.out.println(set);
        System.out.println(set.size());
    }
}