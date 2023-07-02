package Leas_Liudmila.abstraction;

public class FullTimeEmployee extends EmployeeAbstract {

    private double bruttoSalary;

    public FullTimeEmployee(double bruttoSalary) {
        this.bruttoSalary = bruttoSalary;
    }

    @Override
    public double calculateSalary() {

        return (bruttoSalary) - (bruttoSalary * TAX);
    }

}
