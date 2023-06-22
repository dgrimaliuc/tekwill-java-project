package ana_raetcaia;

public class PartTimeEmployeeTest {
    public static void main (String[]args){
        Employee parttimEObj = new PartTimeEmployee(43,20);
        System.out.println("Part time salary: " + parttimEObj.calculateSalary());
    }
}
