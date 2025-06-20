package main.java.NataliaChihai;

public class Methods {

    public static void main(String[] args) {
        greet();
        dif(14,2);
        int max= maxCount(4,5,6);
        System.out.println("Maximul este: " + max);
    }
    //Scrie o metodă Java numită „greet” care afișează un mesaj de salut în consolă, cum ar fi „Hello World!”
    public static void greet(){
        System.out.println("hello world");
    }
    public static void dif(int a, int b){
        System.out.println(a-b);
    }
    public static int maxCount(int a, int b, int c){
        int max = a;
        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }
        return max;
        }

}


