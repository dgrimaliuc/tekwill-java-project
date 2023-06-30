package serghei_condrasov.abstraction;

/*3. Create two subclasses of Employee, such as "PartTimeEmployee"
and implement the "calculateSalary" method differently in each subclass.*/

public class PartTimeEmployee extends Employee {
    @Override
    public void calculateSalary() {
        System.out.println("Part time employees salary = " + 4000 + " MDL");
    }
}
