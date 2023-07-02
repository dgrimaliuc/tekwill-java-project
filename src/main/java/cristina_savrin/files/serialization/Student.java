package cristina_savrin.files.serialization;

import java.io.Serializable;
import java.util.Arrays;

public class Student implements Serializable {

    int[] grades;
    private int id;
    private String name, lastName;

    public Student(int id, String name, String lastName, int[] grades) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.grades = grades;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }
}