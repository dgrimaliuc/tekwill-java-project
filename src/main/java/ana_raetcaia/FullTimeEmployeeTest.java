package ana_raetcaia;

import ana_raetcaia.task_six.Employee;

public class FullTimeEmployeeTest {
    public static void main(String[] args) {
        Employee fullTimeObj = new FullTimeEmployee(786);
        System.out.println("Full time salary: " + fullTimeObj.calculateSalary());

    }
}
