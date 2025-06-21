package main.java.Magda_Petrachi.interfata;

public class Interface_OOP {
    public static void main(String[] args) {
        System.out.println("Cartea sau revista este:");

        Printable[] items = new Printable[]{
                new Book("Fluturi", "Eminescu", 12.99),
                new Magazine("Vogue", "Nu știu")
        };

        for (Printable item : items) {
            item.print();
        }
        
        abstractEmployee Employee1 = new PartTimeEmployee(10);
        abstractEmployee Employee2 = new FullTimeEmployee(20);
        
        System.out.println("Salariu part time este " + Employee1.calculateSalary());
        System.out.println("Salariu full time este " + Employee2.calculateSalary());

    }
}
