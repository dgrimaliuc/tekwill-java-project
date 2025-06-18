package main.java.liliana_stavita;

public class fruitmainoop {


    public static void main(String[] args) {


        Fruit apple = new Fruit("APPLE;", "RED:",  72);
        Fruit banana = new Fruit("banana:", "green:",  199);
        Fruit orange = new Fruit("orange:", "blue:",  188);
        Fruit harbuz = new Fruit("harbuz:", "orange:",  46);
        Fruit melom = new Fruit("melom;", "dark:",  100);


        System.out.println(apple);
        System.out.println(banana);
        System.out.println(orange);
        System.out.println(harbuz);
        System.out.println(melom);

        apple.printInfo();
        banana.printInfo();
        orange.printInfo();
        harbuz.printInfo();
        melom.printInfo();

    }
}
