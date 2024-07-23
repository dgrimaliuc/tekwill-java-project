package LiubovZapsa;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<String, Integer>();
        people.put("John Doe", 5551234);
        people.put("Jane Smith", 5555678);
        people.put("Emily Johnson", 5558765);
        people.put("Michael Brown", 5554321);
        for (String key : people.keySet()) {
            System.out.println(key + " : " + people.get(key));
        }
    }
}








