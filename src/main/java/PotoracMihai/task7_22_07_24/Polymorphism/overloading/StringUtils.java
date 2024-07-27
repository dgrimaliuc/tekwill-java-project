package main.java.PotoracMihai.task7_22_07_24.Polymorphism.overloading;

public class StringUtils {

    public static void main(String[] args) {
        StringUtils stringUtils = new StringUtils();
        System.out.println(stringUtils.concatenate("Hello", " World"));
        System.out.println(stringUtils.concatenate("Hello", " World", "!!!"));
        System.out.println(stringUtils.concatenate(new String[]{"Hello", "World", " !!!"}));
    }

    public String concatenate(String a, String b) {
        return a + b;
    }

    public String concatenate(String a, String b, String c) {
        return a + b + c;
    }

    public String concatenate(String[] strings) {
        StringBuilder result = new StringBuilder();

        for (String string : strings) {
            result.append(string);
        }
        return result.toString();
    }

}

