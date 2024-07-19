package IgorTabirta.Obj;

public class Runner {
    public static void main(String[] args) {
        Main myObj = new Main();
        myObj.x = 25;
        System.out.println(myObj.sum());
        // 1.
        Person person = new Person();
        person.printInfo();
        person.age = 32;
        person.printInfo();
        System.out.print("\n");
        // 2.
        Book book = new Book();
        book.printInfo();
        // 3.
        Constr_per per = new Constr_per("I", "A", 44);
        Constr_per per1 = new Constr_per("I000", "A000", 444);
        System.out.println();
        // 4.
        Constr_fruit fruit = new Constr_fruit("Banana", "Yellow", 35.68);
        System.out.println();
        Constr_fruit fruit1 = new Constr_fruit("Kiwi", "Green", 95.68);

    }
}
