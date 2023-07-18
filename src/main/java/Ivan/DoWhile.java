package Ivan;


public class DoWhile {
    public static void main(String[] args) {

        //1
        int c = 50;
        while (c <= 10) {
            System.out.print(c + " ");
            c++;
        }

        //2
        int d = 0;
        int sum = 0;
        do {
            d++;
            sum = sum + d;
        } while (d < 100);
        System.out.println("\n" + "Sum of numbers from 1 to 100 = " + sum);

        //3
        int g = 1;
        while (g < 20) {
            if (g % 2==0) {
                System.out.print(g + " ");
            }
            g++;
        }
    }
}