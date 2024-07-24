package SergheiRubailo.Task9.Inheritance;

public class Student extends Person {

    private int studentId;
    private String grade;

    public Student(String name, int age, String address, int studentId, String grade) {
        super(name, age, address);
        this.studentId = studentId;
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void showInfo() {
        System.out.println("Name " + getName() + ", Address: " + getAddress() + ", Age: " + getAge() + ", StudentID: " + getStudentId() + ", Grade: " + getGrade());
    }
}
