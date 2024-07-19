package RevaSadovnicova;

public class Animal {
    private String name;
    private String type;
    private Integer age;
    private String sound;

    public Animal(String name,String type,Integer age, String sound){
        this.name = name;
        this.type = type;
        this.age = age;
        this.sound = sound;
    }

    public void makeSound(){
        System.out.println(sound);
    }

    public void displayInfo(){
        System.out.println(name + " " + type + " " + age);
    }
}
