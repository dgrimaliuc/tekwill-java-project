public class Main {
    public static void main(String[] args) {
//        int num = 10;
//        if (num>0){
//            if (num%2 == 0){
//                System.out.println("Numar pozitiv par");
//            }
//            else {
//                System.out.println("Numar pozitiv impar");
//            }
//
//        }else if (num<0){
//            System.out.println("Numar negativ");
//        } else {
//            System.out.println("Zero");
//        }
        int max;
        int a = 5;
        int b = 6;
        int c = 13;
        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }

        System.out.println("Maximul este: " + max);
    }
}