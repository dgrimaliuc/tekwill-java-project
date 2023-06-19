package Leas_Liudmila.encapsulation;

public class ProductMain {
    public static void main(String[] args) {
        Product videoGame = new Product();
        videoGame.setId(666);
        videoGame.setName("Diablo 4");
        videoGame.setPrice(69.99f);

        Product videoGame2 = new Product();
        videoGame2.setId(123);
        videoGame2.setName("Resident Evil");
        videoGame2.setPrice(39.99f);

        System.out.println(videoGame.getId() + " | " + videoGame.getName() + "\t\t | " + videoGame.getPrice());
        System.out.println(videoGame2.getId() + " | " + videoGame2.getName() + "\t | " + videoGame2.getPrice());
    }
}
