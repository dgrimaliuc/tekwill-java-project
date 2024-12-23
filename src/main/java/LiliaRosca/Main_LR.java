package main.java.LiliaRosca;

public class Main_LR {
    // class work 20.12
    /*int x = 5;
    int y = 35;
    final int z = 15; // final = constanta ca esenta - valoarea nu poate fi modificata, la modificare va da eroare
    String fname = "Jack";
    String lname = "Jones";
    int age = 45;*/

    public static void main(String[] args) {
        // HW Ex. 1 LR_Book
        /*LR_Book book1 = new LR_Book("Title1", "Author1", 2024, 12.5);
        LR_Book book2 = new LR_Book("Title2", "Author2", 2034, 52.75);
        book1.printInfoB();
        book2.printInfoB();*/

        // HW Ex. 2 LR_Student
        LR_Student student1 = new LR_Student("Nume1", 20, 8, 11);
        LR_Student student2 = new LR_Student("Nume2", 18, 9, 124);
        student1.printInfoS();
        student2.printInfoS();
    }
}