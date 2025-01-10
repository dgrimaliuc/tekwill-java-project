package main.java.LunguSergiu;

public class homeTask {
    public static void main(String[] args) {
//       Calculează suma numerelor de la 55 la 111 folosind o buclă do-while.
        int count = 55;
        int sum = 0;
        while (count <= 111) {
            sum += count;
            System.out.println("The sum of the numbers from 55 to 111 is: " + sum);
            count++;
        }
    }
}
// Calculează suma numerelor de la 1 la 100 folosind o buclă for.
//    public static void main(String[] args) {
//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            sum += i;
//            System.out.println("The sum of the numbers from 1 to 100 is: " + sum);
//        }
//    }
//}
// Creează un program care găsește și afișează valoarea medie a tuturor elementelor dintr-un array de numere reale
//    public static void main(String[] args) {
//        double[] array = {1.5, 3.2, 4.8, 6.2, 7.8};
//        double sum = 0;
//        int n = array.length;
//        for (int i = 0; i < n; i++) {
//            sum += array[i];
//        }
//        double avg = sum / n;
//        System.out.println("Suma medie este: " + avg);
//
//    }
//}
//Creează un program care afișează un array de tip String, definit în cadrul programului
//    public static void main(String[] args) {
//        String[] car = {"BMW", "Honda", "Audi", "Ford"};
//        for (String s : car) {
//            System.out.println(s);
//        }
//    }
//