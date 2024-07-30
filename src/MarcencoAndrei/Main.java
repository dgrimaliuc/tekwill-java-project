package MarcencoAndrei;

public class Main {


//    Create a toUpperCase method and inside print the UpperCase of  a provided string.
//    Catch NullPointer exception and on catch print “String Is Null”.

//    public static void toUpperCase(String[] args) {
//        try {
//            System.out.println(toUpperCase("asds"););
//        }
//
//    }
//
//    }

//    public static double divide2(double a, double b) {
//        if (b == 0) {
//            throw new ArithmeticException("the second number cannot be 0");
//        }
//        System.out.println(a / b);
//        return 0;
//    }
//
//    public static void main(String[] args) {
//        divide2(5, 0);
//    }
//}

    //Create a toUpperCase method and inside print the UpperCase of  a provided string.
//Throw a NullPointer exception with message “The provided string is null.” when string is null.
    public static void main(String[] args) {
        //Normal case
        toUpperCase("Hello World");
        //Null pointer case
        toUpperCase(null);
    }

    public static void toUpperCase(String str) {
        try {
            String upString = str.toUpperCase();
            System.out.println("Uppercase string: " + upString);
        } catch (NullPointerException e) {
            System.out.println("String Is Null");
        }
    }
}

//
//    public static void printSecond(Object[] arr) {
//        try {
//            System.out.println(arr[1]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Not Found");
//        }
//
//    }
//}

/*
//Create an array ArrayList of strings and add some fruits inside, print array list on screen
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("pineapple");
        fruits.add("grapefruit");
        fruits.add("orange");
        fruits.add("annoying orange");
        for (String list : fruits)
            System.out.println(list); */
//  Create a Set of strings and add some names to it. Print the size of the Set and check if a specific name exists in the Set.
       /*  HashSet<String> names = new HashSet<>();
        names.add("Dave");
        names.add("Carl");
        names.add("Spilberg");
        names.add("Seagal");
        names.add("Conrad");

        // used info from https://www.javatpoint.com/java-hashset-contains-method
        System.out.println("Size: " + names.size() + " " + names.contains("conrad")); */


      /* originally I wanted to use scanner to input a name and check if it exists inside in set, but did not understand how
        Scanner name = new Scanner();
        for (String name : names) {
            if (name.equals(names)) {
                System.out.println("Name " + names + " exists in the set");
                break;
            }
        } */


// Create a Map that stores the abbreviator as keys and names of countries as values. Add some pairs to the map and print content of map.
//  countryMap.put(“USA”, “United States of America”);

        /* String specificCountryAbbreviation = "MD";

        HashMap<String, String> countryMap = new HashMap<>();

        countryMap.put("UK", "United Kingdom");
        countryMap.put("GER", "Germany");
        countryMap.put("MD", "Moldova");
        countryMap.put("USA", "United States of America");

        System.out.println("Country name for " + specificCountryAbbreviation + " abbreviation is: " + countryMap.get(specificCountryAbbreviation)); */


