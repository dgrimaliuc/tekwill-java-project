package main.java.iuliaNamolovan.hm7;

public class main1 {
    public static void main(String[] args) {
        DepozitAccount DA1 = new DepozitAccount("IB", 22.5, 20030, 300.5, 1.00);
        DepozitAccount DA2 = new DepozitAccount("DN", 12.4, 30000, 200.5, 1.00);
        System.out.println("\nDepozitul nr 1 info:" + DA1);
        System.out.println("\nDepozitul nr 2 info:" + DA2);
    }
}
