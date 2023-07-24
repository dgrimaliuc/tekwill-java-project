package mirela_b.reflection_annotations;

public class MainBox {
    public static void main(String[] args) {
        Box<String, Integer> box = new Box<>();

        box.addPair("CARS", 2);
        box.addPair("HOUSES", 4);
        box.addPair("MONEY", 67);
        box.addPair("CARS", 22);
        box.addPair("POOL", 56);
        box.addPair("CARS", 10);

        System.out.println(box.getPair("POOL"));
    }
}
