package LiubovZapsa;

public class Main {
    public static void main(String[] args) {
     /*
        int count = 0;
        while (count <= 10) {
            System.out.println(count);
            count++;

        int count = 0;
        while (count <= 50) {
            System.out.println(count);
            count += 2;


        String password = "2222";
        String input = "";
        Scanner sc = new Scanner(System.in);
        while (!input.equals((password))) {
            System.out.println("Enter password");
            input = sc.nextLine();
        }
        System.out.println("Corect password");
    */
        int count = 0;
        int sum = 0;
        while (count <= 100) {
            count += 2;
            sum += count;

        }
        System.out.println("Sum of all even numbers from 1  to 100: " + sum);
    }
}



