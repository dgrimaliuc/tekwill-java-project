package RevaSadovnicova;

public abstract class Employee2 {
    abstract float calculateSalary();
}

class FullTimeEmployee2 extends Employee2{
    float calculateSalary() {
        return 20;
    }
}

class PartTimeEmployee2 extends Employee2{
    float calculateSalary() {
        return 40;
    }
}
