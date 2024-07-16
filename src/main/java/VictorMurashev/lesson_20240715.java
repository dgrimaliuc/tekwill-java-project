package VictorMurashev;

import java.util.ArrayList;
import java.util.Arrays;

public class lesson_20240715 {
    public static void main(String[] args) {
        // Создание массива ArrayList для хранения данных о машинах
        /*ArrayList<String> cars = new ArrayList<>(Arrays.asList("Toyota", "Honda", "Ford", "BMW", "Audi"));


        for (String car : cars) {
            System.out.println(car);
        }*/

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        for (Integer number : numbers) {
            System.out.println(number);
        }

        ArrayList<String> strings = new ArrayList<>(Arrays.asList("1", "1", "1", "1", "1"));
        StringBuilder result = new StringBuilder();
        for (String str : strings) {
            result.append(str).append(" ");
        }
        System.out.println(result.toString());

    }

}
