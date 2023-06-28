package alexandr_samohvalov.Encapsulation;

public class CarMain {
    public static void main(String[] args) {
        Cars myObj = new Cars();
        Cars myObj1 = new Cars();
        Cars myObj2 = new Cars();
        myObj.setMake("Reno");
        System.out.println("Car name " + myObj.getMake());
        myObj1.setModel("VC21");
        System.out.println("Model " + myObj1.getModel());
        myObj2.setYear(1992);
        System.out.println("Year "+ myObj2.getYear());
    }

}
