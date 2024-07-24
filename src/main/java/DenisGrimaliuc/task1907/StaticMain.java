package DenisGrimaliuc.task1907;

public class StaticMain {
    // Create a class, create a static field inside, create two objects of class,
    // change the variable and print result for two objects.

    static int a = 5;

    public static void main(String[] args) {
        System.out.println("a=" + a);
        StaticMain ob1 = new StaticMain();
        StaticMain ob2 = new StaticMain();
        ob2.a = 10;
        System.out.println("a=" + a);
        System.out.println("ob1.a=" + ob1.a);
        System.out.println("ob2.a=" + ob2.a);

    }
}
