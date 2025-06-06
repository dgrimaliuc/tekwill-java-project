package main.java.daniel_sontu;

public class array {

//    public static void main(String[] args) {
//
//        String[] cars = {"Volvo", "Bmw", "Ford", "Mazda", "Mercedes"};
//        for (String i : cars ){
//            System.out.println(cars);
//        }
//    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4, 3532, 235, 01, 23};
        int sum = 0;

        for (int i: nums){
            sum += i;
        }
        System.out.println("Summ of all numbers is: = " +sum);
    }
}
