package VictorMurashev.lesson_20240719;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30, "Florilor");
        Student student = new Student("Boris", 20, "Zelinski", "S12345", "Sophomore");

        System.out.println(person);
        System.out.println(student);
    }
}
