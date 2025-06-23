package main.java.denis_grimaliuc.inheritance;


/**
 * Creează o clasă abstractă numită “Employee2” cu o metodă abstractă numită “calculateSalary” si o variabila salaryPerHour.
 * Creează două subclase ale clasei Employee, cum ar fi “FullTimeEmployee” și “PartTimeEmployee”, și implementează metoda
 * “calculateSalary” diferit în fiecare subclasă.
 * Hint: Dupa logica FullTimeEmployee salary = salaryPerHour * 8 si PartTimeEmployee salary = salaryPerHour * 4
 */
public abstract class Employee2 {

    double salaryPerHour;


    Employee2(double salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public abstract double calculateSalary();
}
