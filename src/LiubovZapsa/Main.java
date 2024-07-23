package LiubovZapsa;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> linkedlist = new LinkedList<>(Arrays.asList("My", "curs", "is", "Java"));
        System.out.println("Before sorting:" + linkedlist);
        Collections.sort(linkedlist);
        System.out.println("After sorting:" + linkedlist);
        Collections.shuffle(linkedlist);
        System.out.println("After sorting:" + linkedlist);

    }
}







