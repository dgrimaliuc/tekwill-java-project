package ana_raetcaia;

public class VehicleTest {
    public static void main (String[]args){
        Vehicle carObj = new Car();
        Vehicle motorcycleObj = new Motorcycle();
        Vehicle busObj = new Bus();
        carObj.startEngine();
        motorcycleObj.startEngine();
        busObj.startEngine();
        System.out.println(carObj);
        System.out.println(motorcycleObj);
        System.out.println(busObj);

    }
}
