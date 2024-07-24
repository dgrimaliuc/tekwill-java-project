package AnastasiaGoncear.Lesson6AnastasiaGoncear.Inheritance;

public class Student extends Person {

    private String studentID;
    private String grade;

    public Student(String name, int age, String address, String studentID, String grade) {
        super(name, age, address);
        this.studentID = studentID;
        this.grade = grade;
    }

    public void printInfo() {
        System.out.println("Name " + getName());
        System.out.println("Age " + getAge());
        System.out.println("Address " + getAddress());
        System.out.println("StudentID " + studentID);
        System.out.println("Grade " + grade);
    }

}
