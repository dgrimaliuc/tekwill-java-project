package zabun_mihail;

public class WhileDo {
    public static void main(String[] args) {
        printNum();
        sumNum();
        evenNum();
    }

        // 1. Print numbers from 1 to 10 using a while-do loop.
        public static void printNum() {
            int i = 1;
            System.out.print(" ");
            while (i <= 10) {
                System.out.print(i + " ");
                i++;
            }
        }
        // 2. Calculate the sum of numbers from 1 to 100 using a do-while loop.
        public static void sumNum() {
            int j = 1, sum = 0;
            do {
                sum += j;
                j++;
            }
            while (j <= 100);
            System.out.print("\n Sum of num: " + sum);
        }
        // 3. Print the even numbers from 1 to 20 using a while-do loop.
        public static void evenNum() {
        int i = 1;
        System.out.print("\n List of even num: ");
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }

    }

}
