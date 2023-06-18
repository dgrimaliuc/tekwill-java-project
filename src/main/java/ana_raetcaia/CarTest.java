package ana_raetcaia;

public class CarTest {
   public static void main (String[]args){

       Car myObj = new Car("Toyota", "C-HR", 2020);

       System.out.println("Brand of car: " + myObj.getBrand());
       System.out.println("Model of car: " + myObj.getModel());
       System.out.println("Year of car: " + myObj.getYear());
   }
}
