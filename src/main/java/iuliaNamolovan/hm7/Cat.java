package main.java.iuliaNamolovan.hm7;

class Cat extends Animal {
    String Species;
    Double Weight;

    Cat(String n, int a, String s, String sp, Double wg) {
        super(n, a, s);
        this.Species = sp;
        this.Weight = wg;
    }

    public String toString() {
        return "Cat{" +
                "Name='" + name + '\'' +
                ", Age=" + age +
                ", Sound=" + sound +
                ", Species=" + Species +
                ", Weight=" + Weight +
                '}';
    }
}
