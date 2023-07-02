package anna_gontari.Encapsulation;

public class TestingEncapsulation {
    public static void main(String[] args) {
        Car car1 = new Car ("Germany","BMW", 2021);
        System.out.println(car1.getMake() + " : " + car1.getModel() + " : " + car1.getYear());

        Employee employee1 = new Employee(2001251254,"Markus", 150);
        System.out.println(employee1.getid() + " : " + employee1.getName() + " : " + employee1.getSalary());

        Product product1 = new Product(315875, "Hair Mask Intense Hydration", 20);
        System.out.println(product1.getID() + " : " + product1.getName() + " : " + product1.getPrice());
    }
}
