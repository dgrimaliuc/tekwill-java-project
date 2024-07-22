package IngaTitchiev.HW1907;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Cars initialisations and display");
        Cars car = new Cars("Opel", "Vectra", 2005);

        car.printDetails();
        car.setMake("Nissan");
        car.setModel("Qashqai");
        car.setYear(2018);
        car.printDetails();

        System.out.println("Emploees initialisations and display");
        Employee employee = new Employee(100, "Ala Botnaru", 15000);

        employee.printDetails();
        employee.setEmployeeID(101);
        employee.setName("Ion Popa");
        employee.setSalary(20000);
        employee.printDetails();
    }
}
