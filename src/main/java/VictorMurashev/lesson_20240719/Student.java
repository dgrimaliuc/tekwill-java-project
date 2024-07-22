package VictorMurashev.lesson_20240719;

public class Student extends Person {
    private String studentID;
    private String grade;

    public Student(String name, int age, String address, String studentID, String grade) {
        super(name, age, address);
        this.studentID = studentID;
        this.grade = grade;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getGrade() {
        return grade;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}