package main.java.lilia_toma;

public class Method_Car {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMarca("Toyota");
        car.setModel("Corolla");
        car.setAn(2020);

        System.out.println(car.getMarca());
        System.out.println(car.getModel());
        System.out.println(car.getAn());
    }
}
