package main.java.denisGrimaliuc.lect8;

import java.util.List;

/*
Creează o clasă numită “StringUtils” cu o metodă supraincarcată pentru concatenare.
Implementează metode care pot concatena două șiruri de caractere,
trei șiruri de caractere și un list de șiruri de caractere.
 */
public class StringUtils {

    public String concat(String a, String b) {
        return a + b;
    }

    public String concat(String a, String b, String c) {
        return a + b + c;
    }

    public String concat(List<String> strings) {
        String sum = "";
        for (String i : strings) {
            sum += i;
        }
        return sum;

    }
}
