package main.java.LunguSergiu.HomeTask08;

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Woof! Woof!");
    }
}
