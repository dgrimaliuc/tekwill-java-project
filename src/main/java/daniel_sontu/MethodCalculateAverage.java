package main.java.daniel_sontu;

public class MethodCalculateAverage {

    static double calculateAverage(int[] numbers){

        int sum =0;
        for (int number : numbers){
            sum += number;
        }
        return (double) sum / numbers.length;
    }


    public static void main(String[] args) {
        int []arr = new int[]{0,1,2,3,4,5,6,7,8,9,10};

        var result = calculateAverage(arr);
        System.out.println("Media este " +result);

    }
}
