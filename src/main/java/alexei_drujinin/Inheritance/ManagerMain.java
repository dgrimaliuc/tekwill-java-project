package alexei_drujinin.Inheritance;

public class ManagerMain {
    public static void main(String[] args) {
        Manager Manager1 = new Manager("general manager",2300,4,"Elon Musk",100000);
        System.out.println(Manager1.getEmployeeId()+": "+Manager1.getName()+", "+Manager1.getDepartment()+", "+Manager1.getNumberOfEmployees()+", "+Manager1.getSalary());

    }
}
