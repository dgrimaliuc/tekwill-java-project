package RevaSadovnicova;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

    }

    void Task4_1(){
        ArrayList<String> fruts = new ArrayList<>();
        fruts.add("banana");
        fruts.add("apple");
        fruts.add("tomato");

        for(String frut: fruts){
            System.out.println(frut);
        }
    }

    void Task4_2(){
        HashSet<String> names= new HashSet<>();
        names.add("riva");
        names.add("ovi");
        names.add("keila");

        System.out.println( names.size());

        if(!names.contains("katia")){
            System.out.println(" i did it");
        }
    }

    void Task4_3(){
        HashMap<String,String> countries= new HashMap<>();
        countries.put("MD","moldova");
        countries.put("UK","united kingdom");
        countries.put("DE","germany");

        for( String k: countries.keySet()){
            System.out.println(k + " " +countries.get(k));
        }
    }

    void Task4_4(){
        Map<String, Integer> studentScores1 = new HashMap<>();
        studentScores1.put("Evelina", 85);
        studentScores1.put("Bob", 92);
        studentScores1.put("Charlie", 78);
        studentScores1.put("David", 95);

        Map<String, Integer> studentScores2 = new HashMap<>();
        studentScores2.put("Eve", 89);
        studentScores2.put("Frank", 81);
        studentScores2.put("Alice", 91); // Duplicate name with different score
        studentScores2.put("George", 87);

        Map<String,Integer> results = new HashMap<>();
        for( String k: studentScores1.keySet()){
            if(studentScores1.get(k)>90){
                results.put(k,studentScores1.get(k));
            }
        }
        for( String k: studentScores2.keySet()){
            if(studentScores2.get(k)>90){
                results.put(k,studentScores2.get(k));
            }
        }
        System.out.println(results);
    }

    void Task3_1 () {
        int count = 55;
        int sum = 0;
        do {
            sum += count;
            count++;
        }
        while (count < 112) ;
        System.out.println("sum of number from 55 to 111 = "+ sum);
    }

    void Task3_2 () {
        int sum=0;
        for (int i = 1; i <= 100 ; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    void Task3_3 () {
        float[] a = {1,2,4,7,9,8} ;
        float sum=0;
        for (float i: a) {
            sum += i;
        }
        System.out.println(sum / a.length);
    }
}

