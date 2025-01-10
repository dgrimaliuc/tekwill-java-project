package main.java.LiliaRosca.encapsulation_inheritance.HW;

// HW Ex 4-5 moștenește de la Employee + numele școlii și durata stagiului

public class Intern extends Employee {
    String almaMater;
    Double stagingPeriod;

    Intern(String fullName, int age, String address, int idEmployee, Double salary, String almaMater, Double stagingPeriod) {
        super(fullName, age, address, idEmployee, salary);
        this.almaMater = almaMater;
        this.stagingPeriod = stagingPeriod;
    }

    @Override
    public String toString() {
        return "Intern{" +
                "fullName = '" + fullName + '\'' +
                ", age = " + age +
                ", address = '" + address + '\'' +
                ", idEmployee = " + idEmployee +
                ", salary = " + salary +
                ", almaMater = '" + almaMater + '\'' +
                ", stagingPeriod = " + stagingPeriod +
                '}';
    }
}
