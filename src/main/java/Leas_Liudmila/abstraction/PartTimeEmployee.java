package Leas_Liudmila.abstraction;

public class PartTimeEmployee extends EmployeeAbstract{

    private double hourRate;
    private double hoursWorked;

    public PartTimeEmployee(double hourRate){
        this.hourRate = hourRate;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {

        return hourRate * hoursWorked - (hourRate * hoursWorked * TAX);
    }


}
