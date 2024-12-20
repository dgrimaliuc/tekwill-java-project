package main.java.LiliaRosca;

public class LR_2012_class_HW {
    //2. Create a checkAge() method with an integer variable callde age
    /*static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");
        } else {
            System.out.println("Access granted - You are old enough!");
        }    */
    // 3. Method that calculates average
    public static double calculAverage(int... numbers) {
      double sum = 0;
      for (int number :numbers) {
          sum += number;
      }
      return sum / numbers.length;
    }

    // public static int suma
}


    public static void main(String[] args) {
        // 2. checkAge(20); // call the checkAge method
        // 3.
        var average = calculAverage( ...numbers)
    }
}
