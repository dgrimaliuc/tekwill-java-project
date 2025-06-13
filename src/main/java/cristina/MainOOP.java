package main.java.cristina;

public class MainOOP {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "Delly Doe";
        student1.age = 21;
        student1.mark = 8.10;
        student1.StudentID = 123468123;
        student1.printInfo();
        Student student2 = new Student();
        student2.name = "John Doe";
        student2.age = 21;
        student2.mark = 9.10;
        student2.StudentID = 234568123;
        student2.printInfo();

        Fruit fruit1 = new Fruit();
        fruit1.name = "Zamos";
        fruit1.calorii = 21;
        fruit1.color = "galben";
        fruit1.printInfo();
        Fruit fruit2 = new Fruit();
        fruit2.name = "Mar";
        fruit2.calorii = 21;
        fruit2.color = "rosu";
        fruit2.printInfo();

        Animal animal1 = new Animal();
        animal1.name = "Pisica";
        animal1.varsta = 2;
        animal1.tip = "Carnivor";
        animal1.sunet = "Miau";
        animal1.printInfo();
        Animal animal2 = new Animal();
        animal2.name = "Vaca";
        animal2.varsta = 2;
        animal2.tip = "Ierbivor";
        animal2.sunet = "Muu";
        animal2.printInfo();


    }
}
