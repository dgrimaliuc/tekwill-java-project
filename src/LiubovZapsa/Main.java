package LiubovZapsa;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        HashSet<String> names = new HashSet<String>();
        names.add("Mark");
        names.add("Jane");
        names.add("Kris");
        names.add("Tom");
        names.size();
        for (String name : names) {
            System.out.println(name);
        }

    }
}









