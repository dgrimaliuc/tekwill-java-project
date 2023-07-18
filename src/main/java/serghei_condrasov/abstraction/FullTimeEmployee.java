package serghei_condrasov.abstraction;

/*3. Create two subclasses of Employee, such as "FullTimeEmployee"
and implement the "calculateSalary" method differently in each subclass.*/

public class FullTimeEmployee extends Employee{
    @Override
    public void calculateSalary() {
        System.out.println("Full time employees salary = " + 10000 + " MDL");
    }
}
