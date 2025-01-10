package main.java.LunguSergiu.HomeTask08;

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Meow! Meow!");
    }
}
