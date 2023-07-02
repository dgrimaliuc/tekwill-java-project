package Leas_Liudmila.files;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class StudentMain {
    public static void main(String[] args) {


        GradeBook gb = new GradeBook();

        Student daisy = new Student(1, "Daisy", "Williams", new ArrayList<>(Arrays.asList(9, 8, 7, 6, 5, 4, 7, 8, 9)));

        gb.saveStudent(daisy);

        Student deborah = new Student(2, "Deborah", "Harris", new ArrayList<>(Arrays.asList(10, 9, 10, 9, 8)));

        gb.saveStudent(deborah);

        Student ron = new Student(3, "Ron", "Thomas", new ArrayList<>(Arrays.asList(7, 9, 7, 8, 9, 7)));

        gb.saveStudent(ron);

        Student mark = new Student(4, "Mark", "Robinson", new ArrayList<>(Arrays.asList(9, 10, 8, 9, 10, 8)));

        gb.saveStudent(mark);

        ArrayList<Student> catalogueOfStudents = new ArrayList<>();
        try {
            catalogueOfStudents = gb.loadStudents();
            for(Student loadedStudent : catalogueOfStudents) {
                System.out.println(loadedStudent);
            }

            Student singleStudent = gb.loadStudent(3);

        } catch (IOException e) {
            System.out.println("File does not exists, sorry");
        }





    }
}
