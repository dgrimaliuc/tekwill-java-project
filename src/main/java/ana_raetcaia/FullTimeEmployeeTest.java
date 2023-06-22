package ana_raetcaia;

public class FullTimeEmployeeTest {
    public static void main(String[] args) {
        Employee fullTimeObj = new FullTimeEmployee(786);
        System.out.println("Full time salary: " + fullTimeObj.calculateSalary());

    }
}
