package ChirilBortnicov.Lesson1907.Inheritance;

public class Student extends Person {

    private int studentID;
    private String grade;

    public Student(String name, int age, String address, int studentID, String grade) {
        super(name, age, address);
        this.studentID = studentID;
        this.grade = grade;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
