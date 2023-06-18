package Leas_Liudmila.inheritance;

public class ManagerMain {
    public static void main(String[] args){
        Manager appleManager = new Manager(1, "Tim Cook",100000, "CEO", 164000);
        System.out.println(appleManager.getId() + " " + appleManager.getName() + " " + appleManager.getSalary() + " "
                + appleManager.getDepartment() + " " + appleManager.getNumberOfEmployees());
    }
}
