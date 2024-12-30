package main.java.IonErm.Old;

import java.util.HashMap;

public class Array {
    public static void main(String[] args) {
        /*ClassWork*/
//        ArrayList<String> cars = new ArrayList<>();
//        cars.add("Tesla");
//        cars.add("Opel");
//        cars.add("Dacia");
//        cars.add("Mitsubishi");
//        cars.add("Dodge");
//        for (String i : cars) {
//            System.out.println(i);
//        }
//        ArrayList<Integer> number = new ArrayList<>();
//        number.add(23);
//        number.add(34);
//        number.add(678);
//        number.add(123);
//        number.add(456);
//        for (Integer i : number) {
//            System.out.println(i);
//        }

//        ArrayList<String> words = new ArrayList<>();
//        words.add("Tesla");
//        words.add("Opel");
//        words.add("Dacia");
//        words.add("Mitsubishi");
//        words.add("Dodge");
//        String sum = "";
//        for (String s : words) {
//            sum += s + " ";
//        }
//        System.out.println(sum);

//        HashMap<String, String> capitalsCities = new HashMap<>();
//        capitalsCities.put("England", "London");
//        capitalsCities.put("Moldova", "Chisinau");
//        capitalsCities.put("Ukraine", "Kiyv");
//        capitalsCities.put("Romania", "Bucharest");
//        capitalsCities.put("Serbia", "Bratislava");
//
//        System.out.println(capitalsCities.get("England"));

        HashMap<String, Integer> people = new HashMap<>();
        people.put("John", 23);
        people.put("Morgan", 34);
        people.put("Kyle", 78);
        for (String i : people.keySet()) {
            System.out.println("key " + i + " value: " + people.get(i));
        }


    }
}
