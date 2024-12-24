package main.java.IonErm.Old;

public class Loops {
    public static void main(String[] args) {
        /*ClassWork*/
//        int count = 1;
//        while (count <= 10) {
//            System.out.println("Count: " + count);
//            count++;
//        }

//        int count = 10;
//        while (count > 0) {
//            System.out.println("Count: " + count);
//            count--;
//        }

//        int a = 1;
//        int sum = 0;
//        while (a <= 50) {
//            if (a % 2 == 0) {
//                sum += a;
//            }
//            a++;
//        }
//        System.out.println(sum);

//        for (int i = 1; i <= 10; i++) {
//            System.out.println("Count: " + i);
//        }

//        int sum = 0;
//        for (int i = 1; i <= 51; i += 2) {
//            sum += i;
//        }
//        System.out.println(sum);

//        Scanner scanner = new Scanner(System.in);
//        String password = "123456";
//        String introducedPass;
//        do {
//            System.out.println("Introduce password: ");
//            introducedPass = scanner.nextLine();
//        } while (!introducedPass.equals(password));


        /*HomeWork*/
//        Calculează suma numerelor de la 55 la 111 folosind o buclă do-while.
        int sum = 0;
        int number = 55;
        do {
            sum += number;
            number++;
        } while (number <= 111);
        System.out.println(sum);

//      Calculează suma numerelor de la 1 la 100 folosind o buclă for.
        int sum1 = 0;
        for (int i = 0; i <= 100; i++) {
            sum1 += i;
        }
        System.out.println(sum1);

//      Creează un program care găsește și afișează valoarea medie a tuturor elementelor dintr-un array de        numere reale.
        double[] numbers = {1.5, 23.8, 45.92138, 56.2112, 78.3, 213.34213, 10.8};
        double mid = 0;
        for (double i : numbers) {
            mid += i;
        }
        System.out.println("Middle of array: " + mid / numbers.length);

//      Creează un program care afișează un array de tip String, definit în cadrul programului.
        String[] animals = {"Bull", "Cat", "Owl", "Chicken", "Bear"};
        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}
