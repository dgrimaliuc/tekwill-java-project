package Leas_Liudmila.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GradeBook {

    private String fileName = "files/gradesbook.csv";

    public void saveStudent(Student studentToSave) {

        String studentInCsv = convertStudentToCsvLine(studentToSave);

        try {

            File path = new File(fileName);
            if(path.exists() == false) {
                path.createNewFile();
            }

            FileWriter fw = new FileWriter(fileName, true);

            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(studentInCsv);
            bw.newLine();

            bw.close();
            fw.close();
        } catch (IOException e) {
            System.out.println("Unable to save in CSV: " + studentInCsv);
        }
    }

    public ArrayList<Student> loadStudents() throws IOException {

        File path = new File(fileName);
        if(path.exists() == false) {
            throw new IOException("File not found or not exists: " + fileName);
        }

        ArrayList<Student> result = new ArrayList<Student>();

        Scanner read = new Scanner(path);

        while (read.hasNextLine()) {
            String csvStudent = read.nextLine();

            if(csvStudent.length() > 1) {
                Student loadedStudent = new Student(csvStudent);
                result.add(loadedStudent);
            }
        }
        read.close();

        return result;
    }

    public Student loadStudent(int index) throws IOException {

        File path = new File(fileName);
        if(path.exists() == false) {
            throw new IOException("File not found or not exists: " + fileName);
        }

        Student result = null;

        Scanner read = new Scanner(path);
        int currentLineIndex = 0;

        while (currentLineIndex <= index && read.hasNextLine()) {
            String csvStudent = read.nextLine();

            if(currentLineIndex++ != index) {
                continue;
            }
            System.out.println(csvStudent);


            if(csvStudent.length() > 1) {
                result = new Student(csvStudent);
            }
        }
        read.close();

        return result;
    }

    private String convertStudentToCsvLine(Student student) {
        String studentInCsv = "";

        studentInCsv += student.getId() + ",";
        studentInCsv += student.getFirstName() + ",";
        studentInCsv += student.getLastName() + ",";

        for (int grade : student.getGrades()) {
            studentInCsv += grade + ",";
        }
        studentInCsv = studentInCsv.substring(0, studentInCsv.length() - 1);

        return studentInCsv;
    }


}
