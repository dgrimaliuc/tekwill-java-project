package main.java.LunguSergiu.HomeTask08;

class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Piu! Piu!");
    }
}
