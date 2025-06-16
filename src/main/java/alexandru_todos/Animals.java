package main.java.alexandru_todos;

public class Animals {
    String name;
    int age;
    String sound;

    Animals(String name, int age, String sound){
        this.name = name;
        this.age = age;
        this.sound = sound;
    }
    public void getInfo(){
        System.out.println("Animal name: " + name + ", age: " + age + ", animal sound: " + sound);
    }
}
