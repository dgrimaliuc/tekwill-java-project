package main.java.denis_grimaliuc.inheritance;

import main.java.denis_grimaliuc.interfaces.IEmployee;

public class Manager extends Employee implements IEmployee {
    public Manager(double id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void calculateBonus() {
        // Logic to calculate bonus for a developer
        System.out.println("Calculating bonus for developer.");
        double result = getSalary() * 0.15 + getSalary();
        setSalary(result);

    }
}
