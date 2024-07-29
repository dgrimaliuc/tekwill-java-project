package SergheiRubailo.Task12;

public class Runner {
    public static void main(String[] args) {

        Employee employeeFullTime = new FullTimeEmployee();
        Employee employeePartTime = new PartTimeEmployee();

        employeeFullTime.calculateSalary();
        employeePartTime.calculateSalary();

        Book book = new Book("Tales", "People", 12.34);
        Magazine magazine = new Magazine("Magazine", "Bill Gates");

        book.print();
        magazine.print();
    }
}
