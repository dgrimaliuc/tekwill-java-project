package Leas_Liudmila.files;

import java.util.ArrayList;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private ArrayList<Integer> grades;

    public Student(int id, String firstName, String lastName, ArrayList<Integer> grades) {
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setGrades(grades);
    }

    public Student(String inputLine) {
        String[] inputs = inputLine.split(",");

        int id = Integer.parseInt(inputs[0].trim());
        String firstName = inputs[1];
        String lastName = inputs[2];

        ArrayList<Integer> gradesLocal = new ArrayList<>();
        for(int i = 3; i < inputs.length; i++) {
            int grade = Integer.parseInt(inputs[i].trim());
            gradesLocal.add(grade);
        }

        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setGrades(gradesLocal);
    }

    public String toString() {
        return this.getId() + " " + this.getFirstName() + " "
                + this.getLastName() + " " + this.getGrades().toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }
}
