package RevaSadovnicova.inheritance;

import RevaSadovnicova.Animal;

public class Dog extends Animal {
    private String breed;
    private Integer weight;

    public Dog (String breed,Integer weight,String name,Integer age, String sound){
        super(name, age, sound);
        this.breed = breed;
        this.weight = weight;
    }
}
