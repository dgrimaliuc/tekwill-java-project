package main.java.Magda_Petrachi.mostenire;

import main.java.Magda_Petrachi.MP_car;

public class MP_OOP {
    public static void main(String[] args) {
        MP_Student student1 = new MP_Student("Niko", "Str. Ungheni 6/4", 22, 74354, 7.8);
        MP_Student student2 = new MP_Student("Pavel", "Florilor 12/3", 20, 43525, 8.8);
        System.out.println(student1);
        System.out.println(student2);
    }

    public class Vehicle {
        public static void main(String[] args) {
            MP_Vehicle vehicle1 = new MP_Vehicle();
            MP_car vehicle2 = new MP_car();
            MP_Motorcycle vehicle3 = new MP_Motorcycle();
            MP_Truck vehicle4 = new MP_Truck();

            System.out.println(vehicle1);
            System.out.println(vehicle2);
            System.out.println(vehicle3);
            System.out.println(vehicle4);
        }
    }
}
