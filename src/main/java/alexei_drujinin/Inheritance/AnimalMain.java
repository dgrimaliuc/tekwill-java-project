package alexei_drujinin.Inheritance;

import java.util.ArrayList;

public class AnimalMain {
    public static void main(String[] args) {
        Dog doberman = new Dog("Doberman",25,"Graf",3,"Gav-Gav");
        System.out.println(doberman.getBreed()+ " : " +doberman.getName() +" : "+ doberman.getAge() + " : " + doberman.getWeight() + " : " + doberman.getSound()   );

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(doberman);

        Dog labrador = new Dog("labrador", 20, "Shelly", 5, "Gav");
        dogs.add(labrador);

        Dog husky = new Dog("husky", 17, "Djekky", 2, "Gav");
        dogs.add(husky);

        for (var doggy : dogs ) {
            System.out.println(doggy.getBreed()+ " : " +doggy.getName() +" : "+ doggy.getAge() + " : " + doggy.getWeight() + " : " + doggy.getSound()   );

        }
    }
}
