package main.java.georgeVinaga;

public class MainClassWork_20_12_2024 {
//    public static void main(String[] args) {
//        PersonClassWork_20_12_2024 person1 = new PersonClassWork_20_12_2024(); // Codu lucreaza cu codul din fisierul PersonClassWork_20_12_2024
//        PersonClassWork_20_12_2024 person2 = new PersonClassWork_20_12_2024();
//        PersonClassWork_20_12_2024 person3 = new PersonClassWork_20_12_2024();
//        person1.printInfo();
//        person2.printInfo();
//        person3.printInfo();
//    }


    // Aceeasi insarcinare, doar ca folosim constructor
    public static void main(String[] args) {
        PersonClassWork_20_12_2024 person1 = new PersonClassWork_20_12_2024("Denis", "Smith", 20); // Codu lucreaza cu codul din fisierul PersonClassWork_20_12_2024
        PersonClassWork_20_12_2024 person2 = new PersonClassWork_20_12_2024("John", "Stors", 42);
        PersonClassWork_20_12_2024 person3 = new PersonClassWork_20_12_2024("Michel", "Obama", 54);
        person1.printInfo();
        person2.printInfo();
        person3.printInfo();
    }

}
