package ChirilBortnicov.Lesson1907.Inheritance;

public class Runner {
    public static void main(String[] args) {
        Student student = new Student("Chiril", 30, "empty", 2, "QA");
        student.setName("Remember");
        System.out.println(student.getName());
    }
}
