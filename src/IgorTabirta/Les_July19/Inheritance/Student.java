package IgorTabirta.Les_July19.Inheritance;

public class Student extends Person {
    private int id;
    private int grade;


    public Student(String name, int age, String address, int id, int grade) {
        super(name, age, address);
        this.id = id;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public int getGrade() {
        return grade;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println(id);
        System.out.println(grade);

    }

}
