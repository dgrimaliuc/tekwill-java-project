package alexei_drujinin;

public class WhileDo {

    public static void main(String[] args) {
        printNumbers();
        sumOfNumbers();
        printEvenNumbers();
    }

    public static void printNumbers() {
        int num = 0;
        while (num < 10) {
            num = num + 1;
            System.out.println(num);
        }
    }

    public static void sumOfNumbers() {
        int i = 1;
        int summ = 0;
        do {
            summ = summ + i;
            i++;
        } while (i <= 100);
        System.out.println(summ);
    }

    public static void printEvenNumbers() {
        int i = 0;
        while (i <= 20) {

            System.out.println(i);
            i += 2;
        }

    }
}



