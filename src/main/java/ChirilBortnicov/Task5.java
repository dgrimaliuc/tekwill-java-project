package ChirilBortnicov;

import java.util.HashMap;

public class Task5 {
    // public static void main(String[] args) {
    //     int num1 = 5;
    //     int num2 = 10;
    //    int sum = num1 + num2;
    //    System.out.println(sum);
    // }
    // public static void main(String[] args) {
    //   int num1 = 30;
    // int num2 = 20;
    //   if (num1 == num2){
    //       System.out.println("Numbers are equals");
    //   } else {
    //       System.out.println("Numbers not equals");
    //   }
    // }
    // public static void main(String[] args) {
    //    int num1 = 30;
    //     if (num1 > 0) {
    //         System.out.println("number is positive");
    //     } else if (num1 < 0) {
    //         System.out.println("number is negative");
    //     } else if (num1 == 0) {
    //         System.out.println("number is zero");
    //     }
    // }
    //   public static void main(String[] args) {
    //       int num1 = 10;
    //       int num2 = 20;
    //       int num3 = 30;
    //   if (num1 > num2 && num1 > num3){
    //       System.out.println("Num1 is biggest");
    //   } else if (num2 > num1 && num2 > num3){
    //       System.out.println("Num2 is biggest");
    //   } else {
    //       System.out.println("Num3 is biggest");
    //   }
//  }
//    public static void main(String[] args) {
//        String FirstName;
//        String LastName;
    //       Scanner sc = new Scanner(System.in);
//        System.out.println("Enter FirstName: ");
//        FirstName = sc.nextLine();
//        System.out.println("Enter LastName: ");
//        LastName = sc.nextLine();
//        System.out.println("Your full name :" + FirstName +" "+ LastName);
//
//    }
  /*  public static void main(String[] args) {
        ArrayList<String> numbers = new ArrayList<>();
        String input = "";
        Scanner sc = new Scanner(System.in);

        while(!input.equals("done")){
            System.out.println("Enter a number: ");
            input = sc.nextLine();
            if (!input.equals(("done"))) {
                numbers.add(input);
            }
            System.out.println(numbers);
        }
    } */
    //Create an Arraylist of Integer and print it’s elements using foreach.
    // Create an Arraylist of String and collect all elements in single string, print result. ["1","1","1","1","1"] // "1 1 1 1 1"
  /*  public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(24);
        numbers.add(34);
        numbers.add(44);
        numbers.add(54);
        numbers.add(64);
        numbers.forEach((n) -> System.out.println(n));
    } */
   /* public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("1");
        str.add("1");
        str.add("1");
        str.add("1");
        str.add("1");
        str.stream().forEach(System.out::println);
        } */

    //Convert an array of integers to a Linked list, print the first and the last items.
    //Sort a linked list and print it before and after sorting. (Collections.sort())
   /* public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(arr));
        int first = list.getFirst();
        int last = list.getLast();
        System.out.println("First: " + first + "\n" + "Last: " + last);
    } */
  /*  public static void main(String[] args) {
        Integer[] arr = {8, 4, 31, 23, 53};
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(arr));
        Collections.sort(list);
        System.out.println(list);
    } */
    public static void main(String[] args) {
       /* Create a program that simulates a phonebook using a HashMap. Add some contacts to map and prints it’s content.
        "John Doe", "555-1234"
        "Jane Smith", "555-5678"
        "Emily Johnson", "555-8765"
        "Michael Brown", "555-4321"*/
        HashMap<String, String> phonebook = new HashMap<>();
        phonebook.put("John Doe", "555-1234");
        phonebook.put("Jane Smith", "555-5678");
        phonebook.put("Emily Johnson", "555-8765");
        phonebook.put("Michael Brown", "555-4321");

        for (String i : phonebook.keySet()) {
            System.out.println(i + " " + phonebook.get(i));
        }
    }
}

